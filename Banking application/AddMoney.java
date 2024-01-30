

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import com.vin.bankdao.BankDAO;
import com.vin.bankdto.AccountDTO;
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
		AccountDTO data = new AccountDTO();
		
		user=(BankDTO) session.getAttribute("user");
		data=(AccountDTO) session.getAttribute("data");
		int id=user.getUserId();
		int us_id=data.getId();
		double bal=data.getCurrBalance();
		double amount=Double.parseDouble(request.getParameter("add_amt"));
			bal=bal+amount;
			System.out.println(id);
				System.out.println("account dto id is :"+us_id);

		addDao.updateCurrBal(bal, id);
		System.out.println(addDao);
		if(addDao!=null) {
			RequestDispatcher rd = request.getRequestDispatcher("/home.jsp");
			rd.forward(request, response);
		}
		else {
			response.sendRedirect("bank.jsp");
		}
		
		
		
		
		
		
		
	}

}
