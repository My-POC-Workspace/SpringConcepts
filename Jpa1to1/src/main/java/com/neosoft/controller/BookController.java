package com.neosoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.model.Book;
import com.neosoft.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@PostMapping(value="/savebook")
	public  Book saveBook(@RequestBody Book book)
	{
		Book bookResp=bookService.saveBook(book);
		return bookResp;
	}
	@GetMapping(value="/{bookid}")
	public Book getBookDetail(@PathVariable int bookid)
	{
		Book bookResp=bookService.findByBookId(bookid);
		
		return bookResp;
		
	}
} 
