package com.aurionpro.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Hello World");
		PrintWriter out = response.getWriter();

		String username = request.getParameter("username");
		System.out.println(username);
		out.println("UserName :- "+username);
		String umail = request.getParameter("usermail");
		System.out.println(umail);
		out.println("User Email :- "+umail);
		String ugender = request.getParameter("gender");
		System.out.println(ugender);
		out.println("User Gender :-"+ugender);
		String udegree = request.getParameter("userdegree");
		System.out.println(udegree);
		out.println("User Degree :-"+udegree);
		String userlang[] = request.getParameterValues("userlang");
		System.out.println(userlang);
		out.println("User Language :-"+userlang);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}