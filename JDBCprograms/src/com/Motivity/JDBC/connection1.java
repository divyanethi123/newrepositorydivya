package com.Motivity.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection1 {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	    Class.forName("com.mysql.cj.jdbc.Driver	");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping","root","root"); 
	    System.out.println("connection established");
		}
	}



