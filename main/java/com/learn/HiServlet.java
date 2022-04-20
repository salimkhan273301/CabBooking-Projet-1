package com.learn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HiServlet extends GenericServlet {

	 public void service(ServletRequest req,ServletResponse res)
			 throws IOException,ServletException{
			    res.setContentType("text/html");
			    PrintWriter out=res.getWriter();
			    out.println("text/html");
			   // out.print("<html>");
			    //out.print("<body>");
			    out.print("<h1>Generic Servlet Example</h1>");
			    out.print("<p>welcom to jaddupipra!</p>");
			    //out.print("</body>");
			   // out.print("</html>");
			  }
}
