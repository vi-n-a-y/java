<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Account</title>
<link rel="stylesheet" href="bank.css">
</head>
<body>
<a href="home.jsp"><button class="home_btn" >Home</button></a>
 <a  href="logout.jsp" ><button class="home_btn" >logout</button></a>
<div class="pers_info">
        <h1 class="markRed">Add Account</h1>
<form action="AccDet">
               
                  <table>
                       
                                     
                    <tr ><td><label >Account Number :  </label></td><td><input type="text" name="acc_nmbr"  class="info_text"  required></td></tr>
                    <tr ><td><label >Bank Name :  </label></td><td><input type="text" name="acc_bank_name"  class="info_text"  required></td></tr>
                    <tr ><td><label >IFSC Code :  </label></td><td><input type="text" name="acc_ifsc"  class="info_text" required ></td></tr>                
                   <tr ><td><label >Account Type : </label></td><td ><input type="text"  name="acc_type" class="info_text"  required></td></tr>
                    <tr ><td><label >Current Balance :  </label></td><td><input type="text" name="acc_bal"  class="info_text" required></td></tr>                    
                </table>
                <button class="sign">submit</button>
                </form> 
</div>

</body>
</html>