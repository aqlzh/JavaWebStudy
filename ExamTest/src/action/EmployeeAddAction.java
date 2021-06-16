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

public class EmployeeAddAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String userid = request.getParameter("userid");
			String password = request.getParameter("password");
			String name = request.getParameter("name");
			String a = request.getParameter("age");
			int age = 0;
			try {
				age = Integer.parseInt(a);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			if (userid == null || userid.trim().length() == 0) {
				response.sendRedirect("add.jsp");
				return;
			}
			if (password == null || password.trim().length() == 0) {
				response.sendRedirect("add.jsp");
				return;
			}
			if (name == null || userid.trim().length() == 0) {
				response.sendRedirect("add.jsp");
				return;
			}
			if (a == null || password.trim().length() == 0) {
				response.sendRedirect("add.jsp");
				return;
			}
			IEmployee emp = BusinessFactory.createEmployee();
			emp.add(userid, password, name, age);
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
