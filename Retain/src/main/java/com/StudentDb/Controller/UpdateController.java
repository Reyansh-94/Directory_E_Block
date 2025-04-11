package com.StudentDb.Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;

import com.StudentDb.Model.DAOServiceImpl;

@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UpdateController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	     String email = request.getParameter("email");
	     String mobile = request.getParameter("mobile");
	     
	     request.setAttribute("email", email);
	     request.setAttribute("mobile", mobile);
	     
	     RequestDispatcher rd = request.getRequestDispatcher("/views/updateInquiry.jsp");
	     rd.forward(request, response);
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String email = request.getParameter("email");
	     String mobile = request.getParameter("mobile");
	     
	    DAOServiceImpl service = new DAOServiceImpl();
	     service.ConnectDb();
	     service.updateInquiry(email, mobile);
	     ResultSet result = service.showData();
			request.setAttribute("result", result);
			RequestDispatcher rd = request.getRequestDispatcher("webapp/WEF-INF/views/list_inquiry.jsp");
			rd.forward(request, response);
}
}