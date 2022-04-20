package com.cbs.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cbs.dbo.AcceptRequestDao;
import com.cbs.dbo.AcceptRequestDaoImpl;

/**
 * Servlet implementation class Accept
 */
public class Accept extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		HttpSession s=request.getSession(false);
		String email = (String) s.getAttribute("email");
		String pass = (String) s.getAttribute("pass");
		Integer requestId = (Integer) s.getAttribute("requestId");
		
		AcceptRequestDao ar = new AcceptRequestDaoImpl();
		boolean confirm = ar.acept(requestId);
		
		RequestDispatcher rd=request.getRequestDispatcher("PendingRequest");
		rd.include(request, response);
	}
}
