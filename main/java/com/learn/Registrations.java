package com.learn;

import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class Registrations extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String f=request.getParameter("fname");  
String l=request.getParameter("lname");
String n=request.getParameter("number");
String a=request.getParameter("address");
String e=request.getParameter("email");  
String p=request.getParameter("password");  
          
try{  
	
		// 1 register driver
				Class.forName("com.mysql.cj.jdbc.Driver");//"com.mysql.jdbc.Driver"

				//2 creating connection

				Connection con=
				DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "12345");
				
	



PreparedStatement ps=con.prepareStatement(  
"insert into emp values(?,?,?,?,?,?)");  
  
ps.setString(1,f);  
ps.setString(2,l);
ps.setString(3,n);
ps.setString(6,a);
ps.setString(4,e);  
ps.setString(5,p);  
          
int i=ps.executeUpdate();  
if(i>0)  
out.print("<h1>You are successfully registered...</h1>");  
      
          
}catch (Exception e2) {System.out.println(e2);}  
          
out.close();  
}  
}