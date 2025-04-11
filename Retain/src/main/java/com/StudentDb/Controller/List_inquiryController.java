package com.StudentDb.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;

import com.StudentDb.Model.DAOServiceImpl;

@WebServlet("/listInquiry")
public class List_inquiryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public List_inquiryController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
		DAOServiceImpl service = new DAOServiceImpl();
		service.ConnectDb();
		ResultSet result = service.showData();
	    request.setAttribute("result", result);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
