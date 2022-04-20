package com.cbs.dbo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cbs.db.Hibernateutil;
import com.cbs.model.Employee;

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

