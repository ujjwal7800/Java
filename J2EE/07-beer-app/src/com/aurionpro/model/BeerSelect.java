package com.aurionpro.model;

import java.io.IOException;
import java.util.List;
import java.util.Iterator;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SelectBeer.do")
public class BeerSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BeerSelect() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Get the selected beer color from the request parameter
		String c = request.getParameter("color");

		// Create an instance of the BeerExpert class
		BeerExpert be = new BeerExpert();

		// Retrieve the list of beer brands based on the selected color
		List<String> result = be.getBrands(c);

		// Set the "styles" attribute in the request with the list of beer brands
		request.setAttribute("styles", result);

		// Forward the request to the "result.jsp" page for rendering
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}
}
