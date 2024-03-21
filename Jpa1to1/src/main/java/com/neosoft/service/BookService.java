package com.neosoft.service;

import org.springframework.stereotype.Service;

import com.neosoft.model.Book;

@Service
public interface BookService {
	
	Book saveBook(Book book);
	Book findByBookId(int bookId);
}
