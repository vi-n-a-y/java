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
               
            <tr ><td><label >User Info :  </label></td><td><input type="text" name="info_user"  value= "<% %>" class="info_text" ></td></tr>
            <tr ><td><label >Full Name : </label></td><td ><input type="text"  name="info_pass" value= "<% %>" class="info_text"  ></td></tr>
            <tr ><td><label >Phone Number :  </label></td><td><input type="text" name="info_phone"  value= "<% %>" class="info_text" ></td></tr>
            <tr ><td><label >Email :  </label></td><td><input type="text" name="info_email"  value= "<% %>" class="info_text"  ></td></tr>
              
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
    <button class="sign" id="btn" onclick="hide()">Statement Form</button>
    <div class="para" id="para">
        <!-- <button style="float:right; color:red;">logout</button> -->
        <div class=pers_info>
        <h1 class="acc_head">statement Form</h1>
        
       
        
         <div  class="min_stm">       
        <label>Start Date : </label>
        <input type="date" placeholder="select start date">
        <label>End Date :</label>
        <input type="date" placeholder="select end date">
        </div>
        <table border=1>
        <caption ><font >Mini-Statement Form</font></caption>
        <tr><th>S.no</th><th>Date</th><th>Description</th><th>Amount</th><th>From Account No:</th><th>To Account No</th><th>Current Balance</th>
        <tr><td>1</td><td>25/03/2022</td><td>transaction</td><td>2000</td><td>365705875453</td><td>XXXX4826</td><td>108548.00</td></tr>
        <tr><td>2</td><td>26/03/2022</td><td>pizza</td><td>750</td><td>365705875453</td><td>XXXX8569</td><td>107798.00</td></tr>
        <tr><td>3</td><td>27/03/2022</td><td>shopping</td><td>9000</td><td>365705875453</td><td>XXXX5138</td><td>98798.00</td></tr>
        <tr><td>4</td><td>28/03/2022</td><td>transaction</td><td>6500</td><td>365705875453</td><td>XXXX7829</td><td>92298.00</td></tr>
        <tr><td>5</td><td>28/03/2022</td><td>pass</td><td>1250</td><td>365705875453</td><td>XXXX1975</td><td>91048.00</td></tr>
        <tr><td>6</td><td>29/03/2022</td><td>transaction</td><td>18500</td><td>365705875453</td><td>XXXX4397</td><td>72548.00</td></tr>
        <tr><td>7</td><td>30/03/2022</td><td>Hotel</td><td>9999</td><td>365705875453</td><td>XXXX4862</td><td>62549.00</td></tr>
        <tr><td>8</td><td>01/04/2022</td><td>salary</td><td>6555</td><td>XXXX9997</td><td>365705875453</td><td>55994.00</td></tr>
        <tr><td>9</td><td>02/04/2022</td><td>shopping</td><td>7999</td><td>365705875453</td><td>XXXX7845</td><td>117995.00</td></tr>
        <tr><td>10</td><td>07/04/2022</td><td>transaction</td><td>2500</td><td>365705875453</td><td>XXXX5968</td><td>115495.00</td></tr>
        
        </table>
        
        </div>
        
        </div>
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












<%-- </head>

<body>
	<% BankDTO details = (BankDTO) session.getAttribute("detailsDao"); %>
	<h1 style="text-align: center">
		<% out.print(details.getUname().toUpperCase()); %>
	</h1>
	

	<div style="display: flex; justify-content: space-between;">
		<h2>
			PhNo:<%= "+91-"+details.getPhno() %>
		</h2>
		<h2>
			Email:<% out.print(details.getEmail()); %>
		</h2>
		<h2>
			Address:<% out.print(details.getAddress()); %>
		</h2>
	</div>


	<form action="" method="post">
		<input type="submit" value="Add Account" />
	</form> --%>

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
	</form> --%>
</body>
</html>