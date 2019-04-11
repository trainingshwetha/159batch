package com.mphasis.training.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeDepartmentDao {
	static Map<Department,List<Employee>> emp_dep_list;
	EmployeeDepartmentDao(){
		emp_dep_list=new TreeMap<>();
		Department d1=new Department(1, "Sales");
		List<Employee> e1=new ArrayList<>();
		e1.add(new Employee(11, "Mansvini", 23, 7558611));
		e1.add(new Employee(12, "Sidhu", 24, 6958611));
		
		emp_dep_list.put(d1, e1);
		
		Department d2=new Department(2, "Marketing");
		List<Employee> e2=new ArrayList<>();
		e2.add(new Employee(13, "Ganesh", 22, 6858611));
		e2.add(new Employee(14, "Sanjana", 29, 1958611));
		
		emp_dep_list.put(d2, e2);
		
		Department d3=new Department(3, "Development");
		List<Employee> e3=new ArrayList<>();
		e3.add(new Employee(15, "Manogna", 28, 5558611));
		e3.add(new Employee(16, "Ranjan", 56, 16958611));
		
		emp_dep_list.put(d3, e3);
		
		Department d4=new Department(4, "Testing");
		List<Employee> e4=new ArrayList<>();
		e4.add(new Employee(17, "Gunesh", 33, 6558611));
		e4.add(new Employee(18, "Sanya", 34, 6958611));
		
		emp_dep_list.put(d4, e4);
		
		Department d5=new Department(5, "Analyst");
		List<Employee> e5=new ArrayList<>();
		e5.add(new Employee(17, "Mukesh", 43, 6158611));
		e5.add(new Employee(18, "Mohini", 44, 5958611));
		
		emp_dep_list.put(d5, e5);
		
	}
	
	public Map<Department, List<Employee>> getAll(){
		return emp_dep_list;
	}
}
