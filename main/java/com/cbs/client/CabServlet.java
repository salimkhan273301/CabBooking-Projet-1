package com.cbs.client;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cbs.db.HibernateService;
import com.cbs.model.Cab;
import com.cbs.model.Employee;

/**
 * Servlet implementation class CabServlet
 */
public class CabServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		          

		
		Integer cabNo=Integer.parseInt(request.getParameter("cabNo"));
		String drivername=request.getParameter("dname");
		String drivermobile=request.getParameter("dmobile");
		String driveraddress=request.getParameter("daddress");
		  
		
		 
		// preparing an instance of Cab
		  Cab cab=new Cab();
		  
		 cab.setCabNo(cabNo);
		 cab.setDname(drivername);
		 cab.setDmobile(drivermobile);
		 cab.setDaddress(driveraddress);
		 cab.setStatus(1);
		 
		  
		try {
			HibernateService.saveCab(cab);
		} catch (Exception e1) {
			e1.printStackTrace();
		} 

		out.print("<h1 style='color:green; text-align:center;'>Cab is successfully registered...</h1>");
		out.print(cab);
		//response.sendRedirect("login1.html");

		      
		}
		
	}


