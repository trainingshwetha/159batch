package com.mphasis.training.basicjavaprograms;

enum Status{
    ORDERD(10), GETTING(20), DISPATCHED(21), DELEVIRED(45), 
    COMPLETED(12);
	private int a;
	Status(int a){
	this.a=a;	
	}
	public int getA() {
		return this.a;
	}
}
public class EnumDemo {
	public static void main(String[] args) {
		Status[] st=Status.values();
		for(Status st1:st) {
		System.out.println(st1+" "+st1.ordinal()+ " "+st1.getA());
		}
	}
}
