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
String department=(String)session.getAttribute("department");
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
<td><%=rs.getString(4)%></td>
<td><%=rs.getString(5) %></td>
<td><%=rs.getInt(6) %></td>
<td><%=rs.getString(7) %></td>
<td><%=rs.getString(8) %></td>
<td><%=rs.getString(9) %></td>
<td><a href="accept.jsp?leaveno=<%=rs.getString(1) %>">Accept</a>
</tr>
<%} %>
</table>
</body>
</html>