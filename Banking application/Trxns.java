

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

//import com.vin.bankdto.BankDTO;
import com.vin.bankdto.AccountDTO;
import com.vin.bankdto.TransactionDTO;
import com.vin.bankdao.BankDAO;
@WebServlet("/trxns")

/**
 * Servlet implementation class Trxns
 */
public class Trxns extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Trxns() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TransactionDTO trn=new  TransactionDTO();
		BankDAO trnDao=new BankDAO();
		
		RequestDispatcher rd=request.getRequestDispatcher("SendMoney.jsp");
		HttpSession session=request.getSession();
//		BankDTO user = (BankDTO) session.getAttribute("user");
		AccountDTO data=(AccountDTO) session.getAttribute("data");
		
		

//		from_acc_no,to_acc_no,descr,amount_send,balance,user_id
		String toAccNmbr=request.getParameter("rec_acc");
		String toIfscCode=request.getParameter("rec_ifsc");
		String description=request.getParameter("description");
		double TotalAmountSend=Double.parseDouble(request.getParameter("total_amount"));
		int id=data.getUserId();
		trn.setFromAcc(data.getAccountNumber());
		trn.setToAcc(toAccNmbr);
		trn.setDescription(description);
		trn.setAmountSend(TotalAmountSend);
		trn.setBalance(data.getCurrBalance());
		trn.setUserId(id);
		
		
		trnDao.setTransactionDetails(id);
		if(id>0) {
			response.sendRedirect("Statement.jsp");
			
		}
		else {
			response.sendRedirect("home.jsp");
		}
	
		
	
	
	
	
	}

}
