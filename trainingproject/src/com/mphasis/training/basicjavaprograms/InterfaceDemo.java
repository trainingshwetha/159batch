package com.mphasis.training.basicjavaprograms;

interface Shape1{
	 double PI=3.14;
	public double area();	
}

class Traingle1 implements Shape1{
	private int base;
	private int height;
	public Traingle1(int base,int height) {
		this.base=base;
		this.height=height;
	}
	
	public double area() {
		return 0.5*base*height;
	}
}
class Circle1 implements Shape1{
private	int radius;
	public Circle1(int radius) {
		this.radius=radius;
	}
	@Override
	public double area() {
		return PI*radius*radius;
	}
	
}


public class InterfaceDemo {

	public static void main(String[] args) {
		
		Shape1 s1=new Circle1(27);
		System.out.println(s1.area());
		
		Shape1 s2=new Traingle1(33, 12);
		System.out.println(s2.area());

	}

}
