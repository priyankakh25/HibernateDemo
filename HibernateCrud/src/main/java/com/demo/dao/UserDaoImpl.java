package com.demo.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.demo.bean.User;

public class UserDaoImpl implements UserDao{
	private static SessionFactory sessionFactory;
	public  UserDaoImpl(){
		sessionFactory=HibernateUtil.mySessionFactory();
	}
	@Override
	public void save(User user) {
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		session.save(user);
		
		transaction.commit();
		session.close();
	}
	@Override
	public List<User> DisplayAll() {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from User");
		Transaction transaction=session.beginTransaction();
		List<User> ulist=query.list();
		transaction.commit();
		session.close();
		return ulist;
	}
	@Override
	public User findById(int uid) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		User u=session.get(User.class, uid);
		transaction.commit();
		session.close();
		return u;
	}
	@Override
	public boolean deleteById(int uid) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		User u=session.get(User.class, uid);
		if(u!=null) {
			session.delete(u);
			transaction.commit();
			session.close();
			return true;
		}else {
			session.close();
			return false;
		}
	}
	@Override
	public boolean update(int uid, String name, String city) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		User u=session.get(User.class, uid);
		if(u!=null) {
			u.setUname(name);
			u.getAddress().setCity(city);
			session.update(u);
			transaction.commit();
			session.close();
			return true;
		}
		
		return false;
	}
	
}
