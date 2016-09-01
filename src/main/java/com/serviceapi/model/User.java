package com.serviceapi.model;

import java.util.UUID;

public class User {
	
	private String id;
	private String name;
	private int age;
	private boolean sex;
	private String address;
	private String tel;
	private String pin;
	
	public User() {
		this.id = UUID.randomUUID().toString().trim().replaceAll("-", "");
		this.name = "大师兄";
		this.age = 28;
		this.sex = false;
		this.address = "花果山";
		this.tel = "100000010";
		this.pin = "ABCDEFGHIJKLN123456";
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isSex() {
		return sex;
	}
	
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getPin() {
		return pin;
	}
	
	public void setPin(String pin) {
		this.pin = pin;
	}
}
