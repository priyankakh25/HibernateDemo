package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.Address;
import com.demo.bean.User;
import com.demo.dao.UserDao;
import com.demo.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
	UserDao userDao = new UserDaoImpl();
	
	@Override
	public void addData(Scanner scanner) {
		System.out.println("Enter uid");
		int uid=scanner.nextInt();
		System.out.println("Enter name");
		String uname=scanner.next();
		System.out.println("Enter aid");
		int aid=scanner.nextInt();
		System.out.println("Enter street");
		scanner.nextLine();
		String street=scanner.nextLine();
		System.out.println("Enter city");
		String city=scanner.next();
		System.out.println("Enter pin");
		String pin=scanner.next();
		Address address=new Address(aid, street, city, pin);
		User user=new User(uid, uname, address);
		userDao.save(user);
		
	}
	@Override
	public List<User> displayAll() {
		
		return userDao.DisplayAll();
	}
	@Override
	public User FindById(int uid) {
		
		return userDao.findById(uid);
	}
	@Override
	public boolean deleteById(int uid) {
		
		return userDao.deleteById(uid);
	}
	@Override
	public boolean updateById(int uid, String name, String city) {
		
		return userDao.update(uid,name,city);
	}
	

}
