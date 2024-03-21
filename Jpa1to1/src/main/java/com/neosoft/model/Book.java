package com.neosoft.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

// This project give the example of association
@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookid;
	private String bookname;


	@OneToOne(cascade = CascadeType.ALL,mappedBy = "book")
	private Story story;


	public int getBookid() {
		return bookid;
	}


	public void setBookid(int bookid) {
		this.bookid = bookid;
	}


	public String getBookname() {
		return bookname;
	}


	public void setBookname(String bookname) {
		this.bookname = bookname;
	}


	public Story getStory() {
		return story;
	}


	public void setStory(Story story) {
		this.story = story;
	}
	
	
}
