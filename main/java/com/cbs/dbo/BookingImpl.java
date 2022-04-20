package com.cbs.dbo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cbs.db.Hibernateutil;
import com.cbs.model.BookingStatus;
import com.cbs.model.Employee;
import com.cbs.model.Request;

public class BookingImpl implements Booking {

	
	
	public boolean requestCab() {

		Session session = Hibernateutil.getSessionFactory().openSession();
		Transaction tx=null;
		
		try {
			tx = session.beginTransaction();
			BookingStatus b = new BookingStatus(1,"Requested");
			for(Employee e : ValidateUser.elist) {
			Request rq = new Request(e,b);
			session.save(rq);
			}
			   
			tx.commit();
			
			return true;
		} catch (HibernateException e) {
			if (tx != null) {
                tx.rollback();
            }
			e.printStackTrace();
		} finally {
			session.close();
		}
		return false;
	}


}
