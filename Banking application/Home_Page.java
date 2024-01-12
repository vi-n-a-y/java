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


import java.io.PrintWriter;
@WebServlet("/home")
public class Home_Page extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		userId,uname,password,fullName,email,phno,address
		
//		int userId=Integer.parseInt(getParameter("userId"));
//		String uname=request.getParameter("uname");
//		String password=request.getParameter("password");
//		String fullName=request.getParameter("fullName");
//		String email=request.getParameter("email");
//		String phno=request.getParameter("phno");
//		String address=request.getParameter("address");
//		
//		BankDTO employee=new BankDTO();
//		employee.setUserId(userId);
//		employee.setUname(uname);
//		employee.setPassword(password);
//		employee.setFullName(fullName);
//		employee.setEmail(email);
//		employee.setPhno(phno);
//		employee.setAddress(address);
//		
//		registerEmployee(employee);
		
		
		PrintWriter out= response.getWriter();

		

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
				out.println("login success");
				
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





