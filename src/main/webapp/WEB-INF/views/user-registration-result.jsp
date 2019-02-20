<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/style.css"/>
</head>
<body>

	<p> Welcome! 
	${ users.firstName }
	${ users.lastName }
	</p>
	
	<p>This is where your social security number would be...
	<!--  ${ users.socialSecurity }-->
	</p>
	<p> Shoe size: 
	${ users.shoeSize }
	</p>
	<p>Roast Type: ${ users.roast }
	</p>
	<p>Do you have your cup? ${ users.myOwn }
	
	</p>

</body>
</html>