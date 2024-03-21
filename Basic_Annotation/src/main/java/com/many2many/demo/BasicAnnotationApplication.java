package com.many2many.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// If we give both @Qualifier or @Primary, server will take @Qualifier as priority
// If we dont want to use both, we can use autowire byname
// @Autowired
// private Speed car; --> Autowired ByName
@SpringBootApplication
public class BasicAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicAnnotationApplication.class, args);
	}

}
