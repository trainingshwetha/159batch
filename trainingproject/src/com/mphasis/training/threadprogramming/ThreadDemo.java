package com.mphasis.training.threadprogramming;

class MyThread extends Thread {
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("print "+i);
		}
	}
}

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread t1=new MyThread();
		t1.setName("micky");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		System.out.println("Live or not"+t1.isAlive());
		Thread.sleep(1000);
		System.out.println("Live or not"+t1.isAlive());
		System.out.println("name of the thread"+t1.getName());
		System.out.println("Priority "+t1.getPriority());
		t1.join();
		System.out.println("Main method executed");
	}

}
