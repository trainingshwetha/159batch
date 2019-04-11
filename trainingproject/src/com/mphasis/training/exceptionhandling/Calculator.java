package com.mphasis.training.exceptionhandling;

public class Calculator {

	public int add(int a,int b) {
		return a+b;
	}
	
	public int div(int a,int b)throws ArithmeticException {
		
		return a/b;
		
	}
	
	public String add(String a,String b) {
		return a+b;
	}
	
}
