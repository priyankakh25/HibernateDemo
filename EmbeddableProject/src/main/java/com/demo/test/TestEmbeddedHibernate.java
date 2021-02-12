package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Address;
import com.demo.bean.User;



public class TestEmbeddedHibernate {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Address address=new Address(204,"Near jspm college","Pune","40210");
		User user=new User(102,"Priyanka",address);
		session.save(user);
		User u=session.load(User.class, 1);
		System.out.println(u);
		transaction.commit();
		session.close();	
	}

}
