package com.StudentDb.Controller;

import java.io.IOException;

import com.StudentDb.Model.DAOServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/createStudent")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AddController() {
        super();
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		DAOServiceImpl impl = new DAOServiceImpl();
        impl.ConnectDb();

          impl.createInquiry(name, email, mobile);
          request.setAttribute("message", "saved!");
          RequestDispatcher rd = request.getRequestDispatcher("/webapp/WEB-INF/createStudentDetais.jsp");
	      rd.forward(request, response);
	}
}
