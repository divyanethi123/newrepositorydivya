package com.Motivity.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class connection2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping","root","root");
	 System.out.println("connection established");
	 
  /*   PreparedStatement ps=con.prepareStatement("insert into eshopping values(?,?,?,?)");
     ps.setInt(1, 213);
     ps.setString(2,"fridge");
     ps.setInt(3, 30000);
     ps.setInt(4, 25);
    int x=ps.executeUpdate();
    if(x!=0)
    {
    	 System.out.println("insertion completed");
    }
    */
    PreparedStatement ps2=con.prepareStatement("update eshopping set ProductId=?  where ProductId=?");
    ps2.setInt(1, 178);
    ps2.setInt(2, 214);
   
    int y=ps2.executeUpdate();
    if(y!=0)
    {
    	System.out.println("update is completed");
    }
    }
}
