package com.aurionpro.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.aurionpro.jdbc.EmployeeDbUtil;
import com.aurionpro.model.Employee;

@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	@Resource(name = "jdbc/employee-source")
	private DataSource dataSource;

	private EmployeeDbUtil dbUtil;

	@Override
	public void init() throws ServletException {
		super.init();
		dbUtil = new EmployeeDbUtil(dataSource);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String command = request.getParameter("action");
		if (command == null) {
			command = "list";
		}

		switch (command) {
		case "list":
			listEmployees(request, response);
			break;
		case "add":

			try {
				addEmployee(request, response);
			} catch (Exception e) {
				// TODO: handle exception
			}
			break;

		case "update":
			getEmployeeForUpdate(request, response);
			break;
		case "update-save":
			updateEmployee(request, response);
			break;
		case "delete":
			deleteEmployee(request, response);
			break;
		case "search":
			searchEmployee(request, response);
			break;
		default:
			listEmployees(request, response);
		}
	}

	private void searchEmployee(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String searchCriteria = request.getParameter("search-criteria");
		String searchTerm = request.getParameter("search-term");

		List<Employee> employeeList;

		if (searchTerm != null && !searchTerm.trim().isEmpty()) {
			switch (searchCriteria) {
			case "id":
				employeeList = dbUtil.getEmployeesById(Integer.parseInt(searchTerm));
				break;
			case "first-name":
				employeeList = dbUtil.getEmployeesByFirstName(searchTerm);
				break;
			case "last-name":
				employeeList = dbUtil.getEmployeesByLastName(searchTerm);
				break;
			case "email":
				employeeList = dbUtil.getEmployeesByEmail(searchTerm);
				break;
			case "gender":
				employeeList = dbUtil.getEmployeesByGender(searchTerm);
				break;
			case "dob":
				employeeList = dbUtil.getEmployeesByDob(searchTerm);
				break;
			case "job-title": // Corrected handling for job-title search
				employeeList = dbUtil.getEmployeesByJobTitle(searchTerm);
				break;
			case "department":
				employeeList = dbUtil.getEmployeesByDepartment(searchTerm);
				break;
			default:
				// Handle the default case or throw an error if needed
				throw new IllegalArgumentException("Invalid search criteria: " + searchCriteria);
			}
		} else {
			// If the search term is empty or null, get all employees
			employeeList = dbUtil.getAllEmployee();
		}

		List<Employee> allEmployees = dbUtil.getAllEmployee();
		request.setAttribute("allEmployees", allEmployees);
		request.setAttribute("employeeList", employeeList);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-employee.jsp");
		dispatcher.forward(request, response);
	}

	private void deleteEmployee(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		dbUtil.deleteEmployee(id);
		listEmployees(request, response);
	}

	private void updateEmployee(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");
		String jobTitle = request.getParameter("jobtitle");
		String department = request.getParameter("department");

		Employee employee = new Employee(id, firstName, lastName, email, gender, dob, jobTitle, department);
		dbUtil.updateEmployee(employee);
		listEmployees(request, response);
	}

	private void getEmployeeForUpdate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Employee employee = dbUtil.getEmployeeById(id);
		request.setAttribute("employee", employee);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/update-employee.jsp");
		requestDispatcher.forward(request, response);
	}

	// private void addEmployee(HttpServletRequest request, HttpServletResponse
	// response)
	// throws ServletException, IOException {
	// String firstName = request.getParameter("firstname");
	// String lastName = request.getParameter("lastname");
	// String email = request.getParameter("email");
	// String gender = request.getParameter("gender");
	// String dob = request.getParameter("dob");
	// String jobTitle = request.getParameter("jobtitle");
	// String department = request.getParameter("department");
	//
	// Employee employeeToAdd = new Employee(firstName, lastName, email, gender,
	// dob, jobTitle, department);
	// dbUtil.addNewEmployee(employeeToAdd);
	// response.sendRedirect(request.getContextPath() + "/EmployeeController");
	// }

	private void addEmployee(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");
		String jobTitle = request.getParameter("jobtitle");
		String department = request.getParameter("department");

		Employee employeeToAdd = new Employee(firstName, lastName, email, gender, dob, jobTitle, department);
		dbUtil.addNewEmployee(employeeToAdd);
		response.sendRedirect(request.getContextPath() + "/EmployeeController?action=list");
	}

	private void listEmployees(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Employee> employeeList = dbUtil.getAllEmployee(); // Corrected method name
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-employee.jsp");
		request.setAttribute("employeeList", employeeList);
		dispatcher.forward(request, response);
	}

}
	
	
	
	
	