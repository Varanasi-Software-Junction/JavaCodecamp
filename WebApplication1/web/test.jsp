<%-- 
    Document   : test
    Created on : Oct 2, 2021, 2:48:02 PM
    Author     : rakesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="dbpackage.DbConfig"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.Date"%>
<%
    String result="Member Type Entry";
    String check=request.getParameter("check");
    boolean ispostback=true;
    if(check==null)
        ispostback=false;
    System.out.println(ispostback);
    
String no="";
String name="";
if(ispostback)
{
    try
    {
name=request.getParameter("abhi");
no=request.getParameter("i");
Connection connection =DbConfig.getConnection();
PreparedStatement statement=connection.prepareStatement("insert into name values(?,?)");
statement.setString(1, no);
statement.setString(2, name);
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
