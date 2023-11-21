package com.aurionpro.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import com.aurionpro.model.Passbook;
import com.aurionpro.model.User;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import com.aurionpro.model.UserDao;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserController() {
		super();
	}

	@Resource(name = "jdbc/bankdb")
	private DataSource dataSource;

	UserDao userDao;

	@Override
	public void init() throws ServletException {
		super.init();

		userDao = new UserDao(dataSource);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String command = request.getParameter("command");
		System.out.println(command);

		HttpSession session = request.getSession();
		Object user = (Object) session.getAttribute("isUser");

		if (user != null) {
			switch (command) {
			case "passbook":
				printPassbook(request, response);
				break;
			case "load":
				loadUserInformation(request, response);
				break;
			case "accInfo":
				fetchingAccountinfo(request, response);
				break;
			case "filterByDate":
				filterTransactionByDate(request, response);
				break;
			case "Deposit":
				depositMoney(request, response);
				break;
			case "update":
				updateuserInformation(request, response);
				break;
			case "Withdraw":
				withdrawMoney(request, response);
				break;
			}
		} else {
			response.sendRedirect("login.jsp");
		}

	}

	private void printPassbook(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int acc_no = Integer.parseInt(request.getParameter("acc_no"));
		request.setAttribute("acc_no", acc_no);
//		System.out.println("inside print passbook"+ acc_no);
		List<Passbook> transactions = userDao.getTransaction(acc_no);
//		System.out.println(transactions);
		request.setAttribute("transactions", transactions);
		RequestDispatcher dispatcher = request.getRequestDispatcher("passbook-details.jsp");
		dispatcher.forward(request, response);
	}

	private void loadUserInformation(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int acc_no = Integer.parseInt(request.getParameter("acc_no"));
		User user = userDao.getUserDetail(acc_no);
		request.setAttribute("user", user);
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-edit-information.jsp");
		dispatcher.forward(request, response);
	}

	private void fetchingAccountinfo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int acc_no = Integer.parseInt(request.getParameter("acc_no"));
		double balance = Double.parseDouble(request.getParameter("balance"));
		System.out.println("Before call: " + balance);
//		System.out.println(request.getAttribute("balance"));

		request.setAttribute("acc_no", acc_no);
		request.setAttribute("balance", balance);
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-transaction.jsp");
		dispatcher.forward(request, response);
	}

	private void filterTransactionByDate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int acc_no = Integer.parseInt(request.getParameter("acc_no"));
		String fromDate = request.getParameter("fromDate");
		String toDate = request.getParameter("toDate");

		List<Passbook> transactions = userDao.filterTransactionByDate(acc_no, fromDate, toDate);
		System.out.println(transactions.isEmpty());
		if (transactions.isEmpty()) {
			String msg3 = "Transaction not found !!";
			request.setAttribute("msg3", msg3);
		} else {
			request.setAttribute("transactions", transactions);
		}

		request.setAttribute("acc_no", acc_no);
		RequestDispatcher dispatcher = request.getRequestDispatcher("passbook-details.jsp");
		dispatcher.forward(request, response);

	}

	private void updateuserInformation(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int acc_no = Integer.parseInt(request.getParameter("acc_no"));
		String user_name = request.getParameter("user_name");
		String email = request.getParameter("email");
		String mob = request.getParameter("mob");
		String pass = request.getParameter("pass");

//		double balance = Double.parseDouble(request.getParameter("balance"));
//		System.out.println("Current balance 147: " + balance);
//		request.setAttribute("balance", balance);
//
//		User user = new User(acc_no, user_name, email, pass, mob, balance);
//		System.out.println(user);
		
		User wasUser = userDao.getUserDetail(acc_no);
		System.out.println("Before update: "+ wasUser);
		
		User user = new User(acc_no, user_name, email, pass, mob);
		System.out.println("Values passed for update: "+user);

		User isUser = userDao.updateUserInformation(user);
		System.out.println("Values after DB Update: " + isUser);
		request.setAttribute("isUser", isUser);
		request.setAttribute("balance", isUser.getBalance());
		
//		String old_email = request.getParameter("old_email");
//		System.out.println("Old email 156: " + old_email);
//		String old_pass = request.getParameter("old_pass");
//		System.out.println("Old pass 158: " + old_pass);

		if (!wasUser.getEmail().equals(isUser.getEmail()) || !wasUser.getPass().equals(isUser.getPass())) {
			response.sendRedirect(request.getContextPath() + "/LogoutController");
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("user-dashboard.jsp");
			dispatcher.forward(request, response);
		}	

	}

	private void depositMoney(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		String trans_type = request.getParameter("command");
		String trans_type = "Credit";
		int acc_no = Integer.parseInt(request.getParameter("acc_no"));
		double balance = Double.parseDouble(request.getParameter("balance"));
		System.out.println("Current Balance : " + balance);
		double amount = Double.parseDouble(request.getParameter("amount"));
		System.out.println("Amount to be deposited : " + amount);
//		userDao.depositeAmmount(ammount);
		LocalDate trans_date = LocalDate.now();
		String today = trans_date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

		double updatedBalance = balance + amount;
		System.out.println("Current Updated Balance : " + updatedBalance);

		Passbook passbook = new Passbook(acc_no, today, trans_type, amount, updatedBalance);
		userDao.depositAmount(passbook);
		request.setAttribute("acc_no", acc_no);
//		request.setAttribute("balance", updatedBalance);
		request.setAttribute("balance", passbook.getBalance());
//		System.out.println(request.getAttribute("balance"));

		RequestDispatcher dispatcher = request.getRequestDispatcher("user-dashboard.jsp");
		dispatcher.forward(request, response);

	}

	private void withdrawMoney(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		String trans_type = request.getParameter("command");
		String trans_type = "Debit";
		int acc_no = Integer.parseInt(request.getParameter("acc_no"));
		double balance = Double.parseDouble(request.getParameter("balance"));
		System.out.println("Current Balance : " + balance);

		double amount = Double.parseDouble(request.getParameter("amount"));
		System.out.println("Amount to be withdraw : " + amount);

		LocalDate transactionDate = LocalDate.now();
		String today = transactionDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		if (balance - amount < 1000) {
			int minimum = 1000;
			String msg4 = "Minimum balance 1000 required";
			request.setAttribute("msg4", msg4);
			request.setAttribute("minimum", minimum);
			request.setAttribute("balance", balance);
			request.setAttribute("acc_no", acc_no);
			RequestDispatcher dispatcher = request.getRequestDispatcher("user-transaction.jsp");
			dispatcher.forward(request, response);

		} else {
			double updatedBalance = balance - amount;
			System.out.println("Current Updated Balance : " + updatedBalance);

			Passbook passbook = new Passbook(acc_no, today, trans_type, amount, updatedBalance);
			userDao.withdrawAmount(passbook);
			request.setAttribute("acc_no", acc_no);
			request.setAttribute("balance", updatedBalance);
			RequestDispatcher dispatcher = request.getRequestDispatcher("user-dashboard.jsp");
			dispatcher.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
