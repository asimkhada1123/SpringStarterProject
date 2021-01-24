package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class BookDao{

	List<Book> list = new ArrayList<Book>(); 
	
	public BookDao() {
		//Adding values in the constructor 
		//String isbn, String title, String author, double cost
		Book b = new Book("123","a","b",2.0); 
		list.add(b); 
		Book b1 = new Book("1234","aa","bb",3.0); 
		list.add(b1); 
	}
	
	public List<Book> getallBooks(){
		return list; 
	}
	
	public Book getBookByIsbn(String isbn) {
		
		for(int i = 0; i<list.size(); i++){
			if(list.get(i).getIsbn().equals(isbn))
			{
				return list.get(i); 
			}
		}
		return null; 
	}
}
