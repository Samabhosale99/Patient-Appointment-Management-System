<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%
String id=request.getParameter(String.valueOf("DOCTOR_ID"));
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PAMS", "root", "Samarth@99");
Statement st=conn.createStatement();
int i=st.executeUpdate("DELETE FROM DOCTOR_RECORD WHERE DOCTOR_ID="+id);

}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>
<div>
   <ul>
   <h3><b>Doctor data deleted Successfully!</b></h3>
    <li><a href="inner-page.jsp" ><b><b>ADMIN PAGE</b></b></a></li>
   </ul>
  </div>