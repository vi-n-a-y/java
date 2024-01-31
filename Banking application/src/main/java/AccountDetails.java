

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

@WebServlet("/AccDet")
public class AccountDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  BankDAO AccountDao=new BankDAO();

	  AccountDTO AccountDto = new AccountDTO();

    public AccountDetails() {
        super();
    
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		String accNmbr=request.getParameter("acc_nmbr");
		String accBankName =request.getParameter("acc_bank_name");
		String accIfsc=request.getParameter("acc_ifsc");
		String accType=request.getParameter("acc_type");
		double accBal=Double.parseDouble(request.getParameter("acc_bal"));
		HttpSession session = request.getSession();
		BankDTO user = (BankDTO) session.getAttribute("user");
		int id=user.getUserId();
		AccountDto.setAccountNumber(accNmbr);
		AccountDto.setBankName(accBankName);
		AccountDto.setIfscCode(accIfsc);
		AccountDto.setAcctType(accType);
		AccountDto.setCurrBalance(accBal);
		AccountDto.setUserId(id);
		
		try {if(id>0) {
			if(AccountDao.setAccDetails(AccountDto)!=0) {
				rd.forward(request, response);
			}
			
		}
		else {
			response.sendRedirect("bank.jsp");
		}
				
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}	
	}

}
