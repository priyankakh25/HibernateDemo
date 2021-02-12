package com.demo.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.bean.Product;

public class ProductDaoImpl implements ProductDao{
	private static SessionFactory sessionFactory;
	
	public ProductDaoImpl() {
		sessionFactory=HibernateUtil.getSessionFactory();
	}
	@Override
	public void save(Product product) {
		Session session= sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.saveOrUpdate(product);
		transaction.commit();
		session.close();
	}
	@Override
	public List<Product> displayAllProduct() {
		Session session= sessionFactory.openSession();
		Query query = session.createQuery("from product");
		Transaction transaction=session.beginTransaction();
		List<Product> plist=query.list();
		transaction.commit();
		session.close();
		return plist;
	}
	@Override
	public boolean deleteById(int id) {
		Session session= sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Product product=session.get(Product.class, id);
		if(product!=null) {
			session.delete(product);
			transaction.commit();
			session.close();
			return true;
		}else {
			session.close();
			return false;
		}		
	}
	@Override
	public Product findById(int id) {
		Session session =sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Product product=session.get(Product.class, id);
		return product;
	}

}
