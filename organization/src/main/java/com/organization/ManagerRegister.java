package com.organization;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ManagerRegister extends HttpServlet {
     
	Connection con=null; 
	PreparedStatement ps=null;
   public void init(ServletConfig config)
   {
	   try {
		con=Dbconnection.getconnection();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	   
   }
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int mid=Integer.parseInt(request.getParameter("mid"));
		String username=request.getParameter("username");
		String emailaddress=request.getParameter("emailaddress");
		String password=request.getParameter("password");
		String department=request.getParameter("department");
		
		String catagory=request.getParameter("catagory");

		
		
		try {
			ps=con.prepareStatement("insert into manager values(?,?,?,?,?,?)");
			ps.setInt(1, mid);
			ps.setString(2, username);
			ps.setString(3,emailaddress);
			ps.setString(4, password);
			ps.setString(5,department);
			ps.setString(6, catagory);
			
			int x=ps.executeUpdate();
			
			if(x!=0)
			response.sendRedirect("./manager_login.html");
			else
				response.sendRedirect("./manager_register.html");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
