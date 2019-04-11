package com.mphasis.training.basicjavaprograms;

class Calculator{
	
	String add(int a,String c) {
		return "add";
	}
	
	String add(String c,int a) {
		return "ss";
	}
	
	int add(int a,int b){
	return a+b;	
	}
	
	float add(float a,int b){
		return a+b;	
	}
	
	double add(int a,int b,int c) {
		return a+b;
	}
	
	static void add() {
		System.out.println("static method execution");
	}
	
}


public class MethodOverlodingExample {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c1=new Calculator();
		
		System.out.println(c1.add(12.9f, 13));
		
		Calculator.add();

	}
	
	static {
		System.out.println("static block");
	}

}
