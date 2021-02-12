package com.demo.dao;

import java.util.List;

import com.demo.bean.User;

public interface UserDao {

	void save(User user);

	List<User> DisplayAll();

	User findById(int uid);

	boolean deleteById(int uid);

	boolean update(int uid, String name, String city);

}
