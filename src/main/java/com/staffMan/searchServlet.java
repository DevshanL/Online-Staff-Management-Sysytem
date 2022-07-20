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
 * Servlet implementation class searchServlet
 */
@WebServlet("/searchServlet")
public class searchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
			//get values 
			String name= request.getParameter("name");
			String department = request.getParameter("department");
			boolean isTrue;
		
			isTrue = StaffMemDBUtill.valid(name, department);
		
		
		if(isTrue == true) {
		
			List<search> staffDetail = StaffMemDBUtill.getsearch(name);
			request.setAttribute("staffDetail", staffDetail);
		
		    //create request dipatcher and navigate
			RequestDispatcher dis = request.getRequestDispatcher("search.jsp");
			dis.forward(request, response);
	}
	
	
		else {
		    
			//js script
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Search Not Found');");
			out.println("location='Home.jsp'");
			out.println("</script>");
			out.println("</script>");
	}
		
	}	
}
