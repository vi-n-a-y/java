<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.vin.bankdto.BankDTO"%>
<%@ page import="com.vin.bankdto.AccountDTO"%>
<%@ page import="com.vin.bankdao.BankDAO"%>
<%@ page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="bank.css">
   
 </head>
<body>
	<% BankDTO user = (BankDTO) session.getAttribute("user"); %>
    <div class="home_main">    
        <div class="bg_black">
            <b> <a class="logo1" href="#" >Pir@es.Bank</a></b>
            <a href="#" >MENU</a>
            <a href="#" >SERVICES</a>
            <a href="#" >JOBS</a>
            <a href="#" >CONTACT US</a>
            <input type="text" placeholder="search">
            <button class="search">search</button>
            <button class="sign">logout</button>       
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
        <h1 class="acc_head">Account Details</h1>
        <button>Add Account</button>
            <table>
                       
                    <tr ><td><label >Accounts :  </label></td><td><input type="radio" name="account_info"  class="info_text" checked ></td></tr>
                    <tr ><td><label >IFSC Code :  </label></td><td><input type="text" name="info_user"  class="info_text" value="<% %>" ></td></tr>
                    <tr ><td><label >Account Type : </label></td><td ><input type="text"  name="info_pass" class="info_text" value="<% %>" ></td></tr>
                    <tr ><td><label >Current Balance :  </label></td><td><input type="text" name="info_phone"  class="info_text"value="<% %>" ></td></tr>
                    <tr ><td><label >Last Transcation Date :  </label></td><td><input type="text" name="info_email"  class="info_text" value="<% %>" ></td></tr>
                      
                </table> 
    </div>
    <form action="Statement.jsp" >
    <button class="sign" id="btn" onclick="hide()">Statement Form</button>
    </form>
    <!-- -->
        </div>
        


    
        <script>
             function hide(){
            
            var par=document.getElementById("para");
            var bon=document.getElementById("btn");
            if(par.style.display!="block")
            par.style.display="block";
        else
        par.style.display="none";

        
        }
   
        </script> 












 </head>

<body>
<%-- 	<% BankDTO user = (BankDTO) session.getAttribute("user"); %>
	<h1 style="text-align: center">
		<% out.print(user.getUname().toUpperCase()); %> --%>
			
<%-- 	<h1 style="text-align: center">
		<% out.print(.toUpperCase()); %>
	</h1>
	

	<div style="display: flex; justify-content: space-between;">
		<h2>
			PhNo:<%= "+91-"+ %>
		</h2>
		<h2>
			Email:<% out.print(); %>
		</h2>
		<h2>
			Address:<% out.print(user.getAddress()); %>
		</h2>
	</div>


	<form action="" method="post">
		<input type="submit" value="Add Account" />
	</form>  --%>

<%-- 	<%
	BankDAO dao = new BankDAO();
	List<AccountDTO> acctList = dao.getAccountDetails(details.getUname());
	%>
	<form>
		<table>
			<%
			for (AccountDTO acct : acctList) {
			%>
			<tr>
				<td><input type="radio"
					id="<%out.print(acct.getAccountNumber());%>" name='acct_no_group' />
				</td>
				<td>
				<div style="display: flex; justify-content: space-between;">
					<h2>
						<% out.print(acct.getAccountNumber());%>:
					</h2> 
					<h2>
						<% out.print(acct.getIfscCode()); %>
					</h2>
				</div>	
				</td>
			</tr>

			<tr>
				<td>
				</td>
				<td>
				<div style="display: flex; justify-content: space-between;">
					<h3>
						<% out.print(acct.getBankName()); %>
					</h3>
					<h3>
						<% out.print(acct.getAcctType()); %>
					</h3>
					<h3>
						<% out.print(acct.getCurrBalance()); %>
					</h3>
					<h3>last_txn_date</h3>
					</div>
				</td>
			</tr>
			<%
		}
		%>
		</table>
	</form>  --%>
</body>
</html>