<%@page import="com.model.TibetHouseModel"%>
<%@page import="com.dao.TibetHouseDao,java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%	
		List<TibetHouseModel> list;
		TibetHouseDao dao = new TibetHouseDao();
		String sku =request.getParameter("sku");
		list = dao.posList(sku);
		request.setAttribute("list",list); 
		TibetHouseModel u = new TibetHouseModel();
	%>
	<table id="poslist" border="1px" width=60%>
		<tr id="somerow">
			<th>SKU</th>
			<th>TITLE</th>
			<th>COST</th>
			<th id="readvalue">STATUS</th>
		</tr>
		<c:forEach items="${list}" var="u">
			<tr>
				<td>${u.getSku()}</td>
				<td>${u.getTitle()}</td>
				<td>Rs ${u.getCostprice()}</td>
				<td>${u.getStatus()}</td>
			</tr>
		</c:forEach>
	</table>

	<a href="Pay.jsp"><input type="button" value="Pay"></a>


</body>
</html>