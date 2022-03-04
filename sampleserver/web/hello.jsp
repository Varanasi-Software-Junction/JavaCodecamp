<%-- 
    Document   : hello
    Created on : Sep 28, 2021, 3:14:58 PM
    Author     : rakesh
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="dbpackage.DBConfig"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String firstname=request.getParameter("fname");
String lastname=request.getParameter("lname");
Connection connection =DbConfig.getConnection();
PreparedStatement statement=connection.prepareStatement("insert into reg values(userseq.nextval,?,?)");
statement.setString(1, firstname);
statement.setString(2, lastname);
String result="Failed";
int n=statement.executeUpdate();
if(n==1)
result="Success";
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
        <h1><%=result%></h1>
        <h2>You entered first name as <%=firstname%></h2>
         <h2>You entered last name as <%=lastname%></h2>
         
         
    </body>
</html>
