package com.LambdaExpressions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class assignment8 {

	public static void main(String[] args) 
	{
		
		ArrayList <String> list=new ArrayList<String>();
		list.add("a");
		list.add("bb");
		list.add("ccc");
		list.add("dddd");
		list.add("eeeee");
		list.add("ffffff");
		list.add("ggggggg");
		list.add("hhhhhhhh");
		
		
		
		
		Runnable r1=()-> 
		{
			for(String x: list)
				System.out.println(x);
		};
		
		
		Thread t1=new Thread(r1);
		t1.start();
	
	}

}
