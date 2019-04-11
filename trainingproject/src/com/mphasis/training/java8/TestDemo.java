package com.mphasis.training.java8;

interface A{
	public void greet(int i,int j);
	
}

public class TestDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=(i,j) -> {
				System.out.println("welcome");					
		};
	}

}
