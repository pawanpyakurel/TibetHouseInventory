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
	<a href="login.jsp">POS System Is Here</a>
	<h2>Totals</h2>
	<%	
		TibetHouseDao dao = new TibetHouseDao();
		int totalcount = dao.getInventoryCount();
		request.setAttribute("totalcount",totalcount); 
		long totalCostPrice = dao.getTotalCostPrice();
		request.setAttribute("totalCostPrice", totalCostPrice);
		long totalSellingPrice = dao.getTotalSellingPrice();
		request.setAttribute("totalSellingPrice", totalSellingPrice);
		int totalSoldQuantity = dao.getSoldQuantity();
		request.setAttribute("totalSoldQuantity", totalSoldQuantity);
	%>
	<table border="1px" width="60%">
		<tr>
			<th>Total Count</th>
			<td>${totalcount}</td>
		</tr>
		<tr>
			<th>Total Cost Price</th>
			<td>${totalCostPrice}</td>
		</tr>
		<tr>
			<th>Total Selling Price</th>
			<td>${totalSellingPrice}</td>
		</tr>
		<tr>
			<th>Total Sold Quantity</th>
			<td>${totalSoldQuantity}</td>
		</tr>
	</table>
	<br>
	<script type="text/javascript">
		function monthTest() {
			var x = document.getElementById('month').value;
			if (isNaN(x) || x < 1 || x > 12) {
				alert("Enter a valid month number");
				return false;
			}
			else {
				return true;
			}
		}
		function yearTest() {
			var x = document.getElementById('year').value;
			if (isNaN(x) || x < 2017 || x > 2022) {
				alert("Data not found of this year");
				return false;
			}
			else {
				return true;
			}
		}
		
	</script>
	<div>
		<table width="350" border="0" cellpadding="0" cellspacing="1"
			bgcolor="#CCCCCC">
			<tr>
				<form name="year" action="Year.jsp" method="post"
					onsubmit="return yearTest()">
					<td>
						<table width="100%" border="0" cellpadding="3" cellspacing="1"
							bgcolor="#FFFFFF">
							<tr>
								<td colspan="3"><strong>Statement</strong></td>
							</tr>
							<td>Year : <input type="number" name="year" id="year"
								placeholder="Enter a year"> <input type="submit"
								onclick="yearTest()">
							</td>
							</tr>
							<tr>
								</form>
								<td>
									<form name="month" action="Month.jsp?page=1" method="post"
										onsubmit="return monthTest()">
										Month : <input type="number" name="month" id="month"
											placeholder="Enter a month"> <input type="submit"
											onclick="monthTest()">
								</td>
							</tr>
							</td>
							</form>
							<td>
								<form name="day" action="Day.jsp" method="post">
									Day : <input type="text" name="day" id="day"
										placeholder="Enter a date"> <input type="submit">
							</td>
							</form>
							</tr>
						</table>
		</table>
	</div>
	<h3>Update Out of Stock</h3>
	<form action="OutOfStock.jsp" method="post">
		SKU : <input type="text" name="sku" id="sku"> <input
			type="submit" name="update" value="Update">
	</form>

	<%
		List<TibetHouseModel> list;
		list = dao.getData();
		request.setAttribute("list",list); 
	%>

	<h2>Items</h2>
	<table border="1px" width="60%">
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