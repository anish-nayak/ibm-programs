package com.LambdaExpressions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class assignment7 {

	public static void main(String[] args) 
	{
		HashMap <Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");
		/*Consumer <StringBuilder> c = l ->
		{
			System.out.println(l);			
		};*/
		Consumer <StringBuilder> c=(System.out::println);
		function (map,c);

	}
	
	public static void function(HashMap <Integer, String> map,Consumer <StringBuilder> c )
	{
		StringBuilder sb=new StringBuilder("");
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
		    sb.append(entry.getKey() + entry.getValue());
		}
		
		c.accept(sb);
		
	}

}
