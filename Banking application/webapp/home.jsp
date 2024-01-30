<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.vin.bankdto.BankDTO"%>
<%@ page import="com.vin.bankdto.AccountDTO"%>
<%@ page import="com.vin.bankdao.BankDAO"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Banking Application</title>
<link rel="stylesheet" href="bank.css">
   
 </head>
<body>
	<% BankDTO user = (BankDTO) session.getAttribute("user"); %>
    <div class="home_main">    
        <div class="bg_black">
            <b> <a  class="logo1" href="#" >Pir@es.Bank</a></b>
            <a class="nav" href="#" >MENU</a>
            <a class="nav"  href="addMoney.jsp" >ADD MONEY</a>
            <a  class="nav" href="Statement.jsp" >STATEMENT</a>
            <a class="nav"  href="SendMoney.jsp" >SEND MONEY</a>
            <input type="text" placeholder="search">
            <button class="search">search</button>
            <!-- <form action="out"> -->
           <a  href="logout.jsp" ><button class="sign" >logout</button></a>  
            <!-- </form>  -->    
        </div>

    <div class="pers_info">
    <h1 class="acc_head">User Details</h1>
   
        <table>
               
            <tr ><td><label >User Name :  </label></td><td><input type="text" name="info_user"  value= "<%= user.getUname() %>" class="info_text" ></td></tr>
            <tr ><td><label >Full Name : </label></td><td ><input type="text"  name="info_pass" value= "<%= user.getFullName() %>" class="info_text"  ></td></tr>
            <tr ><td><label >Phone Number :  </label></td><td><input type="text" name="info_phone"  value= "<%= user.getPhno() %>" class="info_text" ></td></tr>
            <tr ><td><label >Email :  </label></td><td><input type="text" name="info_email"  value= "<%= user.getEmail()%>" class="info_text"  ></td></tr>
              
        </table> 

    </div>
   		 <div class="acc_info">
   

     <%BankDAO detailsDao=new BankDAO(); 
     List<AccountDTO>  data=detailsDao.getAccDetails(user.getUserId());  %>
   

        <h1 class="acc_head">Account Details</h1>

     
       <% if(data!=null){ %> 
    
            <table>
            			<%for(AccountDTO accDto : data ){ %>
            			
                        <%session.setAttribute("data", accDto); %>
                    <tr ><td><label >Accounts :  </label></td><td><input type="radio" name="acc_info"  class="info_text" checked ></td></tr>
                    <tr ><td><label >Account Number :  </label></td><td><input type="text" name="acc_nmbr"  class="info_text" value="<%= accDto.getAccountNumber() %>" ></td></tr>
                    <tr ><td><label >Bank Name :  </label></td><td><input type="text" name="acc_bank_name"  class="info_text" value="<%= accDto.getBankName() %>" ></td></tr>
                    <tr ><td><label >IFSC Code :  </label></td><td><input type="text" name="acc_ifsc"  class="info_text" value="<%= accDto.getIfscCode() %>" ></td></tr>                
                   <tr ><td><label >Account Type : </label></td><td ><input type="text"  name="acc_type" class="info_text" value="<%= accDto.getAcctType()%>" ></td></tr>
                    <tr ><td><label >Current Balance :  </label></td><td><input type="text" name="acc_bal"  class="info_text"value="<%= accDto.getCurrBalance()%>" ></td></tr>
                     
                     <%} %> 
                    
                </table>
               
                
                
                <%} else{ %>
                <form action="AccDet">
                <h5> please enter the values</h5>
                  <table>
                       
                    <tr ><td><label >Accounts :  </label></td><td><input type="radio" name="acc_info"  class="info_text" checked ></td></tr>                   
                    <tr ><td><label >Account Number :  </label></td><td><input type="text" name="acc_nmbr"  class="info_text"  required></td></tr>
                    <tr ><td><label >Bank Name :  </label></td><td><input type="text" name="acc_bank_name"  class="info_text"  required></td></tr>
                    <tr ><td><label >IFSC Code :  </label></td><td><input type="text" name="acc_ifsc"  class="info_text" required ></td></tr>                
                   <tr ><td><label >Account Type : </label></td><td ><input type="text"  name="acc_type" class="info_text"  required></td></tr>
                    <tr ><td><label >Current Balance :  </label></td><td><input type="text" name="acc_bal"  class="info_text" required></td></tr>
                     
                </table>
                <button>submit</button>
                </form> 
                
          <%} %> 
          
           
    </div> 
    
     <form action="addMoney.jsp" >
    <button class="sign" id="btn" onclick="">Add Money</button>
    </form>
        </div>
        <%-- <jsp:include page="../common/footer.jsp"></jsp:include> --%>


</body>
</html>