<!DOCTYPE html>
<html>
<body bgcolor="blue">
<br><br><br>
<h1 align='center'>welcome to  manager home page</h1>
<br><br><br>
<h2 align='center'><a href="employee_home.html">Home</a>
<a href="manager_leave.jsp">leave details</a>
<a href="index.html">logout</a>
</h2>
<br><br>
<%@page import="java.sql.*" %>
<%@page import="com.organization.*" %>
<table border="2" width="400" height="200" cellpadding="20" align="center">
<tr>


<td>employee</td>
<td>department</td>
<td>leavetype</td>
<td>available</td>
<td>startdate</td>
<td>enddate</td>
<td>days</td>
<td>remarks</td>
<td>username</td>
<td>status</td>
<td>Action</td>
</tr>
<%
 Connection con= Dbconnection.getconnection();
String department=(String)session.getAttribute("ddepartment");
PreparedStatement ps=con.prepareStatement("select * from leaves where department=?");
ps.setString(1,department);
ResultSet rs=ps.executeQuery();
while(rs.next())
{
%>
<tr>
<td><%=rs.getString(1) %></td>
<td><%=rs.getString(2)%></td>
<td><%=rs.getString(3) %></td>
<td><%=rs.getInt(4) %></td>
<td><%=rs.getString(5)%></td>
<td><%=rs.getString(6) %></td>
<td><%=rs.getInt(7) %></td>
<td><%=rs.getString(8) %></td>
<td><%=rs.getString(9) %></td>
<td><%=rs.getString(10) %></td>
<td><a href="accept.jsp?employee=<%=rs.getString(1) %>&available=<%=rs.getInt(4)%> &days=<%=rs.getInt(7)%>">Accept</a></td>
</tr>
<%} %>
</table>
</body>
</html>