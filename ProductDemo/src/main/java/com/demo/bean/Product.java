package com.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue
	private int id;
	private String prodname;
	private String brandname;
	private int quantity;
	private int stock;
	public Product(int id, String prodname, String brandname, int quantity, int stock) {
		super();
		this.id = id;
		this.prodname = prodname;
		this.brandname = brandname;
		this.quantity = quantity;
		this.stock = stock;
	}
	
	public Product(String prodname, String brandname, int quantity, int stock) {
		super();
		this.prodname = prodname;
		this.brandname = brandname;
		this.quantity = quantity;
		this.stock = stock;
	}

	public Product() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", prodname=" + prodname + ", brandname=" + brandname + ", quantity=" + quantity
				+ ", stock=" + stock + "]";
	}
	
}
