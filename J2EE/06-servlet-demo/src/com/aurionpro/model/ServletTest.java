package com.aurionpro.model; 
 
import java.io.IOException; 
import java.io.PrintWriter; 
 
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
 
/** 
 * Servlet implementation class ServletTest 
 */ 
@WebServlet("/ServletTest") 
public class ServletTest extends HttpServlet { 
 private static final long serialVersionUID = 1L; 
        
    /** 
     * @see HttpServlet#HttpServlet() 
     */ 
    public ServletTest() { 
        super(); 
        // TODO Auto-generated constructor stub 
    } 
 
 /** 
  * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response) 
  */ 
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
  // TODO Auto-generated method stub 
//  response.getWriter().append("Served at: ").append(request.getContextPath()); 
     response.setContentType("Text/HTML"); 
  PrintWriter writer = response.getWriter(); 
  writer.println("<h1>Hello Umaid </h1>"); 
 } 
 
 /** 
  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response) 
  */ 
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
  // TODO Auto-generated method stub 
  doGet(request, response); 
 } 
 
}
