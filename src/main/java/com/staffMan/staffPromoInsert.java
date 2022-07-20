package com.staffMan;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/staffPromoInsert")
public class staffPromoInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get db data from java class
		String name = request.getParameter("name");
		String nic = request.getParameter("nic");
		String phone = request.getParameter("phone");
		String department = request.getParameter("dep");
		String increment = request.getParameter("inc");
		String experience = request.getParameter("exp");
		String username = request.getParameter("uid");
		String password = request.getParameter("psw");
		
		//boolean value
		boolean isTrue;
		
		isTrue = StaffMemDBUtill.insertinc(name, nic, phone, department, increment, experience, username, password);
		
		if(isTrue == true) {
			
			//create request dispatcher and navigate
			RequestDispatcher dis = request.getRequestDispatcher("apSuccess.jsp");
			dis.forward(request, response);
		}
		else {
			//create request dispatcher and navigate
			RequestDispatcher dis2 = request.getRequestDispatcher("apUnsuccess.jsp");
			dis2.forward(request, response);
		}
		
	}

} 
