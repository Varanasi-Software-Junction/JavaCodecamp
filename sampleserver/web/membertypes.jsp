<%@page import="java.sql.PreparedStatement"%>
<%@page import="dbpackage.DBConfig"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String check=request.getParameter("check");
boolean ispostback=true;
//System.out.println(check);
if(check==null)
ispostback=false;
System.out.println(ispostback);
String data="";
if(ispostback)
{
    data=request.getParameter("out");
   
}
PreparedStatement statement=DBConfig.getConnection().prepareStatement("Select * from num where membertypename=?");
statement.setString(1, data);
%>
        

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Member Types</title>
       <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <link href="styles/library.css" rel="stylesheet" type="text/css"/>
        <style>
 .mar{
    padding-left: 10px;
    padding-right: 10px;
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    font-size: medium;
}
.cont
{
margin-top:20px;
background-color:teal;
padding-bottom:100px;
color:white;
box-shadow:0px 0px 20px black;
border-radius:20px;
}
/*.input{
1width:300px;
border-style:solid;
border-radius:10px;
}*/
body{
background-color:#022140 ;
}
.button {
 display: inline-block;
 padding: 15px 25px;
 font-size: 24px;
 cursor: pointer;
 text-align: center;
 text-decoration: none; background-color: #4CAF50;

 outline: none;
 color: #fff;
 background-color: #4CAF50;
 border: none;
 border-radius: 15px;
 box-shadow: 0 9px #AC7D0C;
}
.button:hover {background-color: #3e8e41}
.button:active {
 background-color: #3e8e41;
 box-shadow: 0 5px #666;
 transform: translateY(4px);
}
.work{
    background-color: azure;
    margin-left: 410px;
    margin-right: 310px;
}
        </style>
    </head>
    <body>
        <form action="membertypes.jsp" method="post" >
         <div class="container cont ">
	<div class="row">
	<div class="col-md-4">
	</div>
	<div class ="col-md-4">
	<div class="form-group">
	Receipt no.<br>
        <input type="hidden" name="check"/>
	<input type="text" class="input form-control "  id="out" value="<%=data%>" name="out"  >
        <br>
        </div>
        </div>
        <div class="col-md-4">
	</div>
        </div>
        <br>
        <div class="row">
	<div class="col-md-5">
	</div>
        <div class="col-md-3 form-group">
	<input type="submit" value="Submit" id="ut" class="button" name="cmd" >
	</div>
        </div>
	</div>                
        <%
        String tab=DBConfig.getTabl(statement);   
        if(tab!=null)
        {
            %>
            <br>
            <div class="work" ><%=tab%></div>
            <%
        }
        if(tab==null && data!="")
        {%>
        <%=validationpackages.ValidationUtilities.showErrorAlert("No Records", "Your search didn't produce results")%>
        <%
        }   
        %>
       </form>
    </body>
</html>
