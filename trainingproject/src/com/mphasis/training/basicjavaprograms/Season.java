package com.mphasis.training.basicjavaprograms;
enum sea{
	
}

public enum Season{
	SUMMER, SPRING, RAINY;
	
	public static void main(String args[]) {
		Season[] se=Season.values();
		for(Season ss:se) {
			System.out.println(ss);
		}
	}

}
