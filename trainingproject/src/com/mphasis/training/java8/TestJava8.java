package com.mphasis.training.java8;

public interface TestJava8 {
	
	public void method();
	public default double add(int i,int j) {
		return i+j;
	}
	public static double add1(int i,int j) {
		return i+j;
	}

}


