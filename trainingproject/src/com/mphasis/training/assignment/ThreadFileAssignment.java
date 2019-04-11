package com.mphasis.training.assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class FileExample{	
	boolean value=true;
	public synchronized void readValue()throws IOException,InterruptedException {
		if(!value)
			wait();
		FileInputStream fis=new FileInputStream("assignment1.txt");
		int i=0;
		while((i=fis.read())!=-1)
			System.out.println((char)i);
		fis.close();
		value=false;
		notify();
	}
	public synchronized void writeValue(int b)throws IOException,InterruptedException {
		if(value)
			wait();
		FileOutputStream fos=
				new FileOutputStream("assignment1.txt",true);
		fos.write(b);
		fos.close();
		value=true;
		notify();
	}
}

class Thread1 extends Thread{
	FileExample f1;
	Thread1(FileExample f1){
		this.f1=f1;
	}
	public void run() {
		String s="Java is powerful langauge";
		byte[] b=s.getBytes();
		for(int i=0;i<b.length;i++) {
			try {
				f1.writeValue(b[i]);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread{
	FileExample f1;
	Thread2(FileExample f1){
		this.f1=f1;
	}
	public void run() {
		String s="Java is powerful langauge";
		byte[] b=s.getBytes();
		for(int i=0;i<b.length;i++) {
			try {
				f1.readValue();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}



public class ThreadFileAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileExample e1=new FileExample();
		Thread1 t1=new Thread1(e1);
		Thread2 t2=new Thread2(e1);
		t1.start();
		t2.start();
	}

}
