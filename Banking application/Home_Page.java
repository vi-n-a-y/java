package com.abcd.efg;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class user_login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		String uname=request.getParameter("u_name");
		String upass= request.getParameter("u_pass");
	String res="<html>\r\n"
			+ "<body>\r\n"
			+ "<form>\r\n"
			+ "<h1 color=\"blue\" align=\"center\">Home page</h1>\r\n"
			+ "<label>user Info :</label>\r\n"
			+ "<input type=\"text\" id=\"info\" name=\"uinfo\"><br><br>\r\n"
			+ "<label>full_name :</label>\r\n"
			+ "<input type=\"text\" id=\"fn\" name=\"fullname\"><br><br>\r\n"
			+ "<label>phone :</label>\r\n"
			+ "<input type=\"text\" id=\"ph\" name=\"ph\"><br><br>\r\n"
			+ "<label>email :</label>\r\n"
			+ "<input type=\"text\" id=\"email\" name=\"email\"><br><br>\r\n"
			+ "\r\n"
			+ "<div>\r\n"
			+ "<h3 color=\"red\">Accounts: </h3>\r\n"
			+ "<input type=\"radio\" ><label>Account Number</label>\r\n"
			+ "<input type=\"text\" id=\"acc_no\" name=\"acc_no\"><br><br>\r\n"
			+ "<label>IFSC :</label>\r\n"
			+ "<input type=text id=\"ifsc\" name=\"ifsc\"><br><br>\r\n"
			+ "<label>Account_type :</label>\r\n"
			+ "<input type=text id=\"acc_type\" name=\"acc_type\"><br><br>\r\n"
			+ "<label>current_balance :</label>\r\n"
			+ "<input type=text id=\"curr_bal\" name=\"curr_bal\"><br><br>\r\n"
			+ "<label>last transaction date :</label>\r\n"
			+ "<input type=text id=\"lst_txn_dt\" name=\"lst_txn_dt\"><br><br>\r\n"
			+ "</div>\r\n"
			+ "<div>\r\n"
			+ "<label>Statement request form :</label>\r\n"
			+ "<button onclick=\"stm()\">press here</button>\r\n"
			+ "</div>\r\n"
			+ "</form>\r\n"
			+ "</body>\r\n"
			+ "</html>";
		response.getWriter().append(res);
		
		
	}
}
