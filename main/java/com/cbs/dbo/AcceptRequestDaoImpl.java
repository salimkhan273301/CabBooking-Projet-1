package com.cbs.dbo;

import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cbs.db.Hibernateutil;
import com.cbs.model.BookingStatus;
import com.cbs.model.Request;

public class AcceptRequestDaoImpl implements AcceptRequestDao {

	private static final Logger logger = Logger.getLogger("AcceptRequestDao.class");

	//@Override
	public boolean acept(Integer id) {
		Session session = Hibernateutil.getSessionFactory().openSession();
		Transaction tx = null;
		
		logger.info("Within AcceptRequestDao");
		try {
			tx = session.beginTransaction();
			Request r = (Request) session.get(Request.class, id);
			BookingStatus cs = new BookingStatus(2,"Accepted");
			r.setbId(cs);
			session.update(r);
			session.flush();
			tx.commit();
			logger.info("Success in updating Booking Status to Accepted");
		} catch (Exception e) {
			if(tx!=null)
				tx.rollback();
			logger.info("Couldn't update booking status");			
			e.printStackTrace();
			return false;
		}
		finally {
			session.close();
		}
		return true;
	}

	
}
