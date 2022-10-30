package com.example.demo.entities;

public class ShippingDetails {
	private String address;
	private String city;
	private int pincode;
	private long pid;
	private long cid;
	public ShippingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShippingDetails(String address, String city, int pincode, long pid, long cid) {
		super();
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.pid = pid;
		this.cid = cid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "ShippingDetails [address=" + address + ", city=" + city + ", pincode=" + pincode + ", pid=" + pid
				+ ", cid=" + cid + "]";
	}
	

}
