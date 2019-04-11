package com.mphasis.training.threadprogramming;

public class ExampleDemo {
	public static void main(String[] args) {
		Test t1=new Test() {
			@Override
			public void method() {
				System.out.println("method a");	
			}
		};
		t1.method();
		
		Test t2=() -> {
				System.out.println("method a");	
		
		};
		
		t2.method();
		
		
	}

}
