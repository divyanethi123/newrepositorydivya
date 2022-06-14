package com.Motivity.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class connection1 {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping","root","root"); 
	    System.out.println("connection established");
	    Statement st=con.createStatement();
	    int x=st.executeUpdate("insert into eshopping values(214,'laptop',50000,16)");
	      if(x!=0)
	      {
	    	  System.out.println("insertion completed");
	      }
         ResultSet rs=st.executeQuery("select ProductName,ProductPrice from eshopping where ProductId in(123,453,234)");
        while(rs.next())
        {
        	System.out.println(rs.getString(1)+" "+rs.getInt("ProductPrice"));
        }
	  
	
	}
    }



