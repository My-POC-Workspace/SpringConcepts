package com.neosoft.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Story {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int storyid;
	private String storyname;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Book_id")
	private Book book;

	public int getStoryid() {
		return storyid;
	}

	public void setStoryid(int storyid) {
		this.storyid = storyid;
	}

	public String getStoryname() {
		return storyname;
	}

	public void setStoryname(String storyname) {
		this.storyname = storyname;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	
}
