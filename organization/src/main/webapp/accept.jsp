<%@page import="java.sql.*" %>
<%@page import="com.organization.*" %>
<%
 Connection con= Dbconnection.getconnection();
String username=(String)session.getAttribute("kusername");

String department=(String)session.getAttribute("ddepartment");
String employee=request.getParameter("employee");
int days=Integer.parseInt(request.getParameter("days"));
int available=Integer.parseInt(request.getParameter("available"));
String status;
if(available>=days&&days<=2)
{
	available=available-days;
	status="accepted";	
}
else
{
	status="rejected";
}
  
   PreparedStatement ps=con.prepareStatement(" update leaves set username=?, status=?,available=? where department=? " );
   ps.setString(1, username);
   ps.setString(2,status);
   ps.setInt(3,available);
   ps.setString(4,department);
int x=ps.executeUpdate();
if(x!=0)
{
	response.sendRedirect("./manager_leave.jsp");
}
 %>
    