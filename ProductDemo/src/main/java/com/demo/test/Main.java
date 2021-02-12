package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class Main {
	public static void main(String[] args) {
		ProductService productService=new ProductServiceImpl();
	Scanner scanner = new Scanner(System.in);
	int choice=0;
	do {
		System.out.println("1.Add product\n2.Display All Product\n3.Delete by id\n4.update by id\n5.display by id\n6.exit");
		System.out.println("Enter choice:");
		choice = scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter Productname");
			String pname=scanner.next();
			System.out.println("Enter Brandname");
			String bname=scanner.next();
			System.out.println("Enter qty");
			int qty=scanner.nextInt();
			System.out.println("Enter stock");
			int stock=scanner.nextInt();
			productService.addProduct(new Product( pname, bname, qty, stock));
			break;
		case 2:
			List<Product> productList=productService.displayAllProduct();
			productList.forEach(System.out::println);
			break;
		case 3:
			System.out.println("Enter Id:");
			int id=scanner.nextInt();
			boolean ans=productService.deleteProduct(id);
			if(ans)
				System.out.println("Deleted successfully..");
			System.out.println("Invalid Data");
			break;
		case 4:
			System.out.println("Enter Id:");
			id=scanner.nextInt();
			Product product= productService.findById(id);
			System.out.println("Enter prodname:");
			pname=scanner.next();
			product.setProdname(pname);
			System.out.println("Enter Brandname:");
			bname=scanner.next();
			
			product.setBrandname(bname);
			productService.addProduct(product);
			
			break;
		case 5:
			System.out.println("Enter Id:");
			id=scanner.nextInt();
			product= productService.findById(id);
			if(product!=null) 
				System.out.println(product);
			System.out.println("Invalid Id...");	
			break;
		case 6:
			System.exit(0);
			break;
		}
	}while(choice!=0);
	}
}
