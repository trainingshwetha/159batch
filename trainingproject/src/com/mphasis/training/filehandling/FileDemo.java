package com.mphasis.training.filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter f1=new FileWriter("mydoc.txt");
		f1.write("Any data can be written");
		f1.close();
		
		FileReader f2=new FileReader("mydoc.txt");
		int i=0;
		while((i=f2.read())!=-1)
		System.out.print((char)i);
		
	}

}
