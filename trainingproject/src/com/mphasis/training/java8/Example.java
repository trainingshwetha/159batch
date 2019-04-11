package com.mphasis.training.java8;

public class Example implements TestJava8{

	@Override
	public void method() {
		System.out.println("test");
		
	}
	public static void main(String args[]) {
		Example e1=new Example();
		e1.method();
		e1.add(10, 20);
	}

}
