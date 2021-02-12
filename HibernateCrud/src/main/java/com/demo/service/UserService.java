package com.demo.service;

import java.util.List;
import java.util.Scanner;


import com.demo.bean.User;

public interface UserService {

	void addData(Scanner scanner);

	List<User> displayAll();

	User FindById(int uid);

	boolean deleteById(int uid);

	boolean updateById(int uid, String name, String city);

}
