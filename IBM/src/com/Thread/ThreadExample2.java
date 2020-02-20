package com.Thread;
//anonymous inner class
public class ThreadExample2 extends Thread{

	Thread t1, t2;
	
	//public ThreadExample2() {}
	
	public ThreadExample2(String s)
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
							Thread.sleep(500);
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
						System.out.println("PONG");
						
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
		};	
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
	}


	

}
