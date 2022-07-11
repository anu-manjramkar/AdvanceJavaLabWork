package com.cdac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cdac.entity.Employee;

public class EmployeeDao {
	public Employee fetch(int empno) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em=emf.createEntityManager();
		Employee emp=em.find(Employee.class,empno);
		
		emf.close();
		
		return emp;
	}
	public List<Employee> fetchAll(){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em=emf.createEntityManager();
		
		Query q= em.createQuery("select e from Employee e");
		
		List<Employee> list=q.getResultList();
		emf.close();
		return list;
		
	}
	public List<Employee> fetchAllBySalary(double salary){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select e from Employee e where e.salary>=:sal");
		
		q.setParameter("sal", salary);
		List<Employee> list=q.getResultList();
		emf.close();
		return list;
	}
	public List<String> fetchAllNames() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select e.name from Employee e"); //HQL/JPQL
		List<String> list = q.getResultList();
		
		emf.close();

		return list;
	}
	public List<Object[]> fetchAllNamesAndSalaries() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select e.name,e.salary from Employee e"); //HQL/JPQL
		List<Object[]> list = q.getResultList();
		
		emf.close();

		return list;
	}
}
