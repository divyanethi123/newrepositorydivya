package com.study;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class main {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("hibernate.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		Student sravya=new Student();
		sravya.setId(987);
		sravya.setName("krishna");
		sravya.setMarks(904);	
		sravya.setId(9775);
		sravya.setName("sukanya");
		sravya.setMarks(546);
		se.save(sravya);
		tx.commit();
		se.close();
	}

}
