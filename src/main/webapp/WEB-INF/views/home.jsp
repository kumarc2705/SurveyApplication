<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="login" method="post">

Enter UserName <input type="text" name="name" ><br>
Enter Password <input type="password" name="password"><br>
<input type="submit" value="login">



</form>


<h1> Sign Up </h1>
<form action="signUp" method="post">
Enter Name <input type="text" name="name" ><br>
Enter Password <input type="password" name="password" ><br>
Enter Company <input type="text" name="company" ><br>
<input type="submit" value="Signup"><br>




</form>
${message}<br>


</body>
</html>