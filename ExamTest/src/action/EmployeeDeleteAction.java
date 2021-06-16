package action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.IEmployee;
import business.factory.BusinessFactory;
import value.EmployeeValue;

public class EmployeeDeleteAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String userid = request.getParameter("userid");
			IEmployee emp = BusinessFactory.createEmployee();
			emp.delete(userid);
			System.out.println(userid);
			List<EmployeeValue> empList = emp.getList();
			request.setAttribute("empList", empList);
			RequestDispatcher rd = request.getRequestDispatcher("Employeemain.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			String mess = e.getMessage();
			response.sendRedirect("../error.jsp?mess=" + mess);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	@Override
	public void init() throws ServletException {
	}

}
