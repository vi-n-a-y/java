
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.vin.bankdto.BankDTO;
import com.vin.bankdto.AccountDTO;
import com.vin.bankdto.TransactionDTO;
import com.vin.bankdao.BankDAO;

@WebServlet("/trxns")
public class Trxns extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Trxns() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		TransactionDTO trn = new TransactionDTO();
		BankDAO trnDao = new BankDAO();

		RequestDispatcher rd = request.getRequestDispatcher("/home.jsp");
		HttpSession session = request.getSession();
		BankDTO user = (BankDTO) session.getAttribute("user");
		AccountDTO data = (AccountDTO) session.getAttribute("data");

		String toAccNmbr = request.getParameter("rec_acc");
		String toIfscCode = request.getParameter("rec_ifsc");
		String description = request.getParameter("description");
		double totalAmountSend = Double.parseDouble(request.getParameter("total_amount"));
//		String myAcc=data.getAccountNumber();
		double curr_bal = data.getCurrBalance();
		if (curr_bal > totalAmountSend) {
			curr_bal = curr_bal - totalAmountSend;

		} else {
			System.out.println("not enough balance");

		}
		int id = user.getUserId();
		trn.setBalance(curr_bal);
		trn.setFromAcc(data.getAccountNumber());
		trn.setToAcc(toAccNmbr);
		trn.setDescription(description);
		trn.setAmountSend(totalAmountSend);

		trn.setUserId(id);
		System.out.println("trxns: " + data.getAccountNumber());
		System.out.println("trxns: " + data.getCurrBalance());
		if (trnDao.setTransactionDetails(trn) != 0) {
			trnDao.updateCurrBal(curr_bal, id);
			trnDao.updateCurrBalToRec(totalAmountSend, toAccNmbr);
			session.setAttribute("trn", trn);
			rd.forward(request, response);

		} else {

//			response.sendRedirect("home.jsp");
			throw new RuntimeException("no accound found");
		}
	}

}
