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
<div class="addMoney">
        <!-- <form action="home" method="get"> -->
            <table> 
             
               <tr><td><label>Source Account :</label></td><td><input type="text" name="Src_acc" class="info_inp" ></td></tr>
               <tr ><td><label >Account Number :</label></td><td><input type="text"  name="acc_nmbr" class="info_inp"  ></td></tr>
               <tr ><td> <label>Description :</label></td><td ><input type="text" name="description"  class="info_inp"  ></td></tr>
               <tr ><td><label>Target Account :</label></td><td >  <input type="text" name="tar_acc" class="info_inp"  ></td></tr>
               <tr ><td><label >Target IFSC Code :</label></td><td ><input type="text"  name="tar_ifsc" class="info_inp"  ></td></tr>
               <tr ><td><label >Total Amount :</label></td><td ><input type="text"  name="total_amt" class="info_inp"  ></td></tr>
         		
           </table>
           <!-- </form> -->

    </div>

</body>
</html>