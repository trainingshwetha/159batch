package com.mphasis.training.basicjavaprograms;

public strictfp  class Calculation {
	
	public   double multiplication(double num1,double num2) {
		return num1*num2;
	}
	
	public double division(double num1,double num2) {
		return num1/num2;
	}
	
	public double cal(double num1,double num2,double num3) {
		return (num1*num2)/num3;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation c1=new Calculation();
		
		System.out.println(c1.multiplication(2334.453, 123.44));
		
		System.out.println(c1.division(121.67, 1244.45));
		
		System.out.println(c1.cal(232.23, 3232.45, 23443.456));
		
		
	}

}
