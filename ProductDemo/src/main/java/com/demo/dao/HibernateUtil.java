package com.demo.dao;

import java.io.FileReader;
import java.util.Properties;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.demo.bean.Product;


public class HibernateUtil {
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory() {
		if(sessionFactory==null) {
			try {
				Configuration configuration=new Configuration();
				
				Properties properties=new Properties();
				//properties.load(new FileReader("./src/main/resources/application.property"));
				properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				properties.put(Environment.URL, "jdbc:mysql://localhost:3306/advDB");
				properties.put(Environment.USER, "root");
				properties.put(Environment.PASS, "root");
				properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
				properties.put(Environment.HBM2DDL_AUTO, "update");
				properties.put(Environment.SHOW_SQL, "true");
				properties.put(Environment.FORMAT_SQL, "true");
				//properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				
				configuration.addAnnotatedClass(Product.class);
				configuration.setProperties(properties);
				
				ServiceRegistry registry = new StandardServiceRegistryBuilder()
											.applySettings(configuration.getProperties())
											.build();
				sessionFactory= configuration.buildSessionFactory(registry);
				
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
		return sessionFactory;
	}
}
