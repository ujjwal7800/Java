package com.auriopro.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * * Servlet implementation class JdbcTest
 */
@WebServlet("/JdbcTest")
public class JdbcTest extends HttpServlet {
	@Resource(name = "jdbc/student-source")
	private DataSource datasource;
	private static final long serialVersionUID = 1L;

	/**
	 * * @see HttpServlet#HttpServlet()
	 */
	public JdbcTest() {
		super(); // TODO Auto-generated constructor stub
	}

	/**
	 * * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 * response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Connection conn = null;
			Statement stmt = null;
			ResultSet result = null;
			conn = datasource.getConnection();
			String sql = "select * from student";
			stmt = conn.createStatement();
			result = stmt.executeQuery(sql);
			System.out.println("Cricketer names are:");
			while (result.next()) {
				String firstname = result.getString("first_name");
				System.out.println(firstname);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 * response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub doGet(request, response);
	}
}
