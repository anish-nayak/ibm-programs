package com.LambdaExpressions;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class assignment6 {

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
		
		UnaryOperator<String> e = (String text) -> { return text.toUpperCase();} ;
		list.replaceAll(e);	
		
		for(String x: list)
		{
			System.out.println(x);
		}
		
		
		
		
	}

}
