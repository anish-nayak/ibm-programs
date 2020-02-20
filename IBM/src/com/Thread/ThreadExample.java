package com.Thread;

public class ThreadExample implements Runnable{

	Thread t1, t2;
	
	public ThreadExample()
	{
		t1=new Thread(this);
		t2=new Thread(this);
		
		t1.setName("PING");
		t2.setName("PONG");
		
		t1.start();
		t2.start();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ThreadExample();
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
