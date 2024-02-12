package com.vin.servlet;

import java.io.IOException;
import java.util.List;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vin.userdao.UserDao;
import com.vin.userdto.UserDto;





@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HomeServlet() {
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
//UserDto dto = dao.getUserDetails(username);

//if (dto != null) {
//		System.out.println(dto.getPassword());
//		if (dto.getPassword().equals(password)) {
//		session.setAttribute("user", dto);
//		rd.forward(request, response);
//		} else {
//			throw new RuntimeException("Incorrect password for the UserName!");
//		}
//} else {
//	throw new RuntimeException("Incorrect Credintials");
//}
UserDto newUser = new UserDto(username,password);
dao.saveUser(newUser);
response.sendRedirect("home.jsp");


	}

}
















