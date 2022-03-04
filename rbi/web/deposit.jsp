<%@page import="javax.resource.cci.ResultSet"%>
<%@page import="banking.BankAccount"%>
<%@page import="banking.Database"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.Date"%>
<%
    String result="Account number";
    String check=request.getParameter("check");
    boolean ispostback=true;
    if(check==null)
        ispostback=false;
    System.out.println(ispostback);
    String submit="";
String accountnumber="";
if(ispostback)
{
    submit=request.getParameter("submit");
    System.out.println(submit);
    if(submit.equals("first"))
      {
           try  
        
    {
accountnumber=request.getParameter("ac");
int acno=Integer.parseInt(accountnumber);
BankAccount account=new BankAccount(acno);
System.out.println(account);
result="" + account;
    }
    catch(Exception ex)
    {
        System.out.println(ex);
        result=ex.getMessage();
    }
   
          
      }
    if(submit.equals("second"))
    {
        try
        {
   accountnumber=request.getParameter("acc");
 String  depositamount=request.getParameter("de");
int acno=Integer.parseInt(accountnumber);
int de=Integer.parseInt(depositamount);
BankAccount account=new BankAccount(acno);
int currentbalance=account.getAmount();
account.setAmount(currentbalance + de);
account.update();
System.out.println(account);
result="" + account;
    }
    catch(Exception ex)
    {
        System.out.println(ex);
        result=ex.getMessage();
    }
   
    }
    
}
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <body style="background-color:blue;">
        
        <form method="post">
            <input type="hidden" name="check"/>
           <div class="row">
      <div class="col" >
       <label for="ac">Account number:</label>
      <input type="text" class="form-control"id="ac" placeholder="Enter Account number" name="ac" value="<%=accountnumber%>" required>
      <br><br>
       <br><br>
       <button type="submit" name="submit" value="first" class="btn btn-primary">Submit</button>
     </div>
     
      <%=result%>
           </div>
        </form>
            <form method="post">
            <input type="hidden" name="check"/>
          <div class="row">
      <div class="col" >
       <label for="ac">Account number:</label>
      <input type="text" class="form-control"id="ac" placeholder="Enter Account number" name="acc" value="<%=accountnumber%>" required>
      <br><br>
      <label for="da">Deposit amount:</label>
      <input type="text" class="form-control"id="de" placeholder="Enter Deposit amount" name="de"  required>
      <br><br>
      <button type="submit"   name="submit" value="second"  class="btn btn-primary">Submit</button>
     </div>
          </div>
        </form>
      
    </body>
</html>


            
            
            
            
            
            
            
            
            
            
            
            
            
      
