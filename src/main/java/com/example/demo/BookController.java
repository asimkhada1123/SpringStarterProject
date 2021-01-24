package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {
	
	@Autowired
	BookDao book; 
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/book/all")
	public String getBooks(Model model) {	
		model.addAttribute("name",book.getallBooks());
		return "greeting"; 
	}
	
	@GetMapping("/book")
	public String getSingleBook(@RequestParam(name="isbn",required=false) String name, Model model) {
		if(null == name || book.getBookByIsbn(name)==null) {
			model.addAttribute("name", book.getallBooks()); 
			return "greeting"; 
		}
		
		model.addAttribute("name",book.getBookByIsbn(name)); 
		return "index"; 
	}
	

	
}
