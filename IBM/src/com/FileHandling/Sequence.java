package com.FileHandling;



import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

class AAB
{
	public void operation() throws IOException
	{
		
		FileInputStream fin1=new FileInputStream("abc.txt");
		FileInputStream fin2=new FileInputStream("def.txt");
		FileInputStream fin3=new FileInputStream("ghi.txt");
		
		Vector  v=new Vector();    
		v.add(fin1);    
		v.add(fin2);    
		v.add(fin3); 
		
        Enumeration enumeration = v.elements(); 

        SequenceInputStream sis = new SequenceInputStream(enumeration); 

		//@SuppressWarnings("unchecked")
		//SequenceInputStream sis=new SequenceInputStream((Enumeration<? extends InputStream>) v);
		
		int i;
		while((i=sis.read())!=-1){
		System.out.print((char)i);
		}
		sis.close();
		fin1.close();
		fin2.close();
		
	}
}
public class Sequence {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			AAB obj=new AAB();
			obj.operation();
	}

}
