package com.mphasis.training.comparators;

public class DoubleValueComparision {

	public static void main(String[] args) {
		 Double d1 = 1023d; 
	        Double d2 = 10d; 
	        if (Double.compare(d1, d2) == 0) { 
	  
	            System.out.println("d1=d2"); 
	        } 
	        else if (Double.compare(d1, d2) < 0) { 
	  
	            System.out.println("d1<d2"); 
	        } 
	        else { 
	  
	            System.out.println("d1>d2"); 
	        } 

	}

}
