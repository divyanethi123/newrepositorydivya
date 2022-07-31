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
		Student lucky=new Student();	
		lucky.setId(684);
		lucky.setName("sukruthi");
		lucky.setMarks(196);
		se.save(lucky);
		tx.commit();
		se.close();
	}

}
