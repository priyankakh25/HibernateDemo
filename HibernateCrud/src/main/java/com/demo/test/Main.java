package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.User;
import com.demo.service.UserService;
import com.demo.service.UserServiceImpl;

public class Main {

	public static void main(String[] args) {
		UserService userService=new UserServiceImpl();
		int choice=0;
		Scanner scanner=new Scanner(System.in);
		do {
			System.out.println("1.add new User\n2.display all user\n3.display by id\n4.delete by id\n5.update user city\n6.exit");
			System.out.println("Enter choice");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
				userService.addData(scanner);
				break;
			case 2:
				List<User> userList=userService.displayAll();
				userList.forEach(System.out::println);
				break;
			case 3:
				System.out.println("Enter uid");
				int uid=scanner.nextInt();
				User user=userService.FindById(uid);
				if(user!=null) {
					System.out.println(user);
				}else {
					System.out.println("Invalid id");
				}
				break;
			case 4:
				System.out.println("Enter uid");
				uid=scanner.nextInt();
				boolean ans=userService.deleteById(uid);
				if(ans) {
					System.out.println("Deleted successfully...");
				}else {
					System.out.println("Invalid id");
				}
				break;
			case 5:
				System.out.println("Enter uid");
				uid=scanner.nextInt();
				System.out.println("Enter name");
				String name=scanner.next();
				System.out.println("Enter city");
				String city=scanner.next();
				ans=userService.updateById(uid,name,city);
				if(ans) {
					System.out.println("Updated successfully...");
				}else {
					System.out.println("Invalid id");
				}
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
			}
		}while(choice!=6);
	}

}
