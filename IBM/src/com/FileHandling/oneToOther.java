package com.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class A
{
	public void operation() throws IOException
	{
		File file = new File("C:\\Users\\nayak\\workspace\\IBM\\abc.txt");
		FileInputStream fis = new FileInputStream(file);
		StringBuilder sb = new StringBuilder("");
		int i = 0;
		do {
		i = fis.read();
		if(i != -1)
		sb.append((char)i);
		}		while(i != -1); // -1 represents end of file (EOF)
		System.out.println("File contents: "+ sb);
		fis.close();
		
		 file = new File("C:\\Users\\nayak\\workspace\\IBM\\def.txt");
		FileOutputStream Fos = new FileOutputStream(file);
		
		Fos.write(sb.toString().getBytes());
		Fos.flush();
		Fos.close();
		
	}
}
public class oneToOther {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		A obj=new A();
		obj.operation();

	}

}
