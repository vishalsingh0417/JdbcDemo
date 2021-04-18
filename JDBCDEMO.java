package com.assignment.jdbcdemo.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDEMO {

	
	public static void main(String[] args) {
		
	try {
//	Class.forName("com.mysql.jdbc.Driver");
	
	Class.forName("com.mysql.cj.jdbc.Driver");
//	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","root");
	Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbcdemo?useSSL=false","root","root");
	Statement stmt=con.createStatement();	
	
//	//Insertion Operation
//	String query="Insert into persons values(101,'Singh','Vishal','Bihar','Gaya')";
//	stmt.executeUpdate(query);
//	String query1="Insert into persons values(102,'Kumar','Ram','Jharkhand','Bokaro')";
//	stmt.executeUpdate(query1);
//	String query2="Insert into persons values(103,'Choudhary','Raju','Jharkhand','Ranchi')";
//	stmt.executeUpdate(query2);
//	String query3="Insert into persons values(104,'Suri','Rajesh','Bihar','Sitamarhi')";
//	stmt.executeUpdate(query3);
//	String query4="Insert into persons values(105,'Choudhary','Nagendra','Bihar','Gopalganj')";
//	stmt.executeUpdate(query4);
//	
//	
//	//Updation Operation
//	String up="Update persons set FirstName='Abhinav' where PersonID=103";
//	stmt.executeUpdate(up);
//	String up1="Update persons set LastName='Yadav' where PersonID=105";
//	stmt.executeUpdate(up1);
//	
//	//deletion Operation
//	String sql="delete from persons where PersonID=102";
//	stmt.executeUpdate(sql);

	
	String out="Select * from persons";
	ResultSet rs=stmt.executeQuery(out);
	
	while(rs.next())
	{
		int pid =rs.getInt("PersonID");
		String lname=rs.getString("LastName");
		String fname=rs.getString("FirstName");
		String address=rs.getString("Address");
		String city=rs.getString("City");
		
		System.out.println("PersonID: " + pid);
		System.out.println("LastName: "+ lname);
		System.out.println("FirstName: "+fname);
		System.out.println("Address: "+address);
		System.out.println("City: "+city);
		System.out.println("\n");
	}
	}	
		catch(Exception e) {System.out.println(e);}
			
			
		

	}

}