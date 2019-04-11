package com.mphasis.training.pojos;

public class Employee implements Comparable<Employee> {
	private int empid;
	private String enmae;
	private double salary;
	public Employee(int empid, String enmae, double salary) {
		super();
		this.empid = empid;
		this.enmae = enmae;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public String getEnmae() {
		return enmae;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public int compareTo(Employee e1) {
		if(this.empid>e1.empid)
			return -1;
		else if(this.empid<e1.empid)
			return 1;
		else
		return 0;
	}
	@Override
	public String toString() {
		return  empid + "," + enmae + "," + salary;
	}
	
	
}
