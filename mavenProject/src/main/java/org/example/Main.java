package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Configuration cf=new Configuration();
        cf.configure("hiberbnate.xml");
        SessionFactory sf=cf.buildSessionFactory();
        Session se=sf.openSession();
        Transaction tx=se.beginTransaction();
         Tablet t1=new Tablet();
         t1.setTname("crocin");
         t1.setPrice(170);
         t1.setPurpose("cold");
        Tablet t2=new Tablet();
        t2.setTname("parachithomol");
        t2.setPrice(190);
        t2.setPurpose("headace");
        ArrayList<Tablet> list1=new ArrayList<Tablet>();
        list1.add(t1);
        list1.add(t2);
        Medical m1=new Medical();
        m1.setId(190);
        m1.setMname("apolo");
        m1.setTablets(list1);
        se.save(m1);
        se.save(t1);

        se.persist(m1);
        tx.commit();
        se.close();
        System.out.println("success");

    }
}