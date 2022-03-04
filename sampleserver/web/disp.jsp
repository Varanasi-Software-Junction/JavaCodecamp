
<%-- 
    Document   : disp
    Created on : Oct 5, 2021, 1:07:01 PM
    Author     : rakesh
--%>
<%@page import="dbpackage.DBConfig"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Page</title>
        <script>
            
           var x=document.getElementById("out");
    int a1=Integer.paseInt(x.value);
String query="select * from num where numb='"+a1+""+"'";
       </script>  
            
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
