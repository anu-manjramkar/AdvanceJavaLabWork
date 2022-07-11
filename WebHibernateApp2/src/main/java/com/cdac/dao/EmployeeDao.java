package com.cdac.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.cdac.entity.Employee;

//Data Access Object
//classes which contain database related code
//are commonly referred to as Dao classes
public class EmployeeDao {

	public void add(Employee emp) {
		//During this step, the persistence.xml file will be read
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(emp); //persist method will generate insert query
		
		tx.commit();
		emf.close();
	}
	
	
}

