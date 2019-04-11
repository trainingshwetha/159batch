package com.mphasis.training.exceptionhandling;
class Outer{
	class Inner{//non-static --inner classess
		public void display() {
			System.out.println("test Inner");
		}
	}	
	public void outerMethod() {
		System.out.println("test outer");
	}
}

public class NestedDemo {
	public static void main(String[] args) {
		Outer o1=new Outer();
		o1.outerMethod();
		//static nested classes
	/*	Outer.Inner inner= new Outer.Inner();
		inner.display();*/
		
		//inner classes
		Outer.Inner inner=o1.new Inner();
			inner.display();

			//anonymous class
		MyClass t1=new MyClass(){
			public void method() {
				System.out.println("annonymous is claaed");
			}
		};
		t1.method();
		
		
			
	}

}
