

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import com.vin.bankdao.BankDAO;
import com.vin.bankdto.BankDTO;

@WebServlet("/add")

public class AddMoney extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AddMoney() {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();	
		BankDAO addDao = new  BankDAO();
		BankDTO user = new  BankDTO();
		
		user=(BankDTO) session.getAttribute("user");
		int id=user.getUserId();
		System.out.println(id);
		
		
		double amount=Double.parseDouble(request.getParameter("add_amt"));
		
		addDao.updateCurrBal(amount, id);
		System.out.println(addDao);
		if(addDao!=null) {
			response.sendRedirect("Statement.jsp");
		}
		else {
			response.sendRedirect("bank.jsp");
		}
		
		
		
		
		
		
		
	}

}
