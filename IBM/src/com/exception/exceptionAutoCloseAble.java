package com.exception;
//import java.lang.*;

class A  implements AutoCloseable
{

	public void display()
	{
		System.out.println("inside A Display");
	}
	public A()
	{
		System.out.println("inside A constructor");
	}
	
	
	@Override
	public void close() throws Exception 
	{

		System.out.println("closing ");
	}
	
}
public class exceptionAutoCloseAble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(A object=new A())
		{
			object.display();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
