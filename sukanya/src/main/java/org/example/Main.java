package org.example;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static  void main(String[] args)
    {
        Configuration cf = new Configuration();
        cf.configure("hibernate.xml");
        SessionFactory sf = cf.buildSessionFactory();
        Session se = sf.openSession();
        Criteria cr=se.createCriteria(Product.class);
        Criterion cn=  Restrictions.ge("price",1700);
       // Query qr=se.createQuery(" from Product p  where product_id= :input");
      //  qr.setParameter("input",186);
        cr.add(cn);
        List li= cr.list();
        Iterator i=li.iterator();
         while(i.hasNext())
         {
          //  Object []o=(Object[]) i.next();
          //   System.out.println(o[0]+" "+o[1]+" "+o[2]);
             Product p=(Product) i.next();
             System.out.println(p.getProduct_id()+" "+p.getProduct_name()+" "+p.getPrice());
         }

    }
}