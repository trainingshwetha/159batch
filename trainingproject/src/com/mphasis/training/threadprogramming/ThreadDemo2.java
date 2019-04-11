package com.mphasis.training.threadprogramming;

class MyThread11 implements Runnable {
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("print "+i +" The thread"+Thread.currentThread());
		}
	}
}

public class ThreadDemo2 {
	public static void main(String[] args) throws InterruptedException {
		MyThread11 mt1=new MyThread11();
		Thread t1=new Thread(mt1,"Micky");
		MyThread11 myt2=new MyThread11();
		Thread t2=new Thread(myt2,"vicky");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Main method executed");
	}

}
