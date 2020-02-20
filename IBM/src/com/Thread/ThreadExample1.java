package com.Thread;

public class ThreadExample1 extends Thread{

	Thread t1, t2;
	
	public ThreadExample1() {}
	
	public ThreadExample1(String s)
	{
		
		super.setName(s);
		super.start();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ThreadExample1("PING");
		new ThreadExample1("PONG");
		
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread myThread=Thread.currentThread();
		
		if(myThread.getName().equals("PING"))
		{
			for(int i=0; i<10; i++)
			{
				System.out.println("PING");
				
				try
				{
					Thread.sleep(500);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		
		else if(myThread.getName().equals("PONG"))
		{
			for(int i=0; i<10; i++)
			{
				System.out.println("PONG");
				
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
	}

}
