<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Cafe Encapsulation</title>

<link rel="stylesheet" href="/style.css" />
</head>
<body>
<h1>A very weak implementation of CSS.</h1>
<a href="/user-registration"> Register Now!</a>
<a href="/list"> Coffee Users</a>

<div class=“container”>
        <h1>Items</h1>
        <table class=“table”>
            <thead>
                <tr>
                    <th>Name</th><th>Description</th><th>Quantity</th><th>Price</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var=“items” items=“${items}“>
                <tr>
                    <td><a href =“/”></a> ${items.name}</td>
                    <td>${items.description}</td>
                    <td>${items.quantity}</td>
                    <td>${items.price}</td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
        
    </div>



</body>
</html>