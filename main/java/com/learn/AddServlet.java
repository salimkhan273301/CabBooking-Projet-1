package com.learn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int n1=Integer.parseInt(request.getParameter("n1"));
		int n2=Integer.parseInt(request.getParameter("n2"));
		int sum=n1+n2;
		out.println("<html>");
        out.println("<head>");
        out.println("<title>Hi</title>");
        out.println("</head>");
		out.println("<body style='background-color:green;'>");
			out.println("<h1 style='color:red;'>Addition:  "+ sum+"</h1>");
			out.println("</body><html>");
		
		
	}

	

}
