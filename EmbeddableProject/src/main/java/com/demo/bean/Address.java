package com.demo.bean;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private int aid;
	private String street,city;
	private String pin;
	public Address(int aid, String street, String city, String pin) {
		super();
		this.aid = aid;
		this.street = street;
		this.city = city;
		this.pin = pin;
	}
	public Address() {
		super();
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", street=" + street + ", city=" + city + ", pin=" + pin + "]";
	}
	
	
}
