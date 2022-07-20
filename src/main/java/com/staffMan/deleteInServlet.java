package com.staffMan;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/deleteInServlet")
public class deleteInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String salaryID = request.getParameter("salID");
		
		//boolean value
		boolean isTrue;
		
		isTrue = StaffMemDBUtill.deleteIn(salaryID);
		
		if (isTrue == true) {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("salaryCreate.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			//pass list object 
			List<StaffMember>staffDetail = StaffMemDBUtill.getStaffMemDetails(salaryID);
			request.setAttribute("staffDetail", staffDetail);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("useraccount.jsp");
			dispatcher.forward(request, response);
		}
    	
	}

}
