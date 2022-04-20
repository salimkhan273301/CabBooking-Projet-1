package com.cbs.dbo;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.cbs.db.Hibernateutil;
import com.cbs.model.Request;

public class RequestPendingImpl implements RequestPending {

	public List cabRequest() {
		Session session = Hibernateutil.getSessionFactory().openSession();
		List alist = null;
		try {
			SQLQuery q=session.createSQLQuery("select * from request as r where r.bid= 1"); //HQL
			q.addEntity(Request.class);
			alist = q.list();
		} 
		catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return alist;
	}

	//@Override
	public List pendingRequest() {
		Session session = Hibernateutil.getSessionFactory().openSession();
		List alist = null;
		try {
			SQLQuery q=session.createSQLQuery("select * from request as r where r.bid= 2"); //HQL
			q.addEntity(Request.class);
			alist = q.list();
		} 
		catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return alist;
	}

	
}
