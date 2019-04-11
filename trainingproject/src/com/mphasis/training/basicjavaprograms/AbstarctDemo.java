package com.mphasis.training.basicjavaprograms;

// abstract class--extends
//concrete methods and abstract methods
//can contain only abstract methods
//can contain only concrete methods
// cannot create the instatnce 


//interface --implements
// constructor not allowed
// only final variables  allowed
// abstract methods 
//java 8
// static and default methods allowed
//jav9
//private methods allowed
 abstract class Shape{
	private String color;
	Shape(String color){
		this.color=color;
	}
	public  String getColor() {
		return color;
	}
	public abstract void area() ;
}
class Circle extends Shape{
	final private double PI=3.14;
	private int radius;
	Circle(String color,int radius){
		super(color);
		this.radius=radius;
	}
	@Override
	public void area() {	
		double area= PI*radius*radius;
		System.out.println("area of circle "+area);
	}	
}

class Traingle extends Shape{
private int base;
private int height;
	
	Traingle(String color,int base,int height) {
		super(color);
		this.base=base;
		this.height=height;
	}

	@Override
	public void area() {
		System.out.println("area of traingle is"+(0.5*base*height));
		
	}
	
}
 
public class AbstarctDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Circle c1=new Circle("red",89);
//		c1.getColor();
//		c1.area();
		//prefferd way
		Shape s1=new Circle("green",89);
		s1.getColor();
		s1.area();
		

	}

}
