package com.cbs.dbo;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.cbs.db.Hibernateutil;
import com.cbs.model.BookingDetails;

public class BookingHistoryImpl implements BookingHistory {
	
	public List bookingHistory(String email, String pass) {
		Session session = Hibernateutil.getSessionFactory().openSession();
		List alist=null;
		try {
			String sql = "Select b.bookingId,b.cabNo,e.id from bdetails as b, employee as e where e.email= :email and b.id=e.id";
			SQLQuery q = session.createSQLQuery(sql);
			q.setParameter("email", email);
			q.addEntity(BookingDetails.class);
			alist = q.list();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		
		return alist;
	}


}
