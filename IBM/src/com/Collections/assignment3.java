package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class assignment3 {

	public static void main(String[] args) 
	{
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        
        Collections.sort(arr);
        
        
        System.out.println("Backward Direction Iteration:");
        ListIterator listIterator=arr.listIterator(arr.size());
        
        /*while(listIterator.hasNext()){
			listIterator.next();			
		}*/
        
        while(listIterator.hasPrevious()){
			System.out.println(listIterator.previous());			
		}

	}

}
