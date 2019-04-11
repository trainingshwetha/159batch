package com.mphasis.training.threadprogramming;

public class ThreadGroupDemo {

	public static void main(String[] args)throws InterruptedException {
		ThreadGroup tg=new ThreadGroup("mphasis159");
		
		Thread t1=new Thread(tg, "xyz");
		Thread t2=new Thread(tg,"abc");
		t1.start();
		t2.start();
		System.out.println(t1.getPriority());
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());
		System.out.println(t2.isDaemon());
		System.out.println(t1.getState());
		t1.yield();//allow same priority threads
		t1.join();
		t2.join();
		
		System.out.println("done");
		System.out.println(t1.getState());
		tg.setMaxPriority(8);
		
		

	}

}
