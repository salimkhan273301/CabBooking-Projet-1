package com.cbs.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cbs.dbo.RequestPending;
import com.cbs.dbo.RequestPendingImpl;

/**
 * Servlet implementation class AssignCab
 */
public class AssignCab extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			HttpSession s=request.getSession(false);
			
			RequestPending pr = new RequestPendingImpl();
			List lst = pr.pendingRequest();
		
		
	}

}
