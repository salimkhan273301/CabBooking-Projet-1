package com.cbs.db;

import java.util.List;

import javax.servlet.ServletException;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.cbs.model.Cab;
import com.cbs.model.Employee;

public class HibernateService {
	public static SessionFactory sessionFactory=Hibernateutil.sessionFactory;
public static void saveEmployee(Employee emp) throws HibernateException, Exception {
	
	Session session=sessionFactory.openSession();
	Transaction txn=session.beginTransaction();
	session.save(emp);
	txn.commit();
	session.close();
	
}
	





public Employee searchbyemailpass(String email, String password) {
	
	Session session=sessionFactory.openSession();
	Criteria criteria=session.createCriteria(Employee.class);
	criteria.add(Restrictions.eq("email",email));
	criteria.add(Restrictions.eq("password",password));
	Employee emp=(Employee)criteria.uniqueResult();
	
	session.close();
	
	return emp;
}






public static void saveCab(Cab cab)throws HibernateException, Exception {
	
	
	Session session=sessionFactory.openSession();
	Transaction txn=session.beginTransaction();
	session.save(cab);
	txn.commit();
	session.close();
	
}

/**
 * Update User
 * @param user
 */
public void updateEmployee(Employee emp) {
	
try {	Session session=sessionFactory.openSession();
	Transaction txn=session.beginTransaction();
		session.update(emp);
		// commit transaction
		txn.commit();
		session.close();
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}

/**
 * Delete User
 * @param id
 */
public void deleteEmployee(int id) {

	Transaction transaction = null;
	try  {
		Session session=sessionFactory.openSession();
		// start a transaction
		transaction = session.beginTransaction();

		// Delete a user object
		Employee emp = (Employee) session.get(Employee.class, id);
		if (emp != null) {
			session.delete(emp);
			System.out.println("user is deleted");
		}

		// commit transaction
		transaction.commit();
	} catch (Exception e) {
		if (transaction != null) {
			transaction.rollback();
		}
		e.printStackTrace();
	}
}

/**
 * Get User By ID
 * @param id
 * @return
 */
public Employee getEmployee(int id) {

	Transaction transaction = null;
	Employee emp = null;
	try  {
		Session session=sessionFactory.openSession();
		// start a transaction
		transaction = session.beginTransaction();
		// get an user object
		emp = (Employee) session.get(Employee.class, id);
		// commit transaction
		transaction.commit();
	} catch (Exception e) {
		if (transaction != null) {
			transaction.rollback();
		}
		e.printStackTrace();
	}
	return emp;
}

/**
 * Get all Users
 * @param listOfemp 
 * @return
 */
@SuppressWarnings("unchecked")
public List<Employee> getAllEmployee(Query listOfemp) {

	Transaction transaction = null;
	
	try  {
		Session session=sessionFactory.openSession();
		// start a transaction
		transaction = session.beginTransaction();
		// get an user object
		
		listOfemp = session.createQuery("from Employee");
		
		// commit transaction
		transaction.commit();
	} catch (Exception e) {
		if (transaction != null) {
			transaction.rollback();
		}
		e.printStackTrace();
	}
	return (List<Employee>) listOfemp;
}



}
