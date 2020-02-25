package com.exception;

class InsufficientBalanceException extends Exception
{
	private String message;
	
	public InsufficientBalanceException()
	{
		this.message="";
	}

	public InsufficientBalanceException(String message) 
	{
		this.message = message;
	}
	
	public String toString()
	{
		return "Amount shpild be between 0 and balance"+this.message;
	}
}

class Balance
{
	int balance;
	
	public Balance()
	{
		this.balance = 50000;
	}

	public void withdraw(int amount) throws InsufficientBalanceException
	{
		if(amount>this.balance)
		{
			throw new InsufficientBalanceException("Invalid amount "+ amount);
			
		}
		balance-=amount;
		System.out.println(balance);
	}
}

public class excpetionTest1 {

	public static void main(String[] args) 
	{
		Balance obj=new Balance();
		try
		{
			obj.withdraw(60000);
	
		}
		catch (InsufficientBalanceException e)
		{
			e.printStackTrace();
		}
	}
}