package com.beanscope.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("StudentBean")
//@Scope(value = "prototype")
public class Student{
	
	String name;
	
	public Student() {
		System.out.println("Student Object Created...");
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}