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

public class EmployeeRegister extends HttpServlet {
     
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
		int eid=Integer.parseInt(request.getParameter("eid"));
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String emailid=request.getParameter("emailid");
		String department=request.getParameter("department");	
		String doj=request.getParameter("doj");
		int salary=Integer.parseInt(request.getParameter("salary"));	
		try {
			ps=con.prepareStatement("insert into employee values(?,?,?,?,?,?,?)");
			ps.setInt(1, eid);
			ps.setString(2, username);
			ps.setString(3, password);
			ps.setString(4,emailid);	
			ps.setString(5,department);
			ps.setString(6, doj);
			ps.setInt(7, salary);			
			int x=ps.executeUpdate();
			
			if(x!=0)
			response.sendRedirect("./employee_login.html");
			else
				response.sendRedirect(".employee_register.html");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
