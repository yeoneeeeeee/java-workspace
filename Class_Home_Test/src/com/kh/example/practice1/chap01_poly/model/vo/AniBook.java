package com.kh.example.practice1.chap01_poly.model.vo;

public class AniBook extends Book {

	private int accessAge;

	public AniBook(String title, String author, String publisher, int accessAge) {
		this.accessAge = accessAge;
	}

	@Override
	public String toString() {
		return "AniBook [accessAge=" + accessAge + ", toString()=" + super.toString() + "]";
	}

}
