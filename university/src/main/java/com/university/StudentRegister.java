package com.university;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class StudentRegister extends HttpServlet {
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
		String collegename=request.getParameter("collegeName");
		String collegeType=request.getParameter("collegeType");
		String branches=request.getParameter("branches");		
		try {
			ps=con.prepareStatement("insert into student values(?,?,?,?,?,?)");
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3,degree);		
			ps.setString(4, collegename);
			ps.setString(5, collegeType);
			ps.setString(6, branches);		
			int x=ps.executeUpdate();
			if(x!=0)
			response.sendRedirect("./student_login.html");
			else
				response.sendRedirect("./student_register.html");
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}


}


     
	
 

