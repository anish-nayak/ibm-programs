package com.Generics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;

import com.mysql.jdbc.PreparedStatement;

public class test {
	
	public static void add(String name, double salary) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcon= DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
		System.out.println("connection established");
		Statement smnt=dbcon.createStatement();
int x=101;
		/*INSERT INTO table_name (column1, column2, column3, ...)
		VALUES (value1, value2, value3, ...);*/
		
		//String query="insert into employeedb (Id,name, salary)"+"values (26,'"+name+"',"+salary+")";
		//ResultSet rs= smnt.executeQuery("SELECT * from employeedb")
		//ResultSet rs= smnt.executeUpdate(query);
String query="insert into employeedb (Id,name, salary)"+"values ("+x+",'"+name+"',"+salary+")";
		smnt.executeUpdate(query);
		
		
		smnt.close();
		dbcon.close();
		
		
	}
	
	public static void addPreparedStatement(String name, int id, double salary) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcon=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
		java.sql.PreparedStatement pstmt=dbcon.prepareStatement("insert into employeedb (Id,name, salary) values (?,?,?)");
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setDouble(3, salary);
		int updates=pstmt.executeUpdate();
		pstmt.close();
		dbcon.close();
	
	}
	
	public static void displayPreparedStatement(String key) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcon=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
		java.sql.PreparedStatement pstmt=dbcon.prepareStatement("select * from employeedb where name=?");
		pstmt.setString(1, key);
		
		ResultSet rs= pstmt.executeQuery();
		while(rs.next())
		{
			int id =rs.getInt("Id");
			String name=rs.getString("name");
			Double sal=rs.getDouble("salary");
			
			System.out.println(id+" + "+name+" + "+sal);
		}
		
		rs.close();
		pstmt.close();
		dbcon.close();
	}
	
	public static void displayPreparedStatementALl() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcon=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
		java.sql.PreparedStatement pstmt=dbcon.prepareStatement("select * from employeedb ");
		
		
		ResultSet rs= pstmt.executeQuery();
		while(rs.next())
		{
			int id =rs.getInt("Id");
			String name=rs.getString("name");
			Double sal=rs.getDouble("salary");
			
			System.out.println(id+" + "+name+" + "+sal);
		}
		
		rs.close();
		pstmt.close();
		dbcon.close();
	}
	
	public static void deletePreparedStatement(String key) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcon=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
		java.sql.PreparedStatement pstmt=dbcon.prepareStatement("delete  from employeedb where name=?");
		pstmt.setString(1, key);
		
		pstmt.execute();
		/*while(rs.next())
		{
			int id =rs.getInt("Id");
			String name=rs.getString("name");
			Double sal=rs.getDouble("salary");
			
			System.out.println(id+" + "+name+" + "+sal);
		}
		*/
		//rs.close();
		pstmt.close();
		dbcon.close();
	}
	
	public static void updatePreparedStatement(String key, String newData) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcon=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
		java.sql.PreparedStatement pstmt=dbcon.prepareStatement("update employeedb set name =? where name=?");
		pstmt.setString(2, key);
		pstmt.setString(1, newData);
		
		pstmt.execute();
		/*while(rs.next())
		{
			int id =rs.getInt("Id");
			String name=rs.getString("name");
			Double sal=rs.getDouble("salary");
			
			System.out.println(id+" + "+name+" + "+sal);
		}
		*/
		//rs.close();
		pstmt.close();
		dbcon.close();
	}
	
	
	
	

	public static void main(String[] args) throws Exception 
	{
		//add("gmail",89.0);
		//add("google",89.0);
		//addPreparedStatement("msc", 1000, 10000.02);
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcon= DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
		System.out.println("connection established");
		Statement smnt=dbcon.createStatement();
		
		ResultSet rs= smnt.executeQuery("SELECT * from employeedb");
		while(rs.next())
		{
			int id =rs.getInt("Id");
			String name=rs.getString("name");
			Double sal=rs.getDouble("salary");
			
			System.out.println(id+" + "+name+" + "+sal);
		}
		System.out.println("\n\n");

		displayPreparedStatement("gmail");
		deletePreparedStatement("gmail");
		displayPreparedStatementALl();
		updatePreparedStatement("anish", "anish nayak");
		displayPreparedStatementALl();

		
		rs.close();
		smnt.close();
		dbcon.close();
		
		
		
	}

}
