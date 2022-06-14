package com.Motivity.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class connection4 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		System.out.println("enter your choice");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping","root","root");
		 System.out.println("connection established");
		switch(x)
		{
		case 1: 
			 PreparedStatement ps=con.prepareStatement("insert into eshopping values(?,?,?,?)");
		     ps.setInt(1, 768);
		     ps.setString(2,"bats");
		     ps.setInt(3, 25000);
		     ps.setInt(4, 15);
		    int m=ps.executeUpdate();
		    if(m!=0)
		    {
		    	 System.out.println("insertion completed");
		    }
		    break;
		    
		case 2:
			PreparedStatement ps2=con.prepareStatement("update eshopping set ProductPrice=? where ProductId=? ");
			 ps2.setInt(1, 20000);
			 ps2.setInt(2, 213);
			 int n=ps2.executeUpdate();
			 if(n!=0)
			 {
				 System.out.println("updation completed");
			 }
			 break;
			 
		case 3:
			PreparedStatement ps3=con.prepareStatement("delete table eshopping ");
			int o=ps3.executeUpdate();
		    System.out.println("deletion completed");
		    break;
		    
		case 4:
			PreparedStatement ps4=con.prepareStatement("select * from eshopping");
			ResultSet rs=ps4.executeQuery();
			
			while(rs.next())
	        {
	        	System.out.println(rs.getInt(1)+" "+rs.getString("ProductName")+" "+rs.getInt(3)+" "+rs.getInt(4));
	        }
			
		 }
		
			
			

	}
}
