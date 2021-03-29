package com.secondcache1;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppTest{
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory2 = configuration.buildSessionFactory();
		Session session = sessionFactory2.openSession();
		Transaction transaction = session.beginTransaction();
		Session session2 = sessionFactory2.openSession();

		Employee employee1 = session.load(Employee.class, 1);
		System.out.println(employee1.getName()+""+employee1.getSalary());
		
		Employee employee2 = session2.load(Employee.class, 1);
		System.out.println(employee2.getName());
		

//org.hibernate.Query query = session.createQuery("update Employee set id = :id");
//query.setParameter("id",10);
//int rr = query.executeUpdate();
//System.out.println(rr);

		
//		Employee employee = new Employee();
//		employee.setName("umarshaikh");
//		employee.setSalary("1500");
//		session.persist(employee);
//		transaction.commit();
		System.out.println("Done");



		session.close();
		
	}





}
