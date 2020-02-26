package com.Collections;

import java.util.*;

class Person implements Comparable <Person>
{
   private String name;
   private int weight;
   private int height;
   
   
   
@Override
public String toString() {
	return "Person [name=" + name + ", weight=" + weight + ", height=" + height + "]";
}



public Person(String name, int weight, int height) {
	super();
	this.name = name;
	this.weight = weight;
	this.height = height;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public int getWeight() {
	return weight;
}



public void setWeight(int weight) {
	this.weight = weight;
}



public int getHeight() {
	return height;
}



public void setHeight(int height) {
	this.height = height;
}



@Override
public int compareTo(Person p) {
	int retValue=0;
	if(this.weight<p.getWeight())
		retValue=-1;
	else 	if(this.weight>p.getWeight())
		retValue=1;
	else 	if(this.weight==p.getWeight())
	{
		if (this.height<p.getHeight())
			retValue=-1;
		else if (this.height>p.getHeight())
			retValue=1;
	}
		
	return retValue;
}
   
   
   
}

public class assignment1 {
		
	public static void display()
	{
		Person p1=new Person("Abc", 12, 13);
		Person p2=new Person("Xyz", 12, 13);
		Person p3=new Person("Mno", 12, 13);
		
		TreeSet<Person> t=new TreeSet<Person>();
		t.add(p1);
		t.add(p2);
		t.add(p3);
		
		Iterator<Person> itr = t.iterator();
		while(itr.hasNext())
		{
			Person a = itr.next();
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) 
	{
		
		display();
	   
	}

}
