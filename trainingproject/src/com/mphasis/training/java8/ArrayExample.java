package com.mphasis.training.java8;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;

public class ArrayExample {

	public static void main(String[] args) {
		int numbers[]= {78,23,12,98,4,56};
		
		Arrays.parallelSort(numbers);
		
		Arrays.stream(numbers).forEach(n->System.out.print(n));
		
		
	IntBinaryOperator sum=(a,b) -> a+b;
	
	IntBinaryOperator minus=(a,b)->a-b;
	
	DoubleBinaryOperator sumd=(a,b)->a+b;

	System.out.println("result is "+sum.applyAsInt(12, 19));
		
	}

}
