package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestQA {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("com/onetomany/hibernate.cfg.xml").buildSessionFactory();
		
		Question q1 = new Question();
		q1.setQnsId(1);
		q1.setQnsName("Java");
		
		
		Answer a1 = new Answer();
		a1.setAnsId(10);
		a1.setAnsName("Java-Language : ");
		a1.setQuestion(q1);
		
		Answer a2 = new Answer();
		a2.setAnsId(20);
		a2.setAnsName("JAVA - pROGRAMMING :");
		a2.setQuestion(q1);
		
		List<Answer> list = new ArrayList<>();
		list.add(a1);
		list.add(a2);
		
		q1.setAnswers(list);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(q1);
		
//		session.save(a1); //No need to save ans , if we use cascading here : 
//		session.save(a2);
		tx.commit();
		
		session.close();
		factory.close();
		
	}
}
