package com.cdac.app;

import java.util.List;

import com.cdac.dao.EmployeeDao;
import com.cdac.entity.Employee;

public class temp { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDao dao=new EmployeeDao();
		/*Employee emp=dao.fetch(1002);
		System.out.println(emp.getEmpno()+" "+emp.getName() + " " + emp.getSalary()+" "+emp.getDateofJoining());*/
		/*
		  List<Employee> list=dao.fetchAll(); for(Employee emp: list) {
		  System.out.println(emp.getEmpno() + " " + emp.getName() + " " +
		  emp.getSalary() + " " + emp.getDateofJoining()); }
		*/
		
		System.out.println("............................");
		
		  List<Employee> list2=dao.fetchAllBySalary(6000); for(Employee emp : list2)
		  System.out.println(emp.getEmpno() + " " + emp.getName() + " " +
		  emp.getSalary() + " " + emp.getDateofJoining());
		  System.out.println("............................");
		 
		
		List<String> names = dao.fetchAllNames();
		for(String name : names)
			System.out.println(name);
		System.out.println("..............");
		List<Object[]> namesAndSalaries = dao.fetchAllNamesAndSalaries();
		for(Object[] arr : namesAndSalaries)
			System.out.println(arr[0] + " " + arr[1]);
	
	}

}
