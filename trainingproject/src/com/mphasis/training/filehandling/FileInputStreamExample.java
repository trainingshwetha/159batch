package com.mphasis.training.filehandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args)throws IOException {
		FileInputStream fis=new FileInputStream("mytext.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		
		bis.mark(23);
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		
		bis.reset();
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		
		
//		int i=0;
//		while((i=bis.read())!=-1) {
//		System.out.print((char)i);
//		}
		bis.close();
		fis.close();
		
		
		System.out.println("\ndone");
		
	}

}
