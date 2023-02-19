<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%

String driverName = "com.mysql.cj.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/PAMS";
String dbName = "root";
String password = "Samarth@99";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<h2 align="center"><font><strong>All DOCTOR Details</strong></font></h2>
<div>
   <ul>
    <li><a href="inner-page.jsp" ><b>ADMIN</b></a></li>
   </ul>
  </div>
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>

</tr>
<tr bgcolor="#A52A2A">
<td><b>Id</b></td>
<td><b>Doctor name</b></td>
<td><b>TOTAL_EXPERIENCE</b></td>
<td><b>CONSULTING_CHARGE</b></td>
<td><b>EDUCATION_DEGREE</b></td>
<td><b>TIME_SLOTS</b></td>
<td><b>SPECIALITY</b></td>
<td><b>UPDATE</b>
<td><b>DELETE</b></td>
</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl, dbName,  password);
statement=connection.createStatement();
String sql ="SELECT * FROM DOCTOR_RECORD";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr bgcolor="#DEB887">

<td><%=resultSet.getInt("DOCTOR_ID") %></td>
<td><%=resultSet.getString("DOCTOR_NAME") %></td>
<td><%=resultSet.getInt("TOTAL_EXPERIENCE") %></td>
<td><%=resultSet.getInt("CONSULTING_CHARGE") %></td>
<td><%=resultSet.getString("EDUCATION_DEGREE") %></td>
<td><%=resultSet.getString("TIME_SLOTS") %></td>
<td><%=resultSet.getString("SPECIALITY") %></td>
<td><a href="Edit.jsp?DOCTOR_ID=<%=resultSet.getInt("DOCTOR_ID") %>"><button type="button"  class="edit">Edit</button></a></td>
<td><a href="delete.jsp?DOCTOR_ID=<%=resultSet.getInt("DOCTOR_ID") %>"><button type="button"  class="delete">Delete</button></a></td>



</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
