package com.kh.example.practice1.chap01_poly.model.vo;

public class CookBook extends Book {

	boolean Coupon;

	public CookBook(String title, String author, String publisher, boolean Coupon){
		this.Coupon=Coupon;
	}

	@Override
	public String toString() {
		return "CookBook [Coupon=" + Coupon + ", toString()=" + super.toString() + "]";
	}
}