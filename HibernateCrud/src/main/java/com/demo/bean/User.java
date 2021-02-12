package com.demo.bean;


import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="users")
public class User {
	@Id
	@GeneratedValue
	private int uid;
	@Column(name="uname",length=25,nullable=false)
	private String uname;
	@Embedded
	private Address address;
	public User(int uid, String uname, Address address) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.address = address;
	}
	
	public User() {
		super();
	}

	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", address=" + address + "]";
	}
	
}
