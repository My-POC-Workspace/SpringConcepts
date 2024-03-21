package com.di.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication{

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);
		AnnotationConfigApplicationContext apx = new AnnotationConfigApplicationContext(MessageConfiguration.class);
		Message message = (Message) apx.getBean("mess");
		message.getMsg();
	}

	

}
