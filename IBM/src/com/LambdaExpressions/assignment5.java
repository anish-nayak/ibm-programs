package com.LambdaExpressions;
import java.util.function.Consumer; 

import java.util.ArrayList;

public class assignment5 {

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
		
		Consumer <StringBuilder> c = l ->
		{
			System.out.println(l);			
		};
		
		function (list,c);

	}
	
	public static void function(ArrayList <String> list,Consumer <StringBuilder> c )
	{
		StringBuilder a=new StringBuilder("");
		for(String x:list)
		{
			a.append(x.charAt(0));
		}
		c.accept(a);
		
	}

}
