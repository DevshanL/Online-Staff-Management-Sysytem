package com.staffMan;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class requestSalServlet
 */
@WebServlet("/requestSalServlet")
public class requestSalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    //JS script	
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//get values
		String accountNum = request.getParameter("accnum");
		String bank = request.getParameter("bank");
		boolean isTrue;
		
		isTrue = StaffMemDBUtill.validate(accountNum, bank);
		
		
		if(isTrue == true) {
		
			List<StaffMember> staffDetail = StaffMemDBUtill.getStaffMember(accountNum);
			request.setAttribute("staffDetail", staffDetail);
		
		    
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
	}
	
	
		else {
		    
			//js scritpt
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Your Account Number Is Incorrect');");
			out.println("location='requestSal.jsp'");
			out.println("</script>");
			out.println("</script>");
	}
		
	}	
}

