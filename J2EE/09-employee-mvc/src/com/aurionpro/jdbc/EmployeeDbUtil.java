
package com.aurionpro.jdbc;

import com.aurionpro.model.Employee;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class EmployeeDbUtil {
	private DataSource dataSource;

	public EmployeeDbUtil(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Employee> getAllEmployee() {
		List<Employee> employees = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet result = null;

		try {
			conn = dataSource.getConnection();
			String sql = "SELECT id, first_name, last_name, email, gender, dob, job_title, department FROM employee";

			stmt = conn.createStatement();
			result = stmt.executeQuery(sql);

			while (result.next()) {
				int id = result.getInt("id");
				String firstName = result.getString("first_name");
				String lastName = result.getString("last_name");
				String email = result.getString("email");
				String gender = result.getString("gender");
				Date dob = result.getDate("dob");
				String jobTitle = result.getString("job_title");
				String department = result.getString("department");

				Employee tempEmployee = new Employee(id, firstName, lastName, email, gender, dob.toString(), jobTitle,
						department);
				employees.add(tempEmployee);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(conn, stmt, result);
		}

		return employees;
	}

	public void addNewEmployee(Employee employee) {
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = dataSource.getConnection();

			String sql = "INSERT INTO employee (first_name, last_name, email, gender, dob, job_title, department) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?)";

			stmt = conn.prepareStatement(sql);

			stmt.setString(1, employee.getFirstName());
			stmt.setString(2, employee.getLastName());
			stmt.setString(3, employee.getEmail());
			stmt.setString(4, employee.getGender());
			stmt.setDate(5, Date.valueOf(employee.getDob()));
			stmt.setString(6, employee.getJobTitle());
			stmt.setString(7, employee.getDepartment());

			stmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(conn, stmt, null);
		}
	}

	public void updateEmployee(Employee employee) {
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = dataSource.getConnection();

			String sql = "UPDATE employee "
					+ "SET first_name=?, last_name=?, email=?, gender=?, dob=?, job_title=?, department=? "
					+ "WHERE id=?";

			stmt = conn.prepareStatement(sql);

			stmt.setString(1, employee.getFirstName());
			stmt.setString(2, employee.getLastName());
			stmt.setString(3, employee.getEmail());
			stmt.setString(4, employee.getGender());
			stmt.setDate(5, Date.valueOf(employee.getDob()));
			stmt.setString(6, employee.getJobTitle());
			stmt.setString(7, employee.getDepartment());
			stmt.setInt(8, employee.getId());

			stmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(conn, stmt, null);
		}
	}

	public void deleteEmployee(int id) {
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = dataSource.getConnection();

			String sql = "DELETE FROM employee WHERE id=?";

			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);

			stmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(conn, stmt, null);
		}
	}

	public Employee getEmployeeById(int id) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		Employee employee = null;

		try {
			conn = dataSource.getConnection();

			String sql = "SELECT * FROM employee WHERE id=?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);

			result = stmt.executeQuery();

			if (result.next()) {
				String firstName = result.getString("first_name");
				String lastName = result.getString("last_name");
				String email = result.getString("email");
				String gender = result.getString("gender");
				Date dob = result.getDate("dob");
				String jobTitle = result.getString("job_title");
				String department = result.getString("department");

				employee = new Employee(id, firstName, lastName, email, gender, dob.toString(), jobTitle, department);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(conn, stmt, result);
		}

		return employee;
	}

	public List<Employee> searchEmployees(String searchCriteria, String searchTerm) {
		List<Employee> employees = new ArrayList<>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;

		try {
			conn = dataSource.getConnection();

			String sql = "SELECT id, first_name, last_name, email, gender, dob, job_title, department FROM employee WHERE "
					+ searchCriteria + " LIKE ?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, "%" + searchTerm + "%");

			result = stmt.executeQuery();

			while (result.next()) {
				int id = result.getInt("id");
				String firstName = result.getString("first_name");
				String lastName = result.getString("last_name");
				String email = result.getString("email");
				String gender = result.getString("gender");
				Date dob = result.getDate("dob");
				String jobTitle = result.getString("job_title");
				String department = result.getString("department");

				Employee tempEmployee = new Employee(id, firstName, lastName, email, gender, dob.toString(), jobTitle,
						department);
				employees.add(tempEmployee);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(conn, stmt, result);
		}

		return employees;
	}

	private void close(Connection conn, Statement stmt, ResultSet result) {
		try {
			if (result != null) {
				result.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Employee> getEmployeesById(int id) {
		List<Employee> employees = new ArrayList<>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;

		try {
			conn = dataSource.getConnection();

			String sql = "SELECT * FROM employee WHERE id=?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);

			result = stmt.executeQuery();

			while (result.next()) {
				String firstName = result.getString("first_name");
				String lastName = result.getString("last_name");
				String email = result.getString("email");
				String gender = result.getString("gender");
				Date dob = result.getDate("dob");
				String jobTitle = result.getString("job_title");
				String department = result.getString("department");

				Employee tempEmployee = new Employee(id, firstName, lastName, email, gender, dob.toString(), jobTitle,
						department);
				employees.add(tempEmployee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(conn, stmt, result);
		}

		return employees;
	}

	public List<Employee> getEmployeesByFirstName(String firstName) {
		List<Employee> employees = new ArrayList<>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;

		try {
			conn = dataSource.getConnection();

			String sql = "SELECT * FROM employee WHERE first_name LIKE ?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, "%" + firstName + "%");

			result = stmt.executeQuery();

			while (result.next()) {
				int id = result.getInt("id");
				String lastName = result.getString("last_name");
				String email = result.getString("email");
				String gender = result.getString("gender");
				Date dob = result.getDate("dob");
				String jobTitle = result.getString("job_title");
				String department = result.getString("department");

				Employee tempEmployee = new Employee(id, firstName, lastName, email, gender, dob.toString(), jobTitle,
						department);
				employees.add(tempEmployee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(conn, stmt, result);
		}

		return employees;
	}

	public List<Employee> getEmployeesByLastName(String lastName) {
		List<Employee> employees = new ArrayList<>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;

		try {
			conn = dataSource.getConnection();

			String sql = "SELECT * FROM employee WHERE last_name LIKE ?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, "%" + lastName + "%");

			result = stmt.executeQuery();

			while (result.next()) {
				int id = result.getInt("id");
				String email = result.getString("email");
				String gender = result.getString("gender");
				Date dob = result.getDate("dob");
				String jobTitle = result.getString("job_title");
				String department = result.getString("department");

				Employee tempEmployee = new Employee(id, result.getString("first_name"), lastName, email, gender,
						dob.toString(), jobTitle, department);
				employees.add(tempEmployee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(conn, stmt, result);
		}

		return employees;
	}

	public List<Employee> getEmployeesByEmail(String email) {
		List<Employee> employees = new ArrayList<>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;

		try {
			conn = dataSource.getConnection();

			String sql = "SELECT * FROM employee WHERE email LIKE ?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, "%" + email + "%");

			result = stmt.executeQuery();

			while (result.next()) {
				int id = result.getInt("id");
				String firstName = result.getString("first_name");
				String lastName = result.getString("last_name");
				String gender = result.getString("gender");
				Date dob = result.getDate("dob");
				String jobTitle = result.getString("job_title");
				String department = result.getString("department");

				Employee tempEmployee = new Employee(id, firstName, lastName, email, gender, dob.toString(), jobTitle,
						department);
				employees.add(tempEmployee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(conn, stmt, result);
		}

		return employees;
	}

	public List<Employee> getEmployeesByGender(String gender) {
		List<Employee> employees = new ArrayList<>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;

		try {
			conn = dataSource.getConnection();

			String sql = "SELECT * FROM employee WHERE gender LIKE ?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, "%" + gender + "%");

			result = stmt.executeQuery();

			while (result.next()) {
				int id = result.getInt("id");
				String firstName = result.getString("first_name");
				String lastName = result.getString("last_name");
				String email = result.getString("email");
				Date dob = result.getDate("dob");
				String jobTitle = result.getString("job_title");
				String department = result.getString("department");

				Employee tempEmployee = new Employee(id, firstName, lastName, email, gender, dob.toString(), jobTitle,
						department);
				employees.add(tempEmployee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(conn, stmt, result);
		}

		return employees;
	}

	public List<Employee> getEmployeesByDob(String dob) {
		List<Employee> employees = new ArrayList<>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;

		try {
			conn = dataSource.getConnection();

			String sql = "SELECT * FROM employee WHERE dob LIKE ?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, "%" + dob + "%");

			result = stmt.executeQuery();

			while (result.next()) {
				int id = result.getInt("id");
				String firstName = result.getString("first_name");
				String lastName = result.getString("last_name");
				String email = result.getString("email");
				String gender = result.getString("gender");
				String jobTitle = result.getString("job_title");
				String department = result.getString("department");

				Employee tempEmployee = new Employee(id, firstName, lastName, email, gender, dob, jobTitle, department);
				employees.add(tempEmployee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(conn, stmt, result);
		}

		return employees;
	}

	public List<Employee> getEmployeesByJobTitle(String jobTitle) {
		List<Employee> employees = new ArrayList<>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;

		try {
			conn = dataSource.getConnection();

			String sql = "SELECT * FROM employee WHERE job_title LIKE ?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, "%" + jobTitle + "%");

			result = stmt.executeQuery();

			while (result.next()) {
				int id = result.getInt("id");
				String firstName = result.getString("first_name");
				String lastName = result.getString("last_name");
				String email = result.getString("email");
				String gender = result.getString("gender");
				Date dob = result.getDate("dob");
				String department = result.getString("department");

				Employee tempEmployee = new Employee(id, firstName, lastName, email, gender, dob.toString(), jobTitle,
						department);
				employees.add(tempEmployee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(conn, stmt, result);
		}

		return employees;
	}

	public List<Employee> getEmployeesByDepartment(String department) {
		List<Employee> employees = new ArrayList<>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;

		try {
			conn = dataSource.getConnection();

			String sql = "SELECT * FROM employee WHERE department LIKE ?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, "%" + department + "%");

			result = stmt.executeQuery();

			while (result.next()) {
				int id = result.getInt("id");
				String firstName = result.getString("first_name");
				String lastName = result.getString("last_name");
				String email = result.getString("email");
				String gender = result.getString("gender");
				Date dob = result.getDate("dob");
				String jobTitle = result.getString("job_title");

				Employee tempEmployee = new Employee(id, firstName, lastName, email, gender, dob.toString(), jobTitle,
						department);
				employees.add(tempEmployee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(conn, stmt, result);
		}

		return employees;
	}

}
