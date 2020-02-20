package com.Serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Date implements Serializable
{
		private int day, month, year;

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		@Override
		public String toString() {
			return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
		}

		public Date(int day, int month, int year) {
			
			this.day = day;
			this.month = month;
			this.year = year;
		}
		
		
}

class A implements Serializable
{
   private String name;
   private Date dob;
   private transient String password;
		public A(String name, String password, Date d) 
		{
			super();
			this.name = name;
			this.password = password;
			dob=d;
		}
		public String getName() 
		{
			return name;
		}
		public void setName(String name) 
		{
			this.name = name;
		}
		public String getPassword() 
		{
			return password;
		}
		public void setPassword(String password) 
		{
			this.password = password;
		}
		@Override
		public String toString() {
			return "A [name=" + name + ", password=" + password + "]"+ dob;
		}

		
	
		
}

public class serializeTest {

public static void serialize() throws Exception
{
	File file = new File("abc.txt"); 
	FileOutputStream fout = new FileOutputStream(file);  
	ObjectOutputStream out = new ObjectOutputStream(fout); 
	out.writeObject(new A("nAmE ","pAsSwOrD",new Date(1,2,3))); 
	out.flush(); out.close();
	
}

public static void deserialize() throws Exception
{
	File file = new File("abc.txt"); 
	FileInputStream fin = new FileInputStream(file);  
	ObjectInputStream in = new ObjectInputStream(fin); 
	A obj = (A)in.readObject(); 
	System.out.println("order = " + obj);

}
	
	public static void main(String[] args) throws Exception 
	{
		
		serialize();
		deserialize();
		

	}

}
