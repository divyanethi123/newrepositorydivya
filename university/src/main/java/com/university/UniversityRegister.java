package com.university;

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

public class UniversityRegister extends HttpServlet {
     
	Connection con=null; 
	PreparedStatement ps=null;
   public void init(ServletConfig config)
   {
	   try {
		con=DbConnection.getconnection();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	   
   }
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String degree=request.getParameter("degree");
		int    collegeId=Integer.parseInt(request.getParameter("collegeId"));
		String collegeName=request.getParameter("collegeName");
		String collegeType=request.getParameter("collegeType");
		String branches=request.getParameter("branches");
		String collegeLocation=request.getParameter("collegeLocation");
		
		try {
			ps=con.prepareStatement("insert into university values(?,?,?,?,?,?,?,?)");
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3,degree);
			ps.setInt(4, collegeId);
			ps.setString(5, collegeName);
			ps.setString(6, collegeType);
			ps.setString(7, branches);
			ps.setString(8, collegeLocation);
			int x=ps.executeUpdate();
			if(x!=0)
			response.sendRedirect("./login.html");
			else
				response.sendRedirect("./register.html");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
