package com.neosoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.model.Book;
import com.neosoft.model.Story;
import com.neosoft.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookRepository bookRepository;

	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		Story story=book.getStory();
		story.setBook(book);
		book=bookRepository.save(book);
		return book;
	}


	public Book findByBookId(int bookId) {
		// TODO Auto-generated method stub
		Book book=bookRepository.findByBookId(bookId);
				
		return book;
	}

}
