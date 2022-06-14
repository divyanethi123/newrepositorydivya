package com.Motivity.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class connection3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping","root","root");
		 System.out.println("connection established");
          
		 PreparedStatement ps=con.prepareStatement("select * from eshopping");
		ResultSet rs= ps.executeQuery();
		 while(rs.next())
	        {
	        	System.out.println(rs.getInt(1)+" "+rs.getString("ProductName")+" "+rs.getInt(3)+" "+rs.getInt(4));
	        }
		  
		 
	}

}
