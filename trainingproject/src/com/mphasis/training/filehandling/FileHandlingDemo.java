package com.mphasis.training.filehandling;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingDemo {
	public static void main(String args[])throws IOException {
		
		FileOutputStream fos=new FileOutputStream("mytext1.txt",true);
		FileOutputStream fos1=new FileOutputStream("mytxt.txt",true);
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		String s1="file handling";
		byte[] b=s1.getBytes();
//		fos.write(b);
//		fos1.write(b);
		bos.write(b);
		bos.writeTo(fos);
		bos.writeTo(fos1);
		System.out.println("done");
	}

}
