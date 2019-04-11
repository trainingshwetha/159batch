package com.mphasis.training.threadprogramming;

class Market{
	boolean v=true;
	public synchronized void produce(int i)throws InterruptedException{
		if(!v)
			wait();
		System.out.println("produced" +i);
		v=false;
		notify();
		
	}
	public synchronized void consume(int i)throws InterruptedException {
		if(v)
			wait();
		System.out.println("consumed "+i);
		v=true;
		notify();
	}
}

class Producer extends Thread{
	Market m;
	public Producer(Market m) {
		// TODO Auto-generated constructor stub
		this.m=m;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				m.produce(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Consumer extends Thread{
	Market m;
	public Consumer(Market m) {
		// TODO Auto-generated constructor stub
		this.m=m;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				m.consume(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ProducerConsumerProblem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Market m=new Market();
		Producer p1=new Producer(m);
		Consumer c1=new Consumer(m);
		p1.start();
		c1.start();
		
		
		
	}
}