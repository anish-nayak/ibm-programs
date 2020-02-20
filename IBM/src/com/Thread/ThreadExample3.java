package com.Thread;
//DAEMON THREAD
public class ThreadExample3 extends Thread{

	Thread t1, t2;
	
	//public ThreadExample2() {}
	
	public ThreadExample3(String s)
	{
		
		super.setName(s);
		super.start();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1=new Runnable ()
				{
			public void run() {
				// TODO Auto-generated method stub
				//Thread myThread=Thread.currentThread();
				
				
					for(int i=0; i<10; i++)
					{
						System.out.println("PING");
						
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
				
				
				Runnable r2=new Runnable ()
				{
			public void run() {
				// TODO Auto-generated method stub
				//Thread myThread=Thread.currentThread();
				
				
					for(int i=0; i<10; i++)
					{
						System.out.println("\tPONG");
						
						try
						{
							Thread.sleep(150);
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
					}
				
				
				
			}
		};	
		
		Runnable r3=new Runnable ()
		{
	public void run() {
		// TODO Auto-generated method stub
		//Thread myThread=Thread.currentThread();
		
		
			for(;true;)
			{
				System.out.println("\t\tTONG");
				
				try
				{
					Thread.sleep(50);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		
		
		
	}
};	
		
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3);
		t3.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}


	

}
