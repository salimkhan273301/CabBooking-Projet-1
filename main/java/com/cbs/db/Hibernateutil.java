package com.cbs.db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernateutil {

	public static SessionFactory sessionFactory;
	static {
		try {
			sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}catch(Exception e)
		{
		System.out.print(e);	
		}		
	}
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
}
