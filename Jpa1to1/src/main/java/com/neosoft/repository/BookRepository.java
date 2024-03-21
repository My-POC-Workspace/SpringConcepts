package com.neosoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.model.Book;

public interface BookRepository extends JpaRepository<Book, String> {
	
	public Book findByBookId(int bookId);

}
