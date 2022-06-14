package com.motivity.JDBCconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCconnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping","root","root");
		System.out.println("connection established");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from eshopping");
		
	}

}
