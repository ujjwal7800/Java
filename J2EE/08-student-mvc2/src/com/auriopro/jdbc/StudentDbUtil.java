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

//	public void addNewStudents(Student stud) {
//		Connection conn = null;
//		PreparedStatement stmt = null;
//		try {
//			conn = datasource.getConnection();
//			String sql = "insert into student (first_name, last_name, email)values(?,?,?)";
//			stmt = conn.prepareStatement(sql);
//			stmt.setString(1, stud.getFirstName());
//			stmt.setString(2, stud.getLastName());
//			stmt.setString(3, stud.getEmail());
//			stmt.execute();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				close(conn, stmt, null);
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//
//	}
	
	public void addNewStudent(Student student) throws SQLException {
	    Connection connection = null;
	    PreparedStatement statement = null;

	    try {
	        connection = datasource.getConnection();
	        connection.setAutoCommit(false); // Start a transaction

	        String sql = "INSERT INTO students (first_name, last_name, email) VALUES (?, ?, ?)";
	        statement = connection.prepareStatement(sql);
	        statement.setString(1, student.getFirstName());
	        statement.setString(2, student.getLastName());
	        statement.setString(3, student.getEmail());
	        statement.executeUpdate();

	        connection.commit(); // Commit the transaction
	    } catch (SQLException e) {
	        if (connection != null) {
	            connection.rollback(); // Rollback the transaction in case of an error
	        }
	        throw e; // Re-throw the exception for proper error handling
	    } finally {
	        close(connection, statement, null);
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

	// public void updateStudents(Student stud) {
	// Connection conn = null;
	// PreparedStatement stmt = null;
	// try {
	// conn = datasource.getConnection();
	// String sql = "update student set first_name=?, last_name=?, email=? where
	// student_id=?";
	// stmt = conn.prepareStatement(sql);
	// stmt.setString(1, stud.getFirstName());
	// stmt.setString(2, stud.getLastName());
	// stmt.setString(3, stud.getEmail());
	// stmt.setInt(4, stud.getId());
	// stmt.execute();
	// } catch (SQLException e) {
	// e.printStackTrace();
	// } finally {
	// try {
	// close(conn, stmt, null);
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
	//
	// }

	public void updateStudent(Student stud) {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = datasource.getConnection();
			conn.setAutoCommit(false); // Disable auto-commit
			String sql = "update student set first_name=?, last_name=?, email=? where student_id=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, stud.getFirstName());
			stmt.setString(2, stud.getLastName());
			stmt.setString(3, stud.getEmail());
			stmt.setInt(4, stud.getId());
			stmt.executeUpdate(); // Use executeUpdate to update data
			conn.commit(); // Commit the transaction
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback(); // Rollback in case of an error
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		} finally {
			try {
				conn.setAutoCommit(true); // Enable auto-commit
				close(conn, stmt, null);
			} catch (SQLException e) {
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

	public List<Student> searchStudentsByName(String searchQuery) throws SQLException {
		List<Student> students = new ArrayList<>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conn = datasource.getConnection();
			String sql = "SELECT * FROM student WHERE first_name LIKE ? OR last_name LIKE ?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, "%" + searchQuery + "%");
			stmt.setString(2, "%" + searchQuery + "%");
			rs = stmt.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("student_id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String email = rs.getString("email");

				Student student = new Student(id, firstName, lastName, email);
				students.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, stmt, rs);
		}

		return students;
	}

	public List<Student> getStudentsByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addNewStudents(Student stud) {
		// TODO Auto-generated method stub
		
	}

}