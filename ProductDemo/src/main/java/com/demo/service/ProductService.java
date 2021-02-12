package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.Product;

public interface ProductService {

	void addProduct(Product product);

	List<Product> displayAllProduct();

	boolean deleteProduct(int id);

	Product findById(int id);

}
