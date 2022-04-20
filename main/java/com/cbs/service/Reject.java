package com.cbs.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cbs.db.Hibernateutil;
import com.cbs.dbo.RejectRequest;
import com.cbs.model.Employee;

/**
 * Servlet implementation class Reject
 */
public class Reject extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public abstract class RejectRequestImpl implements RejectRequest {

		
		public Boolean register1(Employee emp) {
				
				try {
					Session session = Hibernateutil.getSessionFactory().openSession();
					Transaction tx = session.beginTransaction();
					
					session.save(emp);
					
					tx.commit();
					session.close();
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return false;
				}
				
				
				return true;
			}


		}

}
