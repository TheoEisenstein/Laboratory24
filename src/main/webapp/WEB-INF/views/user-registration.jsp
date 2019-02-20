<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
<link rel="stylesheet" href="/style.css"
/>
</head>
<body>
	
	<form action="/user-registration-result" method="post">
		<table>
		
		<!-- Add four data per row possibly -->
		<tr>
			<td><label for="firstName">First Name:</label> <input type="text" pattern="[A-Z][a-z]*" name="firstName" id="firstName" required>
			</td>
			<td>
			<label for="lastName">Last Name:</label> <input type="text" name="lastName" pattern="[A-Z][a-z]*" id="lastName">
			</td>
		</tr>
		
		
		<tr>
		<td>
			<label for="socialSecurity">SSN#:</label> <input type="password" name="socialSecurity" id="socialSecurity">
		</td>
		<td>
			<label for="shoeSize">Shoe Size: </label> <input type="number" name="shoeSize" id="shoeSize">
			</td>
			
		</tr>
	
	
	</table>
	
	<fieldset>
  <legend>Coffee Profile</legend>
  Coffee Type <input type="radio" name="roast" value="Light" value="Medium" value="Hard" >Light<br>
 <input type="radio" name="roast" value="Medium" value="Hard" >  Medium<br>
 <input type="radio" name="roast" value="Hard" > Hard <br>

  Did you bring your own cup? <br> <input type="radio" name="myOwn" value="Kill The Environment"> My Own<br>
  <input type="radio" name="myOwn" value="Kill Environment"> Kill Environment<br>
 </fieldset>
 
	<button>Submit</button>
	</form>
	
</body>
</html>