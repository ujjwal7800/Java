/*package com.aurionpro.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.aurionpro.model.Employee;

@WebServlet("/JdbcTest")
public class JdbcTest extends HttpServlet {
    @Resource(name="jdbc/employee-source")
    private DataSource dataSource;
    private static final long serialVersionUID = 1L;

    public JdbcTest() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Connection conn = null;
            Statement st = null;
            ResultSet result = null;
            conn = dataSource.getConnection();
            String query1 = "select * from employee";
            st = conn.createStatement();
            result = st.executeQuery(query1);


			while(result.next()) {
				String firstName=result.getString("first_name");
				System.out.println(firstName);
			}
            List<Employee> employeeList = new ArrayList<>();

            while (result.next()) {
                Employee employee = new Employee(
                    result.getInt("id"),
                    result.getString("first_name"),
                    result.getString("last_name"),
                    result.getString("email"),
                    result.getString("gender"),
                    result.getString("dob"),
                    result.getString("job_title"),
                    result.getString("department")
                );

                employeeList.add(employee);
            }

            // Set the employeeList as a request attribute
            request.setAttribute("employeeList", employeeList);

            // Forward the request to the JSP page
            request.getRequestDispatcher("/list-employee.jsp").forward(request, response);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
*/
package com.aurionpro.jdbc;

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
 * Servlet implementation class JdbcTest
 */
@WebServlet("/JdbcTest")
public class JdbcTest extends HttpServlet {
	@Resource(name = "jdbc/employee-source")
	private DataSource dataSource;
	private static final long serialVersionUID = 1L;

	public JdbcTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Connection conn = null;
			Statement st = null;
			ResultSet result = null;
			conn = dataSource.getConnection();
			String query1 = "select * from employee";
			st = conn.createStatement();
			result = st.executeQuery(query1);

			while (result.next()) {
				String firstName = result.getString("first_name");
				System.out.println(firstName);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
