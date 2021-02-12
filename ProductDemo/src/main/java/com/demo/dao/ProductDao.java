package com.demo.dao;

import java.util.List;

import com.demo.bean.Product;

public interface ProductDao {

	void save(Product product);

	List<Product> displayAllProduct();

	boolean deleteById(int id);

	Product findById(int id);

}
