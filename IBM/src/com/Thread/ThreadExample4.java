package com.Thread;

public class ThreadExample4 extends Thread implements Runnable{

	Thread t1, t2;
	
	//public ThreadExample2() {}
	
	
	public void run() {  
        System.out.println(Thread.currentThread().getName());
        //this.start();
        }
	
	public ThreadExample4(String s)
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
		//ThreadExample4 runnable=new ThreadExample4("parent");
		ThreadGroup tg=new ThreadGroup("a");
		
		
		Thread t1=new Thread(tg,"t1");
		t1.start();
		Thread t2=new Thread(tg,"t2");
		t2.start();
		Thread t3=new Thread(tg,"t3");
		t3.start();
		//t3.setDaemon(true);
		//t1.start();
		//t2.start();
		//t3.start();
	}


	

}