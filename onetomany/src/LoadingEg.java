package com.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LoadingEg {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("com/onetomany/hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
	
		Question question = (Question)session.get(Question.class, 1);
		System.out.println("================================================================");
		System.out.println(question.getQnsId());
		System.out.println(question.getQnsName());
//		System.out.println(question.getAnswers().size());
		tx.commit();
		
		session.close();
		factory.close();
		
	}
}
