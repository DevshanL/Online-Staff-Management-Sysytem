package com.staffMan;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updateSalAcServlet
 */
@WebServlet("/updateSalAcServlet")
public class updateSalAcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get db data from java class
		String salaryID = request.getParameter("salID");
		String satffID = request.getParameter("staffID");
		String accountNum = request.getParameter("acc");
		String bank= request.getParameter("bank");
		String basicSal = request.getParameter("bsal");
		String otHours = request.getParameter("ot");
		String totalSalary= request.getParameter("totsal");
		
		//boolean value
		boolean isTrue;
		
		isTrue = StaffMemDBUtill.updateSalAc(salaryID, satffID, accountNum, bank, basicSal, otHours, totalSalary);
		
		if(isTrue == true) {
			
			//get details to the list
			List<StaffMember> staffDetail = StaffMemDBUtill.getStaffMemDetails(salaryID);
			request.setAttribute("staffDetail" , staffDetail);
			
			//create request dispatcher and navigate
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
		}
		else {
			//create request dispatcher and navigate
			RequestDispatcher dis = request.getRequestDispatcher("apUnsuccess.jsp");
			dis.forward(request, response);
			
		}
		
	}

}
