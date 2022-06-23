<%@page import="java.sql.*" %>
<%@page import="com.organization.*" %>
<%
 Connection con= Dbconnection.getconnection();
String employee=(String)session.getAttribute("emailaddress");
  String department=request.getParameter("department");
  String leavetype=request.getParameter("leavetype");
  String startdate=request.getParameter("startdate");
  String enddate=request.getParameter("enddate");
  int days=Integer.parseInt(request.getParameter("days"));
  String remarks=request.getParameter("remarks");
  
  String sql="insert into leaves (employee,department,leavetype,startdate,enddate,days,remarks,username,status)values(?,?,?,?,?,?,?,?,?)";
  PreparedStatement ps=con.prepareStatement(sql);
  ps.setString(1,employee);
  ps.setString(2,department);
  ps.setString(3,leavetype);
  ps.setString(4,startdate);
  ps.setString(5,enddate);
  ps.setInt(6,days);
  ps.setString(7,remarks);
  ps.setString(8,"none");
  ps.setString(9,"pending");
  int x=ps.executeUpdate();
  if(x!=0)
     response.sendRedirect("./employee_leave.jsp");
  
 %>