package com.study.godofjava.chapter27.io;

import java.io.Serializable;

public class SeriaDTO implements Serializable {

	private static final long serialVersionUID = 2L;

	private String bookName;
	private int bookOrder;
	private boolean bestSeller;
	private long soldPerDay;
	private String bookType = "IT";

	public SeriaDTO(String bookName, int bookOrder, boolean bestSeller, long soldPerDay) {
		super();
		this.bookName = bookName;
		this.bookOrder = bookOrder;
		this.bestSeller = bestSeller;
		this.soldPerDay = soldPerDay;
	}

	public SeriaDTO(String bookName, int bookOrder, boolean bestSeller, long soldPerDay, String bookType) {
		super();
		this.bookName = bookName;
		this.bookOrder = bookOrder;
		this.bestSeller = bestSeller;
		this.soldPerDay = soldPerDay;
		this.bookType = bookType;
	}

	@Override
	public String toString() {
		return "SeriaDTO [bookName=" + bookName + ", bookOrder=" + bookOrder + ", bestSeller=" + bestSeller
				+ ", soldPerDay=" + soldPerDay + ", bookType=" + bookType + "]";
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookOrder() {
		return bookOrder;
	}

	public void setBookOrder(int bookOrder) {
		this.bookOrder = bookOrder;
	}

	public boolean isBestSeller() {
		return bestSeller;
	}

	public void setBestSeller(boolean bestSeller) {
		this.bestSeller = bestSeller;
	}

	public long getSoldPerDay() {
		return soldPerDay;
	}

	public void setSoldPerDay(long soldPerDay) {
		this.soldPerDay = soldPerDay;
	}

}
