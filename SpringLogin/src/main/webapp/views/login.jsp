<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form  action="loginProcess"
		method="post">
	

		<table align="center">

			<tr>

				<td>UserName:</td>

				<td><input type="text" name="username" />

				</td>

			</tr>

			<tr>

				<td>Password</td>

				<td><input type="password" name="password" />
				</td>

			</tr>

			<tr>

				<td></td>

				<td align="left"><button id="login" name="login">Login</button>

				</td>

			</tr>

			<tr></tr>

			<tr>

				<td></td>

				<td><a href="home.jsp">Home</a></td>

			</tr>

		</table>

	</form>

	<table align="center">

		<tr>

			<td style="font-style: italic; color: red;">${message}</td>

		</tr>

	</table>
<!-- 	UserName:<input type="text" name="name"/><br>
	Password:<input type="password" name="password"/><br>
	<input type="submit" value="Submit"/>
	<a href="home.jsp">Home</a>
	</form> -->
</body>
</html>