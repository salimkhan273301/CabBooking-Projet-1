package usefulfiles;



import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;


public class HibernateConnection {
	
	public static SessionFactory sessionFactory() {
		SessionFactory sessionFactory=null;
		if(sessionFactory==null)
		{
		sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
			return sessionFactory; 
	  }
	
}