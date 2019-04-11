package com.mphasis.training.assignment;

import java.util.List;
import java.util.Map;

public class EmployeeDepartment {

	public static void main(String[] args) {
		
		EmployeeDepartmentDao dao=new EmployeeDepartmentDao();
		
		Map<Department,List<Employee>> map=dao.getAll();
		
		for(Map.Entry<Department,List<Employee>> entry:map.entrySet()) {
			Department d=entry.getKey();
			System.out.println(d);
			List<Employee> elist=entry.getValue();
			elist.forEach(System.out::println);
		}

	}

}
