package com.Collections;

import java.util.*;
public class assignment2 {

	public static void main(String[] args)
	{
		HashSet <Integer>h=new HashSet<Integer>();
		h.add(4);
		h.add(3);
		h.add(5);
		System.out.println("HashSet");

		Iterator i=h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

		System.out.println("LinkedHashSet");
		LinkedHashSet <Integer>l=new LinkedHashSet<Integer>();
		l.add(4);
		l.add(3);
		l.add(5);
		
		i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
