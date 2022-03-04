<%-- 
    Document   : user.jsp
    Created on : Oct 8, 2021, 2:29:10 PM
    Author     : rakesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="dbpackage.DbConfig"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.Date"%>
<%
    String result="login";
    String check=request.getParameter("check");
    boolean ispostback=true;
    if(check==null)
        ispostback=false;
    System.out.println(ispostback);
    
String userid="";
String name="";
String password="";
if(ispostback)
{
    try
    {
userid=request.getParameter("userid");
name=request.getParameter("nm");
password=request.getParameter("pwd");
Connection connection =DbConfig.getConnection();
PreparedStatement statement=connection.prepareStatement("insert into login values(?,?,?)");
statement.setString(1, userid);
statement.setString(2, name);
statement.setString(3, password);
result="Failed";
int n=statement.executeUpdate();
if(n==1)
    result="Success";
System.out.println(name);

    }
    catch(Exception ex)
    {
        System.out.println(ex);
        result="Failed ";
    }
    
}
%>
<!DOCTYPE html>
<html>
    <head>
        <head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
    <form action="user.jsp" method="post">
        <input type="hidden" name="check"/>
<div class="container">
  <h2>Login form</h2>
  
    <div class="form-group">
      <label for="userid">UserId:</label>
      <input type="userid" class="form-control" id="userid" placeholder="Enter UserId" name="userid">
    </div>
    <div class="form-group">
      <label for="nm">Name:</label>
      <input type="name" class="form-control" id="nm" placeholder="Enter Name" name="nm">
    </div>
	<div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
    </div>
    
    <button type="submit" class="btn btn-default">Submit</button>
  
</div>
   </form> 
</body>
</html>
