<%@page import="java.sql.*" %>
<%@page import="com.organization.*" %>
<%
 Connection con= Dbconnection.getconnection();
String employee=(String)session.getAttribute("eemail");
  String department=request.getParameter("department");
  String leavetype=request.getParameter("leavetype");
  int available=Integer.parseInt(request.getParameter("available"));
  String startdate=request.getParameter("startdate");
  String enddate=request.getParameter("enddate");
  int days=Integer.parseInt(request.getParameter("days"));
  String remarks=request.getParameter("remarks");
  
  String sql="insert into leaves (employee,department,leavetype,available,startdate,enddate,days,remarks,username,status)values(?,?,?,?,?,?,?,?,?,?)";
  PreparedStatement ps=con.prepareStatement(sql);
  ps.setString(1,employee);
  ps.setString(2,department);
  ps.setString(3,leavetype);
  ps.setInt(4,available);
  ps.setString(5,startdate);
  ps.setString(6,enddate);
  ps.setInt(7,days);
  ps.setString(8,remarks);
  ps.setString(9,"none");
  ps.setString(10,"pending");
  int x=ps.executeUpdate();
  if(x!=0)
     response.sendRedirect("./employee_leave.jsp");
  
 %>