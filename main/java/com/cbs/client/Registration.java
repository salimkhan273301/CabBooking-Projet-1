package com.cbs.client;

import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;

import com.cbs.db.HibernateService;
import com.cbs.model.Employee;  
  
public class Registration extends HttpServlet {  
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String f=request.getParameter("fname");  
String l=request.getParameter("lname");
String d=request.getParameter("dept");
String a=request.getParameter("address");
String e=request.getParameter("email");  
String p=request.getParameter("password"); 
 
// preparing an instance of Employee
  Employee emp=new Employee();
  emp.setFname(f);
  emp.setLname(l);
  emp.setDept(d);
  emp.setAddress(a);
  emp.setEmail(e);
  emp.setPassword(p);
try {
	HibernateService.saveEmployee(emp);
} catch (Exception e1) {
	e1.printStackTrace();
} 

out.print("<h1 style='color:green; text-align:center;'>You are successfully registered...</h1>");
out.print(emp);
//response.sendRedirect("login1.html");
out.print("<br>");

out.print("<a href=\"home.html\"><h3>Back</h3></h3></a>") ;     
}

}