import com.vin.userdao.UserDao;
import com.vin.userdto.UserDto;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Home() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");

		HttpSession session = request.getSession();

		String username = request.getParameter("user_name");
		String password = request.getParameter("user_pass");
		UserDao dao = new UserDao();
		UserDto dto = dao.getUserDetails(username);

		if (dto != null) {
			System.out.println(dto.getPassword());
			if (dto.getPassword().equals(password)) {
				session.setAttribute("user", dto);
				rd.forward(request, response);
			} else {
				throw new RuntimeException("Incorrect password for the UserName!");
			}
		} else {
			throw new RuntimeException("Incorrect Credintials");
		}

	}

}
