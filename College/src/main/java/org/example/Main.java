package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {
        SessionFactory sf= HibernateConfig.getSessionFactory();
        Session se=sf.openSession();
        Transaction tx=se.beginTransaction();
        College c1 = new College();
        c1.setCid(146);
        c1.setCname("cmr");
        c1.setRank(17);
        se.save(c1);
        tx.commit();
        se.close();

    }
}
