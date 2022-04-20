package com.cbs.client;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cbs.db.HibernateService;
import com.cbs.model.Employee;


public class LoginForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
   String email=request.getParameter("email");
   String password=request.getParameter("psw");
   
   Employee emp=new Employee();
   HibernateService obj= new HibernateService();
   emp=obj.searchbyemailpass(email,password);
   
   if(emp!=null)
   {
	   
	   
	   response.sendRedirect("user.html");
	   System.out.print("Login Employee details::"+emp);
   }
   else {
	   
	   response.sendRedirect("login1.html");
	 }
   
   
}
}