package com.auriopro.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.auriopro.jdbc.StudentDbUtil;
import com.auriopro.model.Student;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	@Resource(name = "jdbc/student-source")
	private DataSource datasource;

	private StudentDbUtil dbUtil;

	@Override
	public void init() throws ServletException {
		super.init();
		dbUtil = new StudentDbUtil(datasource);
	}

	private static final long serialVersionUID = 1L;

	private int id;

	public StudentController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String command = request.getParameter("action");
		if (command == null) {
			command = "list";
		}
		switch (command) {
		case "list":
			try {
				listStudent(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;

		case "add":
			try {
				addStudent(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// System.out.println("add operation");
			break;

		case "update":
			getStudentForUpdate(request, response);
			break;

		case "update-save":
			try {
				updateStudent(request, response);
			} catch (ServletException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;

		case "delete":
			int studentId = Integer.parseInt(request.getParameter("id"));
			dbUtil.deleteStudent(studentId); // Implement this method to delete the student.
			try {
				listStudent(request, response);
			} catch (ServletException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} // Redirect back to the list of students.
			break;

		default:
			try {
				listStudent(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	private void deleteStudent(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		dbUtil.deleteStudent(id);
		listStudent(request, response);
	}

	private void updateStudent(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		int id = Integer.parseInt(request.getParameter("id"));
		String fname = request.getParameter("firstName");
		String lname = request.getParameter("lastName");
		String email = request.getParameter("useremail");
		Student stud = new Student(id, fname, lname, email);
		dbUtil.updateStudents(stud);
		listStudent(request, response);
	}

	private void getStudentForUpdate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Student student = dbUtil.getStudentById(id);
		System.out.println(student);
		request.setAttribute("student", student);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/update-student.jsp");
		dispatcher.forward(request, response);

	}

	private void addStudent(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		String fname = request.getParameter("firstName");
		String lname = request.getParameter("lastName");
		String email = request.getParameter("useremail");
		Student stud = new Student(fname, lname, email);
		dbUtil.addNewStudents(stud);
		// System.out.println(stud);
		// listStudent(request, response);
		response.sendRedirect(request.getContextPath() + "/StudentController");

	}

	private void listStudent(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		List<Student> studentList = dbUtil.getAllStudents();
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-students.jsp");
		request.setAttribute("allStud", studentList);
		dispatcher.forward(request, response);
	}

	private void searchStudent(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		String firstName = request.getParameter("first-name");
		System.out.println("hiiii");
		System.out.println(firstName);
		if (firstName.equals("")) {
			System.out.println("Inside if");
			response.sendRedirect(request.getContextPath() + "/StudentController");
		} else {
			List<Student> studentList = dbUtil.getStudentsByFirstName(firstName);

			RequestDispatcher dispatcher = request.getRequestDispatcher("/list-students.jsp");
			request.setAttribute("studentList", studentList);
			dispatcher.forward(request, response);
		}

	}

}