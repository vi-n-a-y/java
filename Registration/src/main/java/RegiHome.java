
import com.vin.regidao.RegiDao;
import com.vin.regidto.RegiDto;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/RegiHome")
public class RegiHome extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegiHome() {
        super();
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RegiDao dao= new RegiDao();
		RegiDto dto= new RegiDto();
		String username=request.getParameter("user_name");
		String firstname=request.getParameter("first_name");
		String lastname=request.getParameter("last_name");
		String phonenumber=request.getParameter("phone_number");
		String email=request.getParameter("email");
		dto.setUser_name(username);
		dto.setFirst_name(firstname);
		dto.setLast_name(lastname);
		dto.setPhone_number(phonenumber);
		dto.setEmail(email);
		
		if(dao.insertRegiDet(dto)!=0) {
			HttpSession session=request.getSession();
			session.setAttribute("user", dto);
			RequestDispatcher rd= request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
			
		}else {
			throw new RuntimeException("incorrect register details");
		}
		
		
	
	}

}




