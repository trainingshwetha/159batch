package com.mphasis.training.basicjavaprograms;

public class HasAExample {

	public static void main(String[] args) {
		Address ad1=new Address(12, "mascot90","vijaynagar",
				"bangalore", "KA", 1212);
		
		
		MphasisEmployee mph1=
				new MphasisEmployee(123,"Rahul",ad1);
		System.out.println(mph1);
		
		MphasisEmployee mph2=
				new MphasisEmployee(126,"Naresh",ad1);
		System.out.println(mph2);
		System.out.println(mph2.hashCode());
		
		MphasisEmployee mph3=
				new MphasisEmployee(126,"Naresh",ad1);
		System.out.println(mph3);
		System.out.println(mph3.hashCode());
		
		MphasisEmployee mph4=
				new MphasisEmployee(126,"Pallavi",null);
		System.out.println(mph4);
		System.out.println(mph4.hashCode());
		
		
		if(mph2.equals(mph4)) {
			System.out.println("employee 2 and 3 are have same data");
		}else {
			System.out.println("employee 2 and 3 are diffrent");
		}
		
		
		
		
		
		
		
		
	}

}
