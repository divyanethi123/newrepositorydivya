package com.motivity;

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
		CreaditCard card1=new CreaditCard();
		card1.setCardNumber(178787);
		card1.setCardType("visa");
		card1.setExpire(2024);
		card1.setCvv(109);
		card1.setAccountNumber(786768);
		card1.setPayment_id(189);
		card1.setPurpose("hospetal");
		card1.setAmount(50000);
		se.save(card1);
		tx.commit();
		se.close();

}
}
