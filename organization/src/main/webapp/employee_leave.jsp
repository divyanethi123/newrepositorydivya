<!DOCTYPE html>
<html>
<body bgcolor="jade">
<br><br><br>
<h1 align='center'>welcome to  employee home page</h1>
<br><br><br>
<h2 align='center'><a href="employee_home.html">Home</a>
<a href="apply_leave.jsp">apply leave</a>
<a href="employee_leave.jsp">leave details</a>
<a href="index.html">logout</a>
</h2>
<br><br>
<%@page import="java.sql.*" %>
<%@page import="com.organization.*" %>
<table border="2" width="400" height="200" cellpadding="20" align="center">
<tr>
<td></td>
<td>employee</td>
<td>department</td>
<td>leavetype</td>
<td>startdate</td>
<td>enddate</td>
<td>days</td>
<td>remarks</td>
<td>username</td>
<td>status</td>
</tr>
<%
 Connection con= Dbconnection.getconnection();
String employee=(String)session.getAttribute("emailaddress");
PreparedStatement ps=con.prepareStatement("select * from leaves where employee=?");
ps.setString(1,employee);
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
</tr>
<%} %>
</table>
</body>
</html>