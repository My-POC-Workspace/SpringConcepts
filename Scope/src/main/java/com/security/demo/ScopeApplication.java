package com.security.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.scopee.Student;

@SpringBootApplication
public class ScopeApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ScopeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/scopee/config.xml");
		Student s1 = (Student) context.getBean("student");
		System.out.println(s1.hashCode());
//		System.out.println(s1.getId());
//		System.out.println(s1.getName());
		
		Student s2 = (Student) context.getBean("student");
		System.out.println(s2.hashCode());
	}
		
	}

}
