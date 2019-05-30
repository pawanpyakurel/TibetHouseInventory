/*package com.dao;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserPrice")
public class UserPrice {
	protected void dopost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		String sku = request.getParameter("sku");
	    String costprice = request.getParameter("costprice");
		String stockstatus = request.getParameter("stockstatus");
		TibetHouseDao dao = new TibetHouseDao();
		int rs = dao.updateSKU(sku);
		double rsa = dao.updateSKU(costprice);
		int rsb = dao.updateSKU(stockstatus);
		response.sendRedirect("PosList.jsp");
		
		dopost(request, response);
	}
}
*/