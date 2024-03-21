package com.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	@Id
	private int ansId;
	private String ansName;
	
	@ManyToOne
	private Question question;

	public Answer() {
		super();
		System.out.println("Default Constructor of Answer : ");
	}

	public Answer(int ansId, String ansName, Question question) {
		super();
		this.ansId = ansId;
		this.ansName = ansName;
		this.question = question;
	}

	public int getAnsId() {
		return ansId;
	}

	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}

	public String getAnsName() {
		return ansName;
	}

	public void setAnsName(String ansName) {
		this.ansName = ansName;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Answer [ansId=" + ansId + ", ansName=" + ansName + ", question=" + question + "]";
	}
	
	
}
