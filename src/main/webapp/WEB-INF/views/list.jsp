
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Users</title>
<!--<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous"> -->
</head>
<body>
	<div class="container">
		<h1>Users of Coffee</h1>
		<table class="table">
			<thead>
				<tr>
					<th>User</th><th>First Name</th><th>Last Name</th><th>Social Security</th><th>Shoe Size</th><th>Roast</th><th>MyOwn</th>
				</tr>
			</thead>
				<tbody>
				<c:forEach var="users" items="${items.name}">
				<tr>
					<td><a href="/rooms/${classroom.id}">${classroom.name}</a></td>
					<td>${classroom.capacity}</td>
					<td>${classroom.available ? "Yes" : "No" }</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		
	</div>
</body>
</html>