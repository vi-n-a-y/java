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

import java.io.PrintWriter;
@WebServlet("/home")
public class Home_Page extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int userId=Integer.parseInt(getInitParameter("userId"));
		String regi_name=request.getParameter("regi_name");
		String password=request.getParameter("regi_pass");
		String fullName=request.getParameter("fullName");
		String email=request.getParameter("email");
		String phno=request.getParameter("phno");
		String address=request.getParameter("address");

		BankDTO employee=new BankDTO();
		employee.setUserId(userId);
		employee.setUname(regi_name);
		employee.setPassword(password);
		employee.setFullName(fullName);
		employee.setEmail(email);
		employee.setPhno(phno);
		employee.setAddress(address);
		
		
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
				+ "        <tr ><td><label >User Info :  </label></td><td><input type=\"text\" name=\"info_user\"  class=\"info_text\" ></td></tr>\r\n"
				+ "        <tr ><td><label >Full Name : </label></td><td ><input type=\"text\"  name=\"info_pass\" class=\"info_text\"  ></td></tr>\r\n"
				+ "        <tr ><td><label >Phone Number :  </label></td><td><input type=\"text\" name=\"info_phone\"  class=\"info_text\" ></td></tr>\r\n"
				+ "        <tr ><td><label >Email :  </label></td><td><input type=\"text\" name=\"info_email\"  class=\"info_text\"  ></td></tr>\r\n"
				+ "          \r\n"
				+ "    </table> \r\n"
				+ "</div>\r\n"
				+ "<div>\r\n"
				+ "\r\n"
				+ "    <table>\r\n"
				+ "           \r\n"
				+ "        <tr ><td><label >Accounts :  </label></td><td><input type=\"radio\" name=\"account_info\"  class=\"info_text\" ></td></tr>\r\n"
				+ "        <tr ><td><label >IFSC Code :  </label></td><td><input type=\"text\" name=\"info_user\"  class=\"info_text\" ></td></tr>\r\n"
				+ "        <tr ><td><label >Account Type : </label></td><td ><input type=\"text\"  name=\"info_pass\" class=\"info_text\"  ></td></tr>\r\n"
				+ "        <tr ><td><label >Current Balance :  </label></td><td><input type=\"text\" name=\"info_phone\"  class=\"info_text\" ></td></tr>\r\n"
				+ "        <tr ><td><label >Last Transcation Date :  </label></td><td><input type=\"text\" name=\"info_email\"  class=\"info_text\"  ></td></tr>\r\n"
				+ "          \r\n"
				+ "    </table> \r\n"
				+ "\r\n"
				+ "    <table>\r\n"
				+ "           \r\n"
				+ "        <tr ><td><label >Accounts :  </label></td><td><input type=\"radio\" name=\"account_info\"  class=\"info_text\" ></td></tr>\r\n"
				+ "        <tr ><td><label >IFSC Code :  </label></td><td><input type=\"text\" name=\"info_user\"  class=\"info_text\" ></td></tr>\r\n"
				+ "        <tr ><td><label >Account Type : </label></td><td ><input type=\"text\"  name=\"info_pass\" class=\"info_text\"  ></td></tr>\r\n"
				+ "        <tr ><td><label >Current Balance :  </label></td><td><input type=\"text\" name=\"info_phone\"  class=\"info_text\" ></td></tr>\r\n"
				+ "        <tr ><td><label >Last Transcation Date :  </label></td><td><input type=\"text\" name=\"info_email\"  class=\"info_text\"  ></td></tr>\r\n"
				+ "          \r\n"
				+ "    </table> \r\n"
				+ "\r\n"
				+ "</div>\r\n"
				+ "    </div>\r\n"
				+ "</body>\r\n"
				+ "</html>";

		

		try {
	
			
			Class .forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
			String uname=request.getParameter("u_name");
			String upass= request.getParameter("u_pass");
			PreparedStatement ps=con.prepareStatement("select * from user_info where user_name=? and user_pass=?");
			ps.setString(1,uname);
			ps.setString(2,upass);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				response.getWriter().append(personal);
//				out.println("success");
				
			}
			else {
				out.println("login failed");

				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
				

	}
}






