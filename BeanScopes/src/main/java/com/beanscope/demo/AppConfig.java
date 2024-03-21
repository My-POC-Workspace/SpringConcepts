package com.beanscope.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	
	@Bean("StudentBean")
	@Lazy
	@Scope(value = "prototype")
	public Student getStudent() {
		return new Student();
	}
	

}
