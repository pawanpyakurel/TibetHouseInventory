package ucom.userlogin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserLoginValidate")
public class Loginservlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String uname = request.getParameter("Uname");
	String pass = request.getParameter("password");
	
	if (uname.equals("Bhumika") && pass.equals("Regmi"))
	{
	response.sendRedirect("POs/pos.jsp");
	}
	else if(uname.equals("Sales") && pass.equals("Sales")) {
		response.sendRedirect("POs/pos.jsp");
	}
	else {
		response.sendRedirect("POs/login.jsp");	
	}
}
}