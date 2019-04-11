package com.mphasis.training.threadprogramming;

class Table{
static synchronized void printTable(int n) {
	
		for(int i=1;i<=10;i++) {
			System.out.println(""+n+"*"+i+"="+(n*i));
			try {
			Thread.sleep(700);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	 }
	
}

class MyThreadNum extends Thread{
	Table t;
	public MyThreadNum(Table t) {
		this.t=t;
	}
	public void run() {
		t.printTable(8);
	}
}

class MyThreadNum1 extends Thread{
	Table t;
	public MyThreadNum1(Table t) {
		this.t=t;
	}
	public void run() {
		t.printTable(10);
	}
}




public class SynchDemo {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		Table t1=new Table();
		MyThreadNum mt1=new MyThreadNum(t1);
		MyThreadNum1 mt2=new MyThreadNum1(t1);
		mt1.start();
		mt2.start();
				
		mt1.join();
		mt2.join();
		
		System.out.println("end of main");
		
		
	}

}
