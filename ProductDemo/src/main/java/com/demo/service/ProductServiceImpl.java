package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {
	ProductDao productDao=new ProductDaoImpl();
	@Override
	public void addProduct(Product product) {
			
		productDao.save(product);
		
	}
	@Override
	public List<Product> displayAllProduct() {
		
		return productDao.displayAllProduct();
	}
	@Override
	public boolean deleteProduct(int id) {
		
		return productDao.deleteById(id);
	}
	@Override
	public Product findById(int id) {
		
		return productDao.findById(id);
	}

}
