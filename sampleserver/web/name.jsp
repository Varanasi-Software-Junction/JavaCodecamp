<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="dbpackage.DBConfig"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.Date"%>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link href="styles/library.css" rel="stylesheet" type="text/css"/>

<%
    String result="Member Type Entry";
    String check=request.getParameter("check");
    boolean ispostback=true;
    if(check==null)
        ispostback=false;
    System.out.println(ispostback);
    
String membertypename="";
String remarks="";
String numb="";
String dater="";
if(ispostback)
{
    try
    {
membertypename=request.getParameter("mname");
remarks=request.getParameter("marks");
numb=request.getParameter("val");
dater=request.getParameter("dat");
System.out.println(dater);
Connection connection =DBConfig.getConnection();
PreparedStatement statement=connection.prepareStatement("insert into num values(?,?,?,to_date(?,'yyyy-mm-dd'))");
statement.setString(1, membertypename);
statement.setString(2, remarks);
statement.setString(3,numb);
statement.setString(4, dater);
result="Failed";
int n=statement.executeUpdate();
if(n==1)
result="Success";
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Member Types</title>
        <script>
  function f()
    {
    var x=document.getElementById("mname");
    x.value="";
    var x1=document.getElementById("marks");
    x1.value="";
    var x3=document.getElementById("val");
    x3.value="";
    var x4=document.getElementById("dat");
    x4.value="";
    var x2=document.getElementById("change");
    x2.innerHTML=" Member Type Entry";
    }
    </script>
    <style>
        .forheading{
            text-align: center;
        }
    </style>
    </head>
    <body>
       
   <div class="shado">
    <form action="name.jsp" method="post"> 
         <h1 class="forheading" id="change"><%=result%></h1>
        <input type="hidden" name="check"/>
       
  <label class="forlabels" style="margin-left:130px;"  for="mname"/>Member type Name:</label><br>
  <input class="my" type="text" id="mname" name="mname" value="<%=membertypename%>"/><br></br>
  <label class="forlabels" style="margin-left:160px;" for ="marks">Remarks:</label><br> 
  <input type="text"  class="my" id="marks" name="marks" value="<%=remarks%>"/><br><br>
   <input type="text"  class="my" id="val" name="val" value="<%=numb%>"/><br><br>
  <input type="date"  class="my" id="dat" name="dat" value="<%=dater%>"/><br><br>
  
  <input class="sub" type="submit" value="Submit"/>
  <input class="sub" style="padding-right: 15px; margin-top: 5px;" type="button" onclick="f()" value="Clear "/>
</form>
        </div>
</body>
</html>
