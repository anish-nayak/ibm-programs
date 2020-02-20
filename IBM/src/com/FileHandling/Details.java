package com.FileHandling;

import java.io.File;
import java.sql.Timestamp;

public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p="C:\\Users\\nayak\\workspace\\IBM\\";
		File file = new File("C:\\Users\\nayak\\workspace\\IBM");
		String [] a= file.list();
		//System.out.println("file name           size      write?   read?   last modified");

		for(int i=0;i<a.length;i++)
			{
				System.out.println("File name: "+a[i]);
				file=new File(p+a[i]);
				System.out.println("File size: "+file.length()/(long)1024+" KB");
				System.out.println("File read: "+file.canRead());
				System.out.println("File write: "+file.canWrite());
				System.out.println("File execute: "+file.canExecute());
				System.out.println("Last Modified: "+new Timestamp(file.lastModified()).toLocalDateTime());

				System.out.println("File?: "+file.isFile());
				System.out.println("Directory?:"+file.isDirectory());

				System.out.println("\n");
				
			}
		
		
		
	}

}
