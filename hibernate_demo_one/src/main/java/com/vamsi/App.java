package com.vamsi;

import java.util.Date;

import com.vamsi.domain.person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		   EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-hibernate-mysql");
	       EntityManager em = factory.createEntityManager();
	       EntityTransaction tx = em.getTransaction();
	       
	       tx.begin();
	       
	       person p1=new person("vamsi","krishna","vamsi@gmail.com",new Date());
	       em.persist(p1);
	     
	       
	       tx.commit();
	       
	       em.close();


	}

}
