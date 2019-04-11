package com.mphasis.training.threadprogramming;

public class ThreadDemo4 {

	public static void main(String[] args) {
		Thread t1=new Thread() {
			public void run() {
				System.out.println("thread is executed");
			}
		};
		t1.start();
		//t1.start();
		
		Runnable r1=()-> {
				System.out.println("thread with runnable");
				};

		
		r1.run();
	}

}
