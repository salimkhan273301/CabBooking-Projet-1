package com.cbs.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cbs.dbo.AssignCabDao;
import com.cbs.dbo.AssignCabDaoImpl;

/**
 * Servlet implementation class Assign
 */
public class Assign extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	response.setContentType("text/html");
	
	HttpSession s=request.getSession(false);
	String email = (String) s.getAttribute("email");
	String password = (String) s.getAttribute("psw");
	Integer requestId = (Integer) s.getAttribute("requestId");
	
	
	AssignCabDao ac = new AssignCabDaoImpl();
	ac.assign(requestId);
	
	RequestDispatcher rd=request.getRequestDispatcher("/AssignCab");
	rd.include(request, response);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}