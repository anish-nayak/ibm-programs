package com.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PingPongTest {

	public static void main(String[] args)
	{
		Runnable r1=new Runnable ()
		{
			public void run() 
			{
		
		
			for(int i=0; i<10; i++)
			{
				System.out.println("PING");
				
				try
				{
					Thread.sleep(200);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}			
		}
		};
		
		Runnable r2=new Runnable ()
		{
			public void run() 
			{
		
		
			for(int i=0; i<10; i++)
			{
				System.out.println("\tPONG");
				
				try
				{
					Thread.sleep(100);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}			
		}
		};
		
		
		ExecutorService e = Executors.newFixedThreadPool(2);
		e.execute(r1);
		e.execute(r2);

		
	}

}
