<!DOCTYPE html>
<html>
<body bgcolor="blue">
<br><br><br>
<h1 align='center'>welcome to  student home page</h1>
<br><br><br>
<h2 align='center'><a href="student_home.html">Home</a>
<a href="university_register.jsp">university Register</a>
<a href="student_registration.jsp">student Register details</a>
<a href="index.html">logout</a>
</h2>
<br><br><br>
<%@page import="java.sql.*" %>
<%@page import="com.university.*" %>
<table border="2" width="400" height="200" cellpadding="20" align="center">
<tr>
<td>aid</td>
<td>name</td>
<td>mobile</td>
<td>doa</td>
<td>username</td>
<td>collegename</td>
<td>status</td>
</tr>
<%
 Connection con= DbConnection.getconnection();
String username=(String)session.getAttribute("username");
PreparedStatement ps=con.prepareStatement("select * from student where username=?");
ps.setString(1,username);
ResultSet rs=ps.executeQuery();
while(rs.next())
{
%>
<tr>
<td><%=rs.getInt(1) %></td>
<td><%=rs.getString(2)%></td>
<td><%=rs.getInt(3) %></td>
<td><%=rs.getString(4) %></td>
<td><%=rs.getString(6) %></td>
<td><%=rs.getString(7) %></td>
</tr>
<%} %>
</table>
</body>
</html>