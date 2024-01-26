<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.vin.bankdto.AccountDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="bank.css">
</head>
<body>

	<%AccountDTO data=(AccountDTO)session.getAttribute("data"); %>


<div class="add_mny">
        <h1 class="markRed">SEND MONEY</h1>
        <form action=""> 
        <table>
        <tr ><td><label >Account Number :</label></td><td><input type="text"  name="add_acc_nmbr" value=<%=data.getAccountNumber() %> class="info_inp"  ></td></tr>
        <tr ><td><label > IFSC Code :</label></td><td ><input type="text"  name="add_ifscc_cd" value=<%=data.getIfscCode() %> class="info_inp"  ></td></tr>
        <tr ><td><label > Current Balance :</label></td><td ><input type="text"  name="curr_balan" value=<%=data.getCurrBalance() %> class="info_inp"  ></td></tr>
        <tr ><td><label>Amount :</label></td><td >  <input type="text" name="amt" class="info_inp"  ></td></tr>
       </table>
       <button>Deposit</button>
    </form>
    </div>

</body>
</html>