<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style class="text/text">
		h1{
			color:purple;
		}
		h3{
			color:blue;
		}
		input[type="submit"] {
			background-color: green;
			color: white;
		}
		.btn1{
			background-color:blue;
			color:white;
		}
		.l1{
		 	color:red;
		}
	</style>
</head>
<body>
	<div align="center">
	<h1>Pentagon Space</h1>
	<h3>Reset your Password here</h3>
	<form action="forgot" method="post">
		<%if(request.getAttribute("error")!=null){ %>
		<h3 class="l1"><%=request.getAttribute("error")%></h3>
		<%}%>
	<table>
		<tr>
			<td><b>Enter Phone Number:</b></td>
			<td><input type="tel" name="phone"></td>
		</tr>
		<tr>
			<td><br></td>
			<td><br></td>
		</tr>
		<tr>
			<td><b>Enter Email Id:</b></td>
			<td><input type="email" name="mail"></td>
		</tr>
		<tr>
			<td><br></td>
			<td><br></td>
		</tr>
		<tr>
			<td><b>Set new password:</b></td>
			<td><input type="password" name="password"></td>
		</tr>
		<tr>
			<td><br></td>
			<td><br></td>
		</tr>
		<tr>
			<td><b>Confirm password:</b></td>
			<td><input type="password" name="confirm"></td>
		</tr>
		<tr>
			<td><br></td>
			<td><br></td>
		</tr>
		<tr>
			<td><input class="btn" type="submit" value="Reset Password"></td>
			<td align="right"><a class="btn1" href="Login.jsp">Back</a></td>
		</tr>
	</table>
	</form>
	</div>
</body>
</html>