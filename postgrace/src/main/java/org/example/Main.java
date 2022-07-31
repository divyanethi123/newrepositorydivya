package org.example;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
    public static void main(String[] args) {

       // EntityManagerFactory emf= Persistence.createEntityManagerFactory("Student_details");
       // EntityManager em=emf.createEntityManager();
       // em.getTransaction().begin();

      Student s1=new Student();
      s1.setSid(109);
      s1.setSname("divya");
      s1.setMarks(75);
      em.persist(s1);
      em.getTransaction().commit();
      em.close();

    }
}