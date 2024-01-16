//import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vin.bankdto.BankDTO;
import com.vin.bankdao.BankDAO;

import java.io.PrintWriter;
@WebServlet("/home")
public class Home_Page extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private BankDAO detailsDao=new BankDAO();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		
		String uname=request.getParameter("u_name");
		String password=request.getParameter("u_pass");
		String fullName=request.getParameter("fullName");
		String email=request.getParameter("email");
		String phno=request.getParameter("phNo");
		String address=request.getParameter("address");
		
		


		BankDTO details_dto =new BankDTO();
		
		details_dto.setUname(uname);
		details_dto.setPassword(password);
		details_dto.setFullName(fullName);
		details_dto.setEmail(email);
		details_dto.setPhno(phno);
		details_dto.setAddress(address);
		
		try {
			detailsDao.registerDetails(details_dto);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		PrintWriter out= response.getWriter();
//		out.println("register successfully");checked

		PrintWriter out= response.getWriter();
		String personal="<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Document</title>\r\n"
				+ "    <style>\r\n"
				+ " \r\n"
				+ "\r\n"
				+ ".bg_black{\r\n"
				+ "    background-color: black;\r\n"
				+ "    height:50px;\r\n"
				+ "    padding-top:25px;\r\n"
				+ "    color:white;\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ ".logo1{\r\n"
				+ "    font-size:20px;\r\n"
				+ "    padding-left:35px;\r\n"
				+ "    color:blue;\r\n"
				+ "}\r\n"
				+ "a{\r\n"
				+ "    padding-right:120px;\r\n"
				+ "    text-decoration: none;\r\n"
				+ "    color:white;\r\n"
				+ "    \r\n"
				+ "\r\n"
				+ "}\r\n"
				+ ".search{\r\n"
				+ "    background-color: orange;\r\n"
				+ "    color:white;\r\n"
				+ "    \r\n"
				+ "   \r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".search:hover{\r\n"
				+ "    background-color: blue;\r\n"
				+ "    color:orange;\r\n"
				+ "}\r\n"
				+ ".sign{\r\n"
				+ "    background-color: orange;\r\n"
				+ "    color:white;\r\n"
				+ "    border-radius: 10%;\r\n"
				+ "    padding:2px 10px ;\r\n"
				+ "   \r\n"
				+ "    margin:0px 80px;\r\n"
				+ "}\r\n"
				+ ".sign:hover{\r\n"
				+ "    background-color: blue;\r\n"
				+ "    color:orange;\r\n"
				+ "}\r\n"
				+ ".pers_info{\r\n"
				+ "    padding: 20px 50px;\r\n"
				+ "    margin: 20px 50px;\r\n"
				+ "    border:2px solid black;\r\n"
				+ "}\r\n"
				+ ".info_text{\r\n"
				+ "    margin: 20px 20px;\r\n"
				+ "        height:20px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "   \r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "    </style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<div class=\"home_main\">    \r\n"
				+ "    <div class=\"bg_black\">\r\n"
				+ "        <b> <a class=\"logo1\" href=\"#\" >Pir@es.Bank</a></b>\r\n"
				+ "        <a href=\"#\" >MENU</a>\r\n"
				+ "        <a href=\"#\" >SERVICES</a>\r\n"
				+ "        <a href=\"#\" >JOBS</a>\r\n"
				+ "        <a href=\"#\" >CONTACT US</a>\r\n"
				+ "        <input type=\"text\" placeholder=\"search\">\r\n"
				+ "        <button class=\"search\">search</button>\r\n"
				+ "        <button class=\"sign\">logout</button>       \r\n"
				+ "    </div>\r\n"
				+ "<div class=\"pers_info\">\r\n"
				+ "    <table>\r\n"
				+ "           \r\n"
				+ "        <tr ><td><label >User Name :  </label></td><td><input type=\"text\" name=\"info_user\"  class=\"info_text\" value="+uname+" ></td></tr>\r\n"
				+ "        <tr ><td><label >Full Name : </label></td><td ><input type=\"text\"  name=\"info_pass\" class=\"info_text\" value="+fullName+"  ></td></tr>\r\n"
				+ "        <tr ><td><label >Phone Number :  </label></td><td><input type=\"text\" name=\"info_phone\"  class=\"info_text\" value="+phno+" ></td></tr>\r\n"
				+ "        <tr ><td><label >Email :  </label></td><td><input type=\"text\" name=\"info_email\"  class=\"info_text\" value="+email+" ></td></tr>\r\n"
				+ "          \r\n"
				+ "    </table> \r\n"
				+ "</div>\r\n"
				+ "<div>\r\n"
				+ "\r\n"
				+ "    <table>\r\n"
				+ "           \r\n"
				+ "        <tr ><td><label >Accounts :  </label></td><td><input type=\"radio\" name=\"account_info\"  class=\"info_text\" checked ></td></tr>\r\n"
				+ "        <tr ><td><label >IFSC Code :  </label></td><td><input type=\"text\" name=\"info_user\"  class=\"info_text\" value=\"SBI00467\" ></td></tr>\r\n"
				+ "        <tr ><td><label >Account Type : </label></td><td ><input type=\"text\"  name=\"info_pass\" class=\"info_text\" value=\"Savings\" ></td></tr>\r\n"
				+ "        <tr ><td><label >Current Balance :  </label></td><td><input type=\"text\" name=\"info_phone\"  class=\"info_text\"value=\"1025.45\" ></td></tr>\r\n"
				+ "        <tr ><td><label >Last Transcation Date :  </label></td><td><input type=\"text\" name=\"info_email\"  class=\"info_text\" value=\"17/01/2024\" ></td></tr>\r\n"
				+ "          \r\n"
				+ "    </table> \r\n"
				+ "\r\n"
//				+ "    <table>\r\n"
//				+ "           \r\n"
//				+ "        <tr ><td><label >Accounts :  </label></td><td><input type=\"radio\" name=\"account_info\"  class=\"info_text\" ></td></tr>\r\n"
//				+ "        <tr ><td><label >IFSC Code :  </label></td><td><input type=\"text\" name=\"info_user\"  class=\"info_text\" ></td></tr>\r\n"
//				+ "        <tr ><td><label >Account Type : </label></td><td ><input type=\"text\"  name=\"info_pass\" class=\"info_text\"  ></td></tr>\r\n"
//				+ "        <tr ><td><label >Current Balance :  </label></td><td><input type=\"text\" name=\"info_phone\"  class=\"info_text\" ></td></tr>\r\n"
//				+ "        <tr ><td><label >Last Transcation Date :  </label></td><td><input type=\"text\" name=\"info_email\"  class=\"info_text\"  ></td></tr>\r\n"
//				+ "          \r\n"
//				+ "    </table> \r\n"
//				+ "\r\n"
				+ "</div>\r\n"
				+ "    </div>\r\n"
				+ "</body>\r\n"
				+ "</html>";
		
		


		

		try {
	
			
			Class .forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
			String user_name=request.getParameter("u_name");
			String user_pass= request.getParameter("u_pass");
			PreparedStatement ps=con.prepareStatement("select * from user_info where user_name=? and user_pass=?");
//			
//			uname,password,fullName,email,phno,address
			ps.setString(1,user_name);
			ps.setString(2,user_pass);
//			ps.setString(3,fullName);
//			ps.setString(4,email);
//			ps.setString(5,phno);
//			ps.setString(6,address);
			
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				response.getWriter().append(personal);
//				out.println("success");
				
			}
			else {

					String again= "<font color=\"red\">login failed , Try again!</font>\r\n";
				response.getWriter().append("<html><body>").append(again).append("</body></html>");
				
//				response.sendRedirect("http://localhost:8080/Banking_application/bank.html");
				

				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
}
}






