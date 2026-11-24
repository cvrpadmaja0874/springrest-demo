package com.example.demo;

public class Coupon {
    private String code;
    private double discount; // e.g., 10.0 for 10% off
    
	public Coupon() {
		super();
	}

	public Coupon(String code, double discount) {
		super();
		this.code = code;
		this.discount = discount;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}   
}

