<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  errorPage="error.jsp" %>
    <%@ page import="com.vin.bankdto.BankDTO"%>
<%@ page import="com.vin.bankdto.AccountDTO"%>
<%@ page import="com.vin.bankdto.TransactionDTO"%>

<%@ page import="com.vin.bankdao.BankDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<div class="para" id="para">
        <button style="float:right; color:red;">logout</button>
        <div class=pers_info>
        <h1 class="acc_head">statement Form</h1>
        
       
        
         <div  class="min_stm">       
        <label>Start Date : </label>
        <input type="date" placeholder="select start date">
        <label>End Date :</label>
        <input type="date" placeholder="select end date">
        
        <% BankDTO user = (BankDTO) session.getAttribute("user"); %>
        <% BankDAO trxn = new BankDAO(); %>
        <% TransactionDTO mini=(TransactionDTO)trxn.setMiniStatement(user.getUserId()); %>
        
        
        
        
        
        </div>
        <%if(mini!=null){ %>
        <table border=1>
        
        <caption ><font >Mini-Statement Form</font></caption>
        <tr><th>Trxn_id</th><th>Date</th><th>From Account No:</th><th>To Account No</th><th>Description</th><th>Amount</th><th>Current Balance</th>
        <tr><td><%=mini.getTrnId() %></td><td><%=mini.getTrnDate() %></td><td><%=mini.getFromAcc()%></td><td><%=mini.getToAcc() %></td><td><%=mini.getDescription() %></td><td><%=mini.getAmountSend() %></td><td><%=mini.getBalance() %></td></tr>
       
        
        </table>
         <%}else{ 
        	throw new RuntimeException("Error condition!!!");
        	
        }%>
        
        </div>
        
        </div> 

</body>
</html>