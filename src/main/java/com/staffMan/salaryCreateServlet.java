package com.staffMan;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/salaryCreateServlet")
public class salaryCreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get values
		String staffID = request.getParameter("staffID");
		String accountNum = request.getParameter("accountNum");
		String bank = request.getParameter("bank");
		String basicSal = request.getParameter("basicSal");
		String otHours = request.getParameter("otHours");
		String totalSalary = request.getParameter("totalSalary");
		
		//boolean value
		boolean isTrue;
		
		isTrue = StaffMemDBUtill.insertsal(staffID,accountNum,bank,basicSal,otHours,totalSalary);
		
		if(isTrue == true) {
			
			//create request dispatcher object and navigate 
			RequestDispatcher dis = request.getRequestDispatcher("apSuccess.jsp");
			dis.forward(request, response);
		}
		else {
			
			//create request dispatcher object and navigate 
			RequestDispatcher dis2 = request.getRequestDispatcher("apUnsuccess.jsp");
			dis2.forward(request, response);
		}
		
	}

}
