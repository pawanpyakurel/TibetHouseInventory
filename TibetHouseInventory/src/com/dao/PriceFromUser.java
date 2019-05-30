/*package com.dao;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

*//**
 * Servlet implementation class PriceFromUser
 *//*
@WebServlet("/PriceFromUser")
public class PriceFromUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sku = request.getParameter("sku");
	    String price = request.getParameter("price");
		String stockstatus = request.getParameter("stockstatus");
		TibetHouseDao dao = new TibetHouseDao();
		try {
			int rs = dao.updateSKU(sku);
			double rsa = dao.updateSKU(price);
			int rsb = dao.updateSKU(stockstatus);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("PosList.jsp");
		doGet(request, response);
	}

}
*/