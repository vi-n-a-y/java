import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;
//import java.io.PrintWriter;
//@WebServlet("/home")
public class Home_Page extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out= response.getWriter();
//		String uname=request.getParameter("u_name");
//		String upass= request.getParameter("u_pass");
		Random random = new Random();
		long x=random.nextLong(6000000000L, 9999999999L);
		long y=random.nextLong(100000000000L, 999999999999L);
		
//		out.println(x);
		
		
	String res="<html>\r\n"
			+ "<body>\r\n"
			+ "<div>\r\n"
			+"<button style=\"float:right;\">logout</button>"
			+ "<h1 color=\"blue\" align=\"center\">Home page</h1>\r\n"			
			+ "</div>\r\n"
			+ "<form>\r\n"
			+ "<label>user Info :</label>\r\n"
			+ "<input type=\"text\" id=\"info\"  value="+request.getParameter("u_name")+" name=\"uinfo\"><br><br>\r\n"
			+ "<label>full_name :</label>\r\n"
			+ "<input type=\"text\" id=\"fn\" value="+request.getParameter("u_name")+"michel"+" name=\"fullname\"><br><br>\r\n"
			+ "<label>phone :</label>\r\n"
			+ "<input type=\"text\" id=\"ph\" name=\"ph\" value="+x+"><br><br>\r\n"
			+ "<label>email :</label>\r\n"
			+ "<input type=\"text\" id=\"email\" value="+request.getParameter("u_name")+"@gmail.com"+" name=\"email\"><br><br>\r\n"
			+ "\r\n"
			+ "<div>\r\n"
			+ "<h3 color=\"red\">Accounts: </h3>\r\n"
			+ "<input type=\"radio\" ><label>Account Number</label>\r\n"
			+ "<input type=\"text\" id=\"acc_no\" name=\"acc_no\" value="+y+"><br><br>\r\n"
			+ "<label>IFSC :</label>\r\n"
			+ "<input type=text id=\"ifsc\" name=\"ifsc\"><br><br>\r\n"
			+ "<label>Account_type :</label>\r\n"
			+ "<input type=text id=\"acc_type\" name=\"acc_type\" value="+"SAVINGS"+"><br><br>\r\n"
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
		

	response.sendRedirect("Stmt");
		
		
	}
}

