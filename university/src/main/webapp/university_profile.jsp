<!DOCTYPE html>
<html>
<body bgcolor="blue">
<br><br><br>
<h1 align='center'>welcome to home page</h1>
<br><br><br>
<h2 align='center'><a href="home.html">Home</a>
<a href="university_profile.jsp">profile</a>
<a href="student_application.jsp">register details</a>
<a href="index.html">logout</a>
</h2>
<br><br><br>
<%@page import="java.sql.*" %>
<%@page import="com.university.*" %>
<table border="2" width="400" height="200" cellpadding="20" align="center">
<tr>
<td>username</td>
<td>degree</td>
<td>collegename</td>
<td>collegeType</td>
<td>branches</td>
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
<td><%=rs.getString(1) %></td>
<td><%=rs.getString(2)%></td>
<td><%=rs.getString(3)%></td>
<td><%=rs.getString(4) %></td>
<td><%=rs.getString(5) %></td>
<%} %>
</table>
</body>
</html>