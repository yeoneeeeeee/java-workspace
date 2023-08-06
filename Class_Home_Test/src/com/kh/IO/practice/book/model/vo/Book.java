package com.kh.IO.practice.book.model.vo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class Book implements Serializable{

	private String title;
	private String author;
	private int price;
	private Calendar date;
	private double discount;
	
	public Book() {

	}

	public Book(String title, String author, int price, Calendar date, double discount) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.date = date;
		this.discount = discount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
//	필드의 값을 반환. 단, date필드는 SimpleDateFormat을 통해
//	“yyyy년 MM월 dd일”로 반환되게 함
	
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String formatDate = sdf.format(new Date(date.getTimeInMillis()));
		
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", date=" + formatDate + ", discount="
				+ discount + "]";
	}

}
