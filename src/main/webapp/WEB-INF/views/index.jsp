<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
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
	<datalist id="datalist-1">
		<option value="Value1">Option1</option>
		<option value="Value2">Option2</option>
		<option value="Value3">Option3</option>
	</datalist>
	<form id="form-1">
		<table style="width: 100%" cellpadding="0" cellspacing="0" border="1px solid #f2f2f2">
			<tr>
				<td>
					<spring:message code="user.username"/>
				</td>
				<td>
					<input name="username" id="username" />
				</td>
				<td>
					<spring:message code="user.password"/>
				</td>
				<td>
					<input type="password" name="password" id="password" />
				</td>
			</tr>
			<tr>
				<td>
					<spring:message code="user.email"/>
				</td>
				<td>
					<input name="email" id="email" />
				</td>
				<td>
					<spring:message code="user.sex"/>
				</td>
				<td>
					<input type="text" name="sex" id="sex" />
				</td>
			</tr>
		</table>
	</form>
	<ol data-role="listview" id="listview-1" data-inset="true">
		<li><a href="item1.html">Item 1</a></li>
		<li><a href="item2.html">Item 2</a></li>
		<li><a href="item3.html">Item 3</a></li>
	</ol>
	<table id="table-1">
		<caption>测试table</caption>
		<thead>
			<tr>
				<th>A</th>
				<th>B</th>
				<th>C</th>
				<th>D</th>
				<th>E</th>
				<th>F</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>a</td>
				<td>b</td>
				<td>c</td>
				<td>d</td>
				<td>e</td>
				<td>f</td>
			</tr>
		</tbody>
	</table>
	<menu id="menu-1" label="My menu" type="toolbar">
		<menuitem type="command" label="Item 0"/>
		<menuitem type="command" label="Item 1"/>
		<menuitem type="command" label="Item 2"/>
		<menuitem type="command" label="Item 3"/>
		<menuitem type="command" label="Item 4"/>
	</menu>
</body>
</html>