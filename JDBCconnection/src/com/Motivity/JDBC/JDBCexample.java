package com.Motivity.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCexample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
    Class.forName("com.mysq.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root"); 
    System.out.println("connection established");
	}
}
