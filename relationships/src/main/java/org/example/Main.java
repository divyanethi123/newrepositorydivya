package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration cf=new Configuration();
        cf.configure("hibernate.xml");
        SessionFactory sf=cf.buildSessionFactory();
        Session se=sf.openSession();
        Transaction tx=se.beginTransaction();
        Travelling t2=new Travelling();
        t2.setPlace("secendrabad");
        t2.setPrice(189);
        Destination d2=new Destination();
        d2.setDplace("goa");
        d2.setDistance(9067);
        t2.setDistination(d2);
        d2.setTravell(t2);
        se.persist(t2);
        tx.commit();
        se.close();
        System.out.println("success");


    }
}