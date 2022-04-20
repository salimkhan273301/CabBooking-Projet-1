package com.cbs.client;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cbs.db.HibernateService;
import com.cbs.model.Employee;


public class ManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String email=request.getParameter("email");
		   String password=request.getParameter("psw");
		   Employee emp=new Employee();
		   HibernateService obj= new HibernateService();
		   emp=obj.searchbyemailpass(email,password);
		   if(emp!=null)
		   {
			   response.sendRedirect("manager.html");
		   }
		   else {
			   
			   response.sendRedirect("login2.html");
			   
		   }
		   
			}
		
	}


