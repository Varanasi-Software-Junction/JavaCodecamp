<%-- 
    Document   : newaccount
    Created on : Oct 9, 2021, 4:19:34 PM
    Author     : rakesh
--%>
<%@page import="banking.Database"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.Date"%>
<%
    String result="CustomerName";
    String check=request.getParameter("check");
    boolean ispostback=true;
    if(check==null)
        ispostback=false;
    System.out.println(ispostback);
    
String CustomerName="";
String Amount="";

if(ispostback)
{
    try
    {
CustomerName=request.getParameter("cname");
Amount=request.getParameter("ant");

Connection connection =Database.getConnection();
PreparedStatement statement=connection.prepareStatement("insert into bank values(bankseq.nextval,?,?)");
statement.setString(1, CustomerName);
statement.setString(2,Amount );
;
result="Failed";
int n=statement.executeUpdate();
if(n==1)
    result="Success";
System.out.println(CustomerName);

    }
    catch(Exception ex)
    {
        System.out.println(ex);
        result="Failed ";
    }
    
}
%>
<html>
 <head>
  <title>Bootstrap Example</title>
  <%@include file="header.jsp" %>
</head>
    <body>
        <%@include file="menu.jsp" %>
        <div class="container-fluid mt-6 bg-primary text-white ">     
            <h1><center>RBI</center></h1>
        
  <p>Open a new account.</p>
  <p>Please fill up the form.</p>
       
   <div class="row">
         <div class="col-sm-2 p-2  text-white padding">
         </div>
    <div class="col-sm-8 p-8  text-white  padding">New Account Form
    <form method="post" class="was-validated">  
        <input type="hidden" name="check"/>
    <div class="form-group">
      <label for="uname">Customer Name:</label>
      <input type="text" class="form-control" value="<%=CustomerName%>" id="cname" placeholder="Enter Customer Name" name="cname" required>
      <div class="valid-feedback">Valid.</div>
      <div class="invalid-feedback">Please fill out this field.</div>
    </div>
    <div class="form-group">
      <label for="ant">Amount:</label>
      <input type="text" class="form-control" value="<%=Amount%>" id="ant" placeholder="Enter Amount" name="ant" required>
      <div class="valid-feedback">Valid.</div>
      <div class="invalid-feedback">Please fill out this field.</div>
    </div>
      
    
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>
        <div class="col-sm-2 p-2  text-white padding">
         </div>
   </div>
        </div>
    </body>
</html>
