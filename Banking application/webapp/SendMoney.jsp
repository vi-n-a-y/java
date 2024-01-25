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
<div class="pers_info">
<h1 class="acc_head">Send Money</h1>
       <form action="http://localhost:8080/Banking_application/trxns">
            <table> 
 
               <tr ><td><label>Receiver Account Number :</label></td><td >  <input type="text" name="rec_acc" class="info_inp"  ></td></tr>
               <tr ><td><label >Receiver IFSC Code :</label></td><td ><input type="text"  name="rec_ifsc" class="info_inp"  ></td></tr>
              <tr ><td> <label>Description :</label></td><td ><input type="text" name="description"  class="info_inp"  ></td></tr>
               <tr ><td><label >Total Amount to transfer :</label></td><td ><input name="total_amount"  name="total_amt" class="info_inp"  ></td></tr>
         		
           </table>
           <button class="sign">send</button>
         </form>

    </div>

</body>
</html>