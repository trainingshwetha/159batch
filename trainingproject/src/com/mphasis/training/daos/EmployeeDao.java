package com.mphasis.training.daos;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

import com.mphasis.training.pojos.Employee;

public class EmployeeDao {
	Set<Employee> employees=new TreeSet<>();
	public EmployeeDao() {
		Employee e1=new Employee(12, "Supriya", 656807);
		Employee e2=new Employee(13, "Mounika", 657807);
		Employee e3=new Employee(14, "Chhavi", 656907);
		Employee e4=new Employee(11, "Anirudh", 653807);
		Employee e5=new Employee(10, "Vasanth", 655807);
		Employee e6=new Employee(17, "Sumit", 755807);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		employees.add(e2);
	}
	
	public Set<Employee> getEmployees(){
		return employees;
	}
	
	public Set<Employee> addEmployee(Employee e){
		employees.add(e);
		return employees;
	}
	
	
}
