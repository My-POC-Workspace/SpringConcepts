package com.scope.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scope.demo.singleton.Studenty;

@SpringBootApplication
public class SpringScopeApplication {

//	@Autowired
//	private Applicationcontxprovider applicationcontxprovider;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringScopeApplication.class, args);
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com.scope.demo.singleton");
		
		Studenty studenty = applicationContext.getBean("Stud",Studenty.class);
		System.out.println(studenty.hashCode());
		
		Studenty stud1 = applicationContext.getBean("Stud",Studenty.class);
		System.out.println(studenty.hashCode());
	}

	

}
