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

@WebServlet("/deleteController")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeleteController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String emailId = request.getParameter("email");
		DAOServiceImpl service = new DAOServiceImpl();
	    service.ConnectDb();
	    service.deleteInquiry(emailId);
	    
		ResultSet result = service.showData();
		request.setAttribute("result", result);
	    RequestDispatcher rd =  request.getRequestDispatcher("/webapp/WEB-INF/list_inquiry.jsp");
	    rd.forward(request, response);
	}

}
