package com.mphasis.training.filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjectExample {
//reading multiple objects from the file
	public static void main(String[] args)throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("employeedate.txt");
		ObjectInputStream ois=null;
		while(fis.available()>0) {
			ois=new ObjectInputStream(fis);
			Employee e=(Employee)ois.readObject();
			System.out.println("Employee"+e);
		}
		ois.close();
		fis.close();
		
		
		
		
	}

}
