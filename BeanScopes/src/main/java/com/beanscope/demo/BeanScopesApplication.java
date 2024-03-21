package com.beanscope.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class BeanScopesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanScopesApplication.class, args);
		AbstractApplicationContext apx = new AnnotationConfigApplicationContext(AppConfig.class);
// 		AbstractApplicationContext apx = new AnnotationConfigApplicationContext(Student.class);

		System.out.println("Object will not get created until and unless we will not call below method...");
		
	//	 if we put @Lazy on StudentBean then whether it's singleton or prototype, bean will not get created until and unless we will call this...
		Student s1 = apx.getBean("StudentBean",Student.class);
		s1.name = "Rahul";
		System.out.println(s1.name);
		System.out.println(s1.hashCode());
		
		Student s2 = apx.getBean("StudentBean",Student.class);
		System.out.println(s2.name);
		System.out.println(s2.hashCode());
		
		
				
		
	}

}
