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


		PrintWriter pw= response.getWriter();

		
		


		HttpSession session = request.getSession();

	RequestDispatcher rd = request.getRequestDispatcher("/home.jsp");
			String user_name=request.getParameter("u_name");
			String user_pass= request.getParameter("u_pass");
			BankDTO  user=detailsDao.getUserDetails(user_name);

			

			if(user!=null) {
				
				if (user.getPassword().equals(user_pass)) {
					session.setAttribute("user", user);
//					rd.forward(request, response);
					int id=user.getUserId();
					
					 System.out.println(id);
					 AccountDTO  data=detailsDao.getAccDetails(id);
//					 if(data!=null) {
							session.setAttribute("data", data);
							rd.forward(request, response);
				}
			}
			else {
				response.sendRedirect("addMoney.jsp");
			
			}
				

				 
				
				
			
			
	

		
		
}
	
}






