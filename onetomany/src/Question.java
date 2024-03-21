package com.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Question {
	
	@Id
	private int qnsId;
	private String qnsName;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "question")
	private List<Answer> answers;

	public Question() {
		super();
		System.out.println("Default Constructor of Question : ");
	}

	public Question(int qnsId, String qnsName, List<Answer> answers) {
		super();
		this.qnsId = qnsId;
		this.qnsName = qnsName;
		this.answers = answers;
	}

	public int getQnsId() {
		return qnsId;
	}

	public void setQnsId(int qnsId) {
		this.qnsId = qnsId;
	}

	public String getQnsName() {
		return qnsName;
	}

	public void setQnsName(String qnsName) {
		this.qnsName = qnsName;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question [qnsId=" + qnsId + ", qnsName=" + qnsName + ", answers=" + answers + "]";
	}
	
	
	
}
