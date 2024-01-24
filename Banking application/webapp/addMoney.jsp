<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="bank.css">
</head>
<body>
<div class="add_mny">
        <h1 class="markRed">SEND MONEY</h1>
        <form action=""> 
        <table>
        <tr ><td><label >Account Number :</label></td><td><input type="text"  name="acco_nmbr" class="info_inp"  ></td></tr>
        <tr ><td><label > IFSC Code :</label></td><td ><input type="text"  name="ifscc_cd" class="info_inp"  ></td></tr>
        <tr ><td><label > Current Balance :</label></td><td ><input type="text"  name="curr_balan" class="info_inp"  ></td></tr>
        <tr ><td><label>Amount :</label></td><td >  <input type="text" name="amt" class="info_inp"  ></td></tr>
       </table>
       <button>Deposit</button>
    </form>
    </div>

</body>
</html>