package com.StudentDb.Controller;

import java.io.IOException;

import com.StudentDb.Model.DAOServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loginController")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public loginController() {
        super();

    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		DAOServiceImpl impl = new DAOServiceImpl();
		impl.ConnectDb();
		boolean status = impl.verifyInquiry(email, password);

		if(status) {
		RequestDispatcher rd = request.getRequestDispatcher("/webapp/WEB-INF/login.jsp");
		rd.forward(request, response);
		}
		request.setAttribute("error", "invalidCredentials");
		RequestDispatcher rd = request.getRequestDispatcher("/webapp/login.jsp");
		rd.forward(request, response);
	}

}
