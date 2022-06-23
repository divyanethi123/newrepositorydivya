<%@page import="java.sql.*" %>
<%@page import="com.university.*" %>
<%
 Connection con= DbConnection.getconnection();
  String name=request.getParameter("name");
  int mobile=Integer.parseInt(request.getParameter("mobile"));
  String doa=request.getParameter("doa");
  String username=(String)session.getAttribute("username");
  String sql="insert into application (name,mobile,doa,username,collegename,status)values(?,?,?,?,?,?)";
  PreparedStatement ps=con.prepareStatement(sql);
  ps.setString(1,name);
  ps.setInt(2,mobile);
  ps.setString(3,doa);
  ps.setString(4,username);
  ps.setString(5,"none");
  ps.setString(6,"pending");
  int x=ps.executeUpdate();
  while(x!=0)
     response.sendRedirect("./student_registration.jsp");
  
 %>
