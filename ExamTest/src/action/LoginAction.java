package action;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.factory.ConnectionFactory;

public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String driverName = null;
	String url = null;

	@Override
	public void init(ServletConfig config) throws ServletException {
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userid = request.getParameter("uesrid");
		String password = request.getParameter("password");
		if (userid == null || userid.trim().length() == 0) {
			response.sendRedirect("login.jsp");
			return;
		}
		if (password == null || password.trim().length() == 0) {
			response.sendRedirect("login.jsp");
			return;
		}
		HttpSession session = request.getSession();
		String sql = "select * from EMPLOYEE where EMPID=? and PASSWORD=?";
		Connection cn = null;
		boolean check = false;
		try {
			cn = ConnectionFactory.getConnection();
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1, userid);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				check = true;
			}
			rs.close();
			ps.close();
		} catch (Exception e) {
			response.sendRedirect("login.jsp");
			return;
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		if (check) {
			session.setAttribute("userid", userid);
			response.sendRedirect("employee/main.jsp");
			return;
		} else {
			session.setAttribute("loginMsg", "’À∫≈√‹¬Î¥ÌŒÛ£¨«Î÷ÿ–¬ ‰»Î!");
			response.sendRedirect("login.jsp");
			return;
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	@Override
	public void destroy() {
		super.destroy();
	}
}
