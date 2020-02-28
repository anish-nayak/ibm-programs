package com.Collections;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

class user
{
	private String name;
	private String password;
	public user(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	@Override
	public String toString() 
	{
		return "user [name=" + name + ", password=" + password + "]";
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}

	
}

class message
{
	Timestamp t;

	private String data;
	public message(String data, Timestamp t) 
	{
		this.data = data;
		this.t = t;
	}
	@Override
	public String toString() 
	{
		return "timestamp: " + t + ", Message=" + data + "]";
	}
	
	
	
}
public class assignment6 
{
	static TreeSet <user> names_data;
	static HashMap<String, TreeSet <user>> users;
	static HashMap<String, message> messages;

	public assignment6()
	{
		 users= new HashMap<String, TreeSet <user>>();
		 messages=new HashMap<String, message>();
		 names_data=new TreeSet <user>(); 
	}
	
	public static void createUser()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter room name: ");
		String room=s.next();
		System.out.println("Enter user name: ");
		String name=s.next();
		System.out.println("Enter user password: ");
		String password=s.next();
		
		users.put(room, names_data);
	}
	

	
	

	
	
	
	
	public static void main(String []args)
	{
		new assignment6();
		Scanner s=new Scanner(System.in);
		int opt;
		outer:
		while(true)
		{
			System.out.println("Menu: ");
			{
				System.out.println("1: CREATE USER ");
				System.out.println("2: LIST ALL USERS ");
				System.out.println("3: REMOVE CHATROOM ");
				/*System.out.println("4: ADD USER ");
				System.out.println("5: REMOVE USER ");
				System.out.println("6: LOGIN ");*/
				System.out.println("7: EXIT");
				System.out.println("ENTER CHOICE:  ");
				opt=s.nextInt();
				
				switch(opt)
				{
				case 1: createUser(); break;
				//case 2: listUser(); break;
				//case 3: deleteChatRoom();break;
				/*case 4: break;
				case 5: break;
				case 6: break;*/
				case 7: break outer ;
				
				}
			}
		}
	}
}
