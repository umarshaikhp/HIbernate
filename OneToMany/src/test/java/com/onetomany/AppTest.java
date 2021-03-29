package com.onetomany;


import java.util.ArrayList;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppTest {
	public static void main(String[] args) {
		
	
SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
Session session=sessionFactory.openSession();
org.hibernate.Transaction transaction=session.beginTransaction();

Answer ans1=new Answer();    
ans1.setAnswername("Java is a programming language");    
ans1.setPostedBy("khalid Ansari");    
    
Answer ans2=new Answer();    
ans2.setAnswername("Java is a platform");    
ans2.setPostedBy("Mohmmed");    
    
Answer ans3=new Answer();    
ans3.setAnswername("Servlet is an Interface");    
ans3.setPostedBy("khalid khan");    
    
Answer ans4=new Answer();    
ans4.setAnswername("Servlet is an API");    
ans4.setPostedBy("umar shaikh");    
    
ArrayList<Answer> list1=new ArrayList<Answer>();    
list1.add(ans1);    
list1.add(ans2);    
    
ArrayList<Answer> list2=new ArrayList<Answer>();    
list2.add(ans3);    
list2.add(ans4);    
    
Question question1=new Question();    
question1.setQname("What is Java?");    
question1.setAnswers(list1);
    
Question question2=new Question();    
question2.setQname("What is Servlet?");    
question2.setAnswers(list2);
ans1.setQuestion(question1);
ans2.setQuestion(question1);
ans3.setQuestion(question2);
ans4.setQuestion(question2);




//Question question = session.get(Question.class, 4);
//session.delete(question);

session.persist(question1);
session.persist(question2);

transaction.commit();
session.close();
System.out.println("Done");


	}











}
