package com.exception;

public class exceptionTest {

	public static void main(String[] args) 
	{
		int a=9, b=5;
		int arr[]=new int [2];
		try
		{
			a/=b;
			
			try
			{
				arr[2]=4;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();
			}
			
			
		}
		catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("in finallyyyyyyyyyyyyyyyy");
		}
	}

}
