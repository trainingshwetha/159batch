package com.mphasis.training.exceptionhandling;

class Person{
	private int pid;
	private String pname;
	private int age;
	Person(int pid,String pname,int age){
		this.pid=pid;
		this.pname=pname;
		this.age=age;
	}
	public void validate(int age)throws InvalidAge{
		if(age>=18) {
			System.out.println("validated success");
		}else {
			throw new InvalidAge("invalid age");		
		}		
	}
}
public class ExceptionDemo4 {
	public static void main(String[] args) {
		Person p1=new Person(12,"dssd",12);
		try {
		p1.validate(12);
		}catch (InvalidAge e) {
			System.out.println(e.getMessage());
		}
	}
}
