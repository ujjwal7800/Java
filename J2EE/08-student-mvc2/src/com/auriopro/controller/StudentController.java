//package com.auriopro.controller;
//
//import java.io.IOException;
//import java.sql.SQLException;
//import java.util.List;
//
//import javax.annotation.Resource;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.sql.DataSource;
//
//import com.auriopro.jdbc.StudentDbUtil;
//import com.auriopro.model.Student;
//
///**
// * Servlet implementation class StudentController
// */
//@WebServlet("/StudentController")
//public class StudentController extends HttpServlet {
//	@Resource(name = "jdbc/student-source")
//	private DataSource datasource;
//
//	private StudentDbUtil dbUtil;
//
//	@Override
//	public void init() throws ServletException {
//		super.init();
//		dbUtil = new StudentDbUtil(datasource);
//	}
//
//	private static final long serialVersionUID = 1L;
//
//	private int id;
//
//	public StudentController() {
//		super();
//	}
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		String command = request.getParameter("action");
//		if (command == null) {
//			command = "list";
//		}
//		switch (command) {
//		 case "list1":
//		 try {
//		 listStudent(request, response);
//		 } catch (ServletException e) {
//		 // TODO Auto-generated catch block
//		 e.printStackTrace();
//		 } catch (IOException e) {
//		 // TODO Auto-generated catch block
//		 e.printStackTrace();
//		 } catch (SQLException e) {
//		 // TODO Auto-generated catch block
//		 e.printStackTrace();
//		 }
//		
//		 break;
//
//		case "list":
//			String searchQuery = request.getParameter("search"); // Get the search query parameter
//			try {
//				listStudent(request, response); // Pass the search query to listStudent
//			} catch (ServletException | IOException | SQLException e) {
//				e.printStackTrace();
//			}
//			break;
//			
//
//		case "add":
//			try {
//				addStudent(request, response);
//			} catch (ServletException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			// System.out.println("add operation");
//			break;
//
//		case "update":
//			getStudentForUpdate(request, response);
//			break;
//
//		case "update-save":
//			try {
//				updateStudent(request, response);
//			} catch (ServletException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			break;
//
//		case "delete":
//			int studentId = Integer.parseInt(request.getParameter("id"));
//			dbUtil.deleteStudent(studentId); // Implement this method to delete the student.
//			try {
//				listStudent(request, response);
//			} catch (ServletException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			} // Redirect back to the list of students.
//			break;
//
//		default:
//			try {
//				listStudent(request, response);
//			} catch (ServletException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//		}
//	}
//
//	private void deleteStudent(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, ServletException, IOException {
//		int id = Integer.parseInt(request.getParameter("id"));
//		dbUtil.deleteStudent(id);
//		listStudent(request, response);
//	}
//
//	private void updateStudent(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException, SQLException {
//		int id = Integer.parseInt(request.getParameter("id"));
//		String fname = request.getParameter("firstName");
//		String lname = request.getParameter("lastName");
//		String email = request.getParameter("useremail");
//		Student stud = new Student(id, fname, lname, email);
//		dbUtil.updateStudents(stud);
//		listStudent(request, response);
//	}
//
//	private void getStudentForUpdate(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		int id = Integer.parseInt(request.getParameter("id"));
//		Student student = dbUtil.getStudentById(id);
//		System.out.println(student);
//		request.setAttribute("student", student);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/update-student.jsp");
//		dispatcher.forward(request, response);
//
//	}
//
//	private void addStudent(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException, SQLException {
//		String fname = request.getParameter("firstName");
//		String lname = request.getParameter("lastName");
//		String email = request.getParameter("useremail");
//		Student stud = new Student(fname, lname, email);
//		dbUtil.addNewStudents(stud);
//		// System.out.println(stud);
//		// listStudent(request, response);
//		response.sendRedirect(request.getContextPath() + "/StudentController");
//
//	}
//
//	private void listStudent(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException, SQLException {
//		List<Student> studentList = dbUtil.getAllStudents();
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-students.jsp");
//		request.setAttribute("allStud", studentList);
//		dispatcher.forward(request, response);
//	}
//
//}

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

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String command = request.getParameter("action");
		if (command == null) {
			command = "list";
		}
		switch (command) {
		case "list":
			String searchQuery = request.getParameter("search");
			try {
				listStudent(request, response, searchQuery);
			} catch (ServletException | IOException | SQLException e) {
				e.printStackTrace();
			}
			break;
		case "add":
			showAddStudentForm(request, response);
			break;
		case "add-save":
			try {
				addStudent(request, response);
			} catch (ServletException | IOException | SQLException e) {
				e.printStackTrace();
			}
			break;
		case "update":
			showUpdateStudentForm(request, response);
			break;
		case "update-save":
			try {
				updateStudent(request, response);
			} catch (ServletException | IOException | SQLException e) {
				e.printStackTrace();
			}
			break;
		case "delete":
			int studentId = Integer.parseInt(request.getParameter("id"));
			dbUtil.deleteStudent(studentId);
			try {
				listStudent(request, response, null);
			} catch (ServletException | IOException | SQLException e) {
				e.printStackTrace();
			}
			break;
		default:
			try {
				listStudent(request, response, null);
			} catch (ServletException | IOException | SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private void listStudent(HttpServletRequest request, HttpServletResponse response, String searchQuery)
			throws ServletException, IOException, SQLException {
		List<Student> studentList;
		if (searchQuery != null && !searchQuery.isEmpty()) {
			studentList = dbUtil.searchStudentsByName(searchQuery);
		} else {
			studentList = dbUtil.getAllStudents();
		}
		request.setAttribute("allStud", studentList);
		request.setAttribute("searchQuery", searchQuery);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-students.jsp");
		dispatcher.forward(request, response);
	}

	private void showAddStudentForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/add-student.jsp");
		dispatcher.forward(request, response);
	}

	private void addStudent(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		String fname = request.getParameter("firstName");
		String lname = request.getParameter("lastName");
		String email = request.getParameter("useremail");
		Student stud = new Student(fname, lname, email);
		dbUtil.addNewStudents(stud);
		response.sendRedirect(request.getContextPath() + "/list-students.jsp");
	}

	private void showUpdateStudentForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Student student = dbUtil.getStudentById(id);
		request.setAttribute("student", student);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/update-student.jsp");
		dispatcher.forward(request, response);
	}

	private void updateStudent(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		int id = Integer.parseInt(request.getParameter("id"));
		String fname = request.getParameter("firstName");
		String lname = request.getParameter("lastName");
		String email = request.getParameter("useremail");
		Student stud = new Student(id, fname, lname, email);
		dbUtil.updateStudent(stud);
		listStudent(request, response, null);
	}
}
