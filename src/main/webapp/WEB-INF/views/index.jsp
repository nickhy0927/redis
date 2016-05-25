<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
	<script src="http://code.jquery.com/jquery-2.1.3.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<form id="form-1">
		<table style="width: 100%" cellpadding="0" cellspacing="0" border="1px solid #f2f2f2">
			<tr>
				<td>
					${username}
				</td>
				<td>
					<input name="username" id="username" />
				</td>
				<td>
					<fmt:message key="platform.user.password"/>
				</td>
				<td>
					<input type="password" name="password" id="password" />
				</td>
			</tr>
			<tr>
				<td>
					<fmt:message key="platform.user.email"/>
				</td>
				<td>
					<input name="email" id="email" />
				</td>
				<td>
					<fmt:requestEncoding value="UTF-8"/>
					<fmt:message key="platform.user.sex"/>
				</td>
				<td>
					<input type="text" name="sex" id="sex" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>