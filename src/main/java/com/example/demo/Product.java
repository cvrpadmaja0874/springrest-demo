package com.example.demo; // Keep your package name

public class Product {
    private int id;
    private String name;
    private double price;
    private String couponCode; // Optional: to apply a discount
	public Product() {
		super();
	}
	public Product(int id, String name, double price, String couponCode) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.couponCode = couponCode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
}
