package com.cdac.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cdac.entity.Biodata;

public class BiodataDao {
	public void add(Biodata biodata1) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx= em.getTransaction();
		
		tx.begin();
		
		em.persist(biodata1);
		tx.commit();
		
		emf.close();
	}
}
