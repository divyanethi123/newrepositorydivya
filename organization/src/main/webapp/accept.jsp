<%@page import="java.sql.*" %>
<%@page import="com.organization.*" %>
<%
 Connection con= Dbconnection.getconnection();
String employee=(String)session.getAttribute("emailaddress");
int available=(Integer)session.getAttribute("available");
 int days=Integer.parseInt(request.getParameter("days"));
 String department=request.getParameter("department");
 if(days>available)
 {
	 available=available-days;
	 PreparedStatement ps=con.prepareStatement("update leaves set employee=?,status=? ,available=? where department=? ");
	 
	 ps.setString(1,employee);
	 ps.setString(2,"accepted");
	 ps.setInt(3,available);
	 ps.setString(4,department);
		int x= ps.executeUpdate();
		if(x!=0)
		{
			response.sendRedirect("./manager_leave.jsp");
		}
 }
 %>
	