package com.demo.dao;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public  static SessionFactory sessionFactory;
	
	public static SessionFactory mySessionFactory() {
		if(sessionFactory==null) {
			sessionFactory=new Configuration().configure().buildSessionFactory();
		}
		return sessionFactory;
	}
	
}
