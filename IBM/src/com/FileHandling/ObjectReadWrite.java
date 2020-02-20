package com.FileHandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Aa
{
	public void operation(int a[], String b[],double[] sal) throws IOException
	{
		
		File file = new File("dta.txt");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		
		for(int i=0;i<a.length;i++)
		{
		dos.writeInt(a[i]);
		dos.writeUTF(b[i]);
		dos.writeDouble(sal[i]);
		}
		dos.flush();
		fos.flush();
		dos.close();
		fos.close();

		 file = new File("dta.txt");
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i=0;i<a.length;i++)
		{
		int id = dis.readInt();
		String name = dis.readUTF();
		double salary = dis.readDouble();
		System.out.println("Name: "+name);
		System.out.println("Number: "+id);
		System.out.println("Salary: "+salary);
		
		}
		dis.close();
		fis.close();

		
	}
}

public class ObjectReadWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name[] = new String [3];
		name[0]=new String ("a");
		name[1]=new String ("b");
		name[2]=new String ("c");
		
		int id[]=new int[3];
		id[0]=123;
		id[1]=456;
		id[2]=789;
		
		double sal[]=new double[3];
		sal[0]=1000.0;
		sal[1]=2000.0;
		sal[2]=3000.0;
		
		Aa obj=new Aa();
		obj.operation(id,name, sal);
		

	}

}
