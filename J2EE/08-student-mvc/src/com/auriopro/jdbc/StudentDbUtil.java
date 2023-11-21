package com.auriopro.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.auriopro.model.Student;

public class StudentDbUtil {
	private DataSource datasource;

	public StudentDbUtil(DataSource datasource) {
		this.datasource = datasource;
	}

	public List<Student> getAllStudents() throws SQLException {
		List<Student> students = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet result = null;

		try {

			conn = datasource.getConnection();
			String sql = "select * from student";
			stmt = conn.createStatement();
			result = stmt.executeQuery(sql);
			while (result.next()) {
				int id = result.getInt("student_id");
				String firstname = result.getString("first_name");
				String lastname = result.getString("last_name");
				String email = result.getString("email");

				Student tempStudent = new Student(id, firstname, lastname, email);
				students.add(tempStudent);
			}
			return students;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, stmt, result);
		}
		return students;

	}

	private void close(Connection conn, Statement stmt, ResultSet result) throws SQLException {
		if (conn != null) {
			conn.close();
		}
		if (stmt != null) {
			stmt.close();
		}
		if (result != null) {
			result.close();
		}

	}

	public void addNewStudents(Student stud) {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = datasource.getConnection();
			String sql = "insert into student (first_name, last_name, email)values(?,?,?)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, stud.getFirstName());
			stmt.setString(2, stud.getLastName());
			stmt.setString(3, stud.getEmail());
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				close(conn, stmt, null);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public Student getStudentById(int id) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		Student tempStudent = null;
		try {

			conn = datasource.getConnection();
			String sql = "select * from student where student_id=?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			result = stmt.executeQuery();
			if (result.next()) {

				String firstname = result.getString("first_name");
				String lastname = result.getString("last_name");
				String email = result.getString("email");

				tempStudent = new Student(id, firstname, lastname, email);

			}
			return tempStudent;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tempStudent;
	}

	public void updateStudents(Student stud) {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = datasource.getConnection();
			String sql = "update student set first_name=?, last_name=?, email=? where student_id=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, stud.getFirstName());
			stmt.setString(2, stud.getLastName());
			stmt.setString(3, stud.getEmail());
			stmt.setInt(4, stud.getId());
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				close(conn, stmt, null);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void deleteStudent(int id) {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = datasource.getConnection();
			String sql = "DELETE FROM student WHERE student_id = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				close(conn, stmt, null);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public List<Student> getStudentsByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}



}