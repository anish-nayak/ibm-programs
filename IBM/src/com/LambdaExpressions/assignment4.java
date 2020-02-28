package com.LambdaExpressions;

import java.util.ArrayList;



public class assignment4 {

	public static void main(String[] args)
	{
		ArrayList <String> list=new ArrayList<String>();
		list.add("a");
		list.add("aa");
		list.add("aaa");
		list.add("aaaa");
		list.add("aaaaa");
		list.add("aaaaaa");
		list.add("aaaaaaa");
		list.add("aaaaaaaa");
		
		list.removeIf(s->(s.length()%2==1));
		
		for(String s:list)
		{
			System.out.println(s);
		}
		
	}

}
