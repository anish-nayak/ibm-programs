package com.Collections;

import java.util.HashMap;

class Employee
{
   int id;

@Override
public String toString() {
	return "Employee [id=" + id + "]";
}

public Employee(int id) {
	super();
	this.id = id;
}	
   

@Override

public boolean equals(Object obj) {
   
		return true;
	
    
}

@Override
public int hashCode() {
    return 6;
}

}

public class assignment5 {

	public static void main(String[] args) 
	{
			
		HashMap<Employee, String> map = new HashMap<>();
		map.put(new Employee(2), "mno");
		map.put(new Employee(2), "abc");
		map.put(new Employee(3), "xyz");
		
		//map.forEach((k, v) -> {System.out.println("Key: " + k + ", Value: " + v);});
		System.out.println(map.get(new Employee(4)));
		
	}

}
