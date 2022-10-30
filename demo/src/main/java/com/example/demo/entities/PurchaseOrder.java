package com.example.demo.entities;

public class PurchaseOrder {
	
	private String product_name;
	private String quantity;
	private int price;
	private int mrp;
	private long id;
	private long cid;
	public PurchaseOrder(String product_name, String quantity, int price, int mrp, long id, long cid) {
		super();
		this.product_name = product_name;
		this.quantity = quantity;
		this.price = price;
		this.mrp = mrp;
		this.id = id;
		this.cid = cid;
	}
	public PurchaseOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMrp() {
		return mrp;
	}
	public void setMrp(int mrp) {
		this.mrp = mrp;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "PurchaseOrder [product_name=" + product_name + ", quantity=" + quantity + ", price=" + price + ", mrp="
				+ mrp + ", id=" + id + ", cid=" + cid + "]";
	}
	
}
