<%@page import="java.util.ArrayList"%>
<%@page import="xuhao.com.domin.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <table>
    <tr><th>姓名</th><th>年龄</th><th>住址</th></tr>
	<%
		List<User> users = (ArrayList) session.getAttribute("users");
		for (int i = 0; i < users.size(); i++){
			User u=users.get(i);
	%>
	<tr>
		<td><%=u.getName() %></td>
		<td><%=u.getAge() %></td>
		<td><%=u.getAddress() %></td>
	</tr>
	<%} %>
	</table>
</body>
</html>