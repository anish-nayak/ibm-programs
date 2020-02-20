package com.Serializable;

import java.io.RandomAccessFile;

class Account
{
   private String name;
   private double balance;
		public String getName() 
		{
			return name;
		}
		public void setName(String name) 
		{
			this.name = name;
		}
		public double getBalance() 
		{
			return balance;
		}
		public void setBalance(double balance) 
		{
			this.balance = balance;
		}
		public Account(String name, double balance) 
		{
			super();
			this.name = name;
			this.balance = balance;
		}
  
		void read (RandomAccessFile raf) throws Exception
		{
			char [] temp=new char[name.length()];
			for(int i=0;i<name.length();i++)
			{
				temp[i]=raf.readChar();
			}
			System.out.println("Name: "+new String(temp));
			System.out.println("Salary: "+raf.readDouble()); 
			
		}
		
		void write(RandomAccessFile raf) throws Exception
		{
			raf.writeChars(name);
			raf.writeDouble(balance);
		}
   
}

public class CRUD {

  public static void add(Account obj)
  {
	  
  }
  
 public static void read()
 {
	 
 }
 
 public static void delete()
 {
	 
 }
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
