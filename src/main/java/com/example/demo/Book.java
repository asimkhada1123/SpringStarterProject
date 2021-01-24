package com.example.demo;

public class Book {
	private String isbn,title,author;
	private double cost;
	
	public Book(String isbn, String title, String author, double cost)
	{
		super(); 
		this.isbn = isbn; 
		this.title = title;
		this.author = author; 
		this.cost = cost; 
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
	
	public double getCost() {
		return cost;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
}
