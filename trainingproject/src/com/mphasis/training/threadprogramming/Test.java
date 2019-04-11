package com.mphasis.training.threadprogramming;


public interface Test {
	public void method();
	//public void method3();
	
	public default void method1() {
		System.out.println("test 1");
	}
	
	public static void method2() {
		System.out.println("test 2");
	}

}
