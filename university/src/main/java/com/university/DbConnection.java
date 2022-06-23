package com.university;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	public class DbConnection {


	public	static Connection getconnection() throws ClassNotFoundException, SQLException
		{
			 Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping","root","root");
			return con;
		}


}



