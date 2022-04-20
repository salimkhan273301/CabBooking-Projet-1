package com.learn;

//import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.cbs.model.Employee;
//import com.cbs.model.Student;

//import com.cbs.model.Account;

public class HibernateAccountClient {

	
	public static void main(String[] args) {
	//Configuration configObj = new Configuration(); //1
	//	configObj.configure("hibernate.cfg.xml");

		// Since Hibernate Version 4.x, ServiceRegistry Is Being Used //2
	//ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build(); 

		// Creating Hibernate SessionFactory Instance  //3
SessionFactory sessionFactory =new Configuration().configure("com/hiber/hibernate.cfg.xml").buildSessionFactory();
		
		
		Session	session = sessionFactory.openSession(); //4
		
		Transaction tx=session.getTransaction();
		tx.begin();
			
		//Employee a5=new Employee(5, "XXXX" , "nadeem@gmail.com" , "ce", "sbS"); //transcient 

		//insert
	   // session.save(a5);   //insert into account values..... //persistent
		
	//	Account a2=new Account("Ram1234",10000.00); //transcient 

	//	session.save(a2); 
		
		//update
	/*	Account a3=(Account)session.get(Account.class, 3);
		a3.setName("Ram3333");
		session.update(a3);
		session.flush();
		*/
		
		//delete
		//Account a3=(Account)session.get(Account.class,2);
		//Account a3=(Account)session.load(Account.class,5);
		
	//	session.delete(a3);
		
		Query q=session.createQuery("from Account a"); //HQL
		//List<Student> alist=q.list();
		
		//alist.stream().forEach(a->System.out.println(a.getId()+"  "+a.getName()));
		
		//for( Student a: alist) {
		//	System.out.println(a.getId() +"  "+a.getName()+"  "+a.getEmail()+" "+a.getBranch()+" "+a.getCollege());
	//	}
		
		
		
		//tx.commit();
		//tx.rollback();
		//session.close();

	}
}


