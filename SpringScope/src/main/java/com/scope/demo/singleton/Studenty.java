package com.scope.demo.singleton;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;


@Component("Stud")
@Data
@AllArgsConstructor
public class Studenty {
	
	private long id;
	private String name;

	public Studenty() {
		super();
		System.out.println("in singleton class");
	}
	
	
	
//	public void msg() {
//		System.out.println("in student msg...");
//		address.addressMethod();
//	}

}
