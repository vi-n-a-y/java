

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.vin.bankdao.BankDAO;
import com.vin.bankdto.BankDTO;

@WebServlet("/regi")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Registration() {
        super();

    }
    BankDAO detailsDao=new BankDAO();

//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String uname=request.getParameter("regi_name");
		String password=request.getParameter("regi_pass");
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

			e.printStackTrace();
		}
		
		
		doGet(request, response);
	}

}
