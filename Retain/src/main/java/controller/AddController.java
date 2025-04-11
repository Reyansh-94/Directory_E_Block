package controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Add;

@WebServlet("/addController")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AddController() {

    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));

		Add obj = new Add();
		int result = obj.add(num1, num2);
		request.setAttribute("result", result);
		RequestDispatcher  rd = request.getRequestDispatcher("manu.jsp");
		rd.forward(request, response);
	}

}
