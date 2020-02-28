package com.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ChatRoom {
	static TreeSet<String> usersList = new TreeSet<String>(); 
	static List<String> msgList = new ArrayList<String>();
	static Map<String,TreeSet > hmapUsers=new HashMap<String,TreeSet>();
	static	 Map<String,ArrayList > hmapMsg=new HashMap<String,ArrayList>();

	public static void main(String[] args) {
		
		
		 System.out.println("\ntWelcome to ChatRoom\n");
		
		 
		 System.out.println("A : Create chatRoom");
		 System.out.println("B : Add User");
		 System.out.println("C : Userlogin");
		 System.out.println("D: Send Message");
		 System.out.println("E: Display Specific ChatRoom Message");
         System.out.println("F: List spcific ChatRoom Users");
		 System.out.println("G: Logout");
		 System.out.println("H: Delete a user");

		 System.out.print("\nPlease Select Option   :\t");
		 String choiceMain;
		 Scanner sc=new Scanner(System.in);
		 choiceMain=sc.next();
		 outer:
		 while(true)
		 {switch(choiceMain)
		 {
		 case "A": {
			 boolean isKeyPresent = false;
			 		String chatRoom="";
			 		System.out.print("Enter the Name of the chatroom you want to create :  ");
			 		chatRoom=sc.next();
			 		
			 		if(hmapUsers.containsKey(chatRoom))
			 			isKeyPresent = true;
			 		else
			 			isKeyPresent = false;
			 		
			 		if(isKeyPresent==true)
			 			{
			 			System.out.println("ChatRoom with this name already created !!");
	 			     	System.exit(0);
			 			}
			 		
			 		else {
			 		hmapUsers.put(chatRoom , usersList);
			 		System.out.println("Chatroom "+chatRoom+" Created !!");
			 		}
		 }break;
		 
		 case "B": 
		 {
			
		 		System.out.print("Enter the Name of the chatroom you want to create user in:  ");
		 		String chatroom=sc.next();
		 		System.out.print("Enter the Name of the user:  ");
		 		String user=sc.next();
		 		usersList.add(user);
		 		hmapUsers.put(chatroom , usersList);
		 		
		 		
		 }break;
		 
		 case "C": 
		 }
		 
		
	}

}
}