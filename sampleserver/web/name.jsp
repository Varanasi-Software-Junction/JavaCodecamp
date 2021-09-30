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
if(ispostback)
{
membertypename=request.getParameter("mname");
remarks=request.getParameter("marks");
Connection connection =DBConfig.getConnection();
PreparedStatement statement=connection.prepareStatement("insert into membertypes values(membertypesequence.nextval,?,?)");
statement.setString(1, membertypename);
statement.setString(2, remarks);
result="Failed";
int n=statement.executeUpdate();
if(n==1)
result="Success";

}
%>   
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Member Types</title>
    </head>
    <body>
   <div class="shado">
    <form action="name.jsp" method="post">  
        <input type="hidden" name="check"/>
       
  <label class="forlabels" style="margin-left:130px;"  for="mname"/>Member type Name:</label><br>
  <input class="my" type="text" id="mname" name="mname" value="<%=membertypename%>"/><br></br>
  <label class="forlabels" style="margin-left:160px;" for ="marks">Remarks:</label><br> 
  <input type="text"  class="my" id="marks" name="marks" value="<%=remarks%>"/><br><br>
  <input class="sub" type="submit" value="Submit"/>
</form>
        </div>
</body>
</html>
