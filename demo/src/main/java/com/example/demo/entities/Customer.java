package com.example.demo.entities;

public class Customer {
	private long id;
	private String name;
	private String email;
	private String number;
	private String city;
	
	public Customer(long id, String name, String email, String number, String city) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.number = number;
		this.city = city;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", number=" + number + ", city=" + city
				+ "]";
	}

}
