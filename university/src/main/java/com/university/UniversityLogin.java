package com.university;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UniversityLogin extends HttpServlet {
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
		HttpSession hs=request.getSession();
		try {
			ps=con.prepareStatement("select * from university where username=? and password=? ");
			
			ps.setString(1, username);
			ps.setString(2, password);
		
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				hs.setAttribute("username",rs.getString("username"));
			response.sendRedirect("./home.html");
			}
			else
				response.sendRedirect("./login.html");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
