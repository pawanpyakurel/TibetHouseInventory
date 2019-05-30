<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="com.model.TibetHouseModel,com.dao.TibetHouseDao,java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		String date =request.getParameter("day");
		list = dao.getDataByDay(date);
		request.setAttribute("list",list); 
	%>


	<table border="1px" width=60%>
		<tr>
			<th>Title</th>
			<th>SKU</th>
			<th>Cost Price</th>
		</tr>
		<c:forEach items="${list}" var="u">
			<tr>
				<td>${u.getTitle()}</td>
				<td>${u.getSku()}</td>
				<td>${u.getCostprice()}</td>
		</c:forEach>
	</table>

</body>
</html>