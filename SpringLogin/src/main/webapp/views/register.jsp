<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="registerProcess" method="post">

		<table align="center">

			<tr>
				<td>UserName:</td>
				<td><input type="text" name="username" /></td>

			</tr>

			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" /></td>

			</tr>

			<tr>
				<td>FirstName:</td>
				<td><input type="text" name="firstname" /></td>

			</tr>

			<tr>
				<td>LastName:</td>
				<td><input type="text" name="lastname" /></td>

			</tr>

			<tr>
				<td>Email:</td>
				<td><input type="email" name="email" /></td>

			</tr>

			<tr>
				<td>address:</td>
				<td><input type="text" name="address" /></td>

			</tr>

			<tr>
				<td>MobileNo:</td>
				<td><input type="number" name="phone" /></td>

			</tr>

			<tr>

				<td></td>

				<td>

					<button id="register" name="register">Register</button>

				</td>

			</tr>

			<tr></tr>

			<tr>

				<td></td>

				<td><a href="home.jsp">Home</a></td>

			</tr>

		</table>

	</form>
</body>
</html>