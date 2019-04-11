package com.mphasis.training.view;

import java.util.Scanner;
import java.util.Set;

import com.mphasis.training.daos.EmployeeDao;
import com.mphasis.training.pojos.Employee;

public class EmployeeApp1 {
	public static void main(String[] args) {
		EmployeeDao employeeDao=new EmployeeDao();
	do {
		System.out.println("1. Add Employee  2.ListEmployees 3. Logout");
	Scanner sc=new Scanner(System.in);
	int choice=sc.nextInt();
	switch(choice) {
	case 1: System.out.println("enter the employee details");
	      Employee e1=new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
	      employeeDao.addEmployee(e1);
	     
	      break;
	case 2: Set<Employee> employees=employeeDao.getEmployees();
	for(Employee e:employees) {
		System.out.println(e.getEmpid()+" "+e.getEnmae()
		+" "+e.getSalary());
	}
	break;
	case 3: System.exit(0);
	   default: System.out.println("invalid");   
	}
	}while(true);	
	}

}
