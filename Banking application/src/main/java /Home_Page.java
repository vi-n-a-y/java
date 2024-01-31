//import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import java.lang.*;
import java.util.ArrayList;
import java.util.List;

import com.vin.bankdto.AccountDTO;
import com.vin.bankdto.BankDTO;
import com.vin.bankdao.BankDAO;

import java.io.PrintWriter;
@WebServlet("/home")
public class Home_Page extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  BankDAO detailsDao=new BankDAO();
	  BankDTO details_dto =new BankDTO();  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		
			String user_name=request.getParameter("u_name");
			String user_pass= request.getParameter("u_pass");
			BankDTO  user=detailsDao.getUserDetails(user_name);
			if(user!=null) {			
				if (user.getPassword().equals(user_pass)) {
					session.setAttribute("user", user);
					int id=user.getUserId();	
					 System.out.println("sysout in Home_page java "+id);
//					 List<AccountDTO>  data=detailsDao.getAccDetails(id);
//							session.setAttribute("data", data);
							RequestDispatcher rd = request.getRequestDispatcher("/home.jsp");
							rd.forward(request, response);
							
							
				} 
				else {
					throw new RuntimeException("No Account found,Enter correct Crenditials to Login!");
	}
			}
		
		
}
	
}






