package com.mphasis.training.stringexamples;

import java.util.StringJoiner;
import java.util.StringTokenizer;
public class StringJoinerExample {
	public static void main(String args[]) {
		StringTokenizer token=new StringTokenizer("Going.with.Java", ".");
	while(token.hasMoreTokens()) {
		System.out.println(token.nextToken());
	}
	
	//from java 8
	StringJoiner joiner=new StringJoiner("-");
	
	joiner.add("java");
	joiner.add("is");
	joiner.add("platform");
	joiner.add("independent");
	
	System.out.println(joiner);
	
	}
	
	

}
