package com.mphasis.training.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class MultipleReads {

	public static void main(String[] args)throws IOException {
	
		FileOutputStream fos=new FileOutputStream("output.txt");
		FileInputStream fis=new FileInputStream("mytext.txt");
		FileInputStream fis1=new FileInputStream("mytxt.txt");
		SequenceInputStream sis=new SequenceInputStream(fis, fis1);
		int i=0;
		while((i=sis.read())!=-1) {
			fos.write(i);
			//System.out.print((char)i);
		}
		sis.close();
		fis.close();
		fis1.close();
	}

}
