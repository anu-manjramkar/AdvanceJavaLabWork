package com.cdac.app;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cdac.dao.EmployeeDao;
import com.cdac.entity.Employee;

public class InsertEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		
		
		Employee emp=new Employee();
		emp.setEmpno(1006);
		emp.setName("Chandrakant Shringarputale");
		emp.setSalary(65000);
		emp.setDateofJoining(LocalDate.of(2017, 03, 10));
		em.persist(emp);
		
		tx.commit();
		
		emf.close();
		
	}

}
