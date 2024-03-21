package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("com/manytomany/hibernate.cfg.xml").buildSessionFactory();
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		Project p1 = new Project();
		Project p2 = new Project();
		
		e1.setEmpId(1);
		e1.setEmpName("Rahul");
		e2.setEmpId(2);
		e2.setEmpName("Umesh");
		
		p1.setProjectId(10);
		p1.setProjectName("JAVA");
		p2.setProjectId(20);
		p2.setProjectName("Python");
		
		List<Employee> list1 = new ArrayList<>();
		List<Project> list2 = new ArrayList<>();
		
		list1.add(e1);
		list1.add(e2);
		
		list2.add(p1);
		list2.add(p2);
		
		e1.setProjects(list2);
		p2.setEmployees(list1);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		
		
		tx.commit();
		
		session.close();
		factory.close();
	}
}
