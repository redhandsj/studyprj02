<!DOCTYPE html>
<%@page import="java.util.List" %>
<%@page import="jp.tuyano.spring.data1.MyPersonData" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
	<meta charset="utf-8">
	<title>Welcome</title>
</head> 
<body>
	<h1>JPA Sample</h1>
	<table>
	<form method="post" action="person">
	<tr><td>Name:</td><td><input type="text" name="name"></td></tr>
	<tr><td>Mail:</td><td><input type="text" name="mail"></td></tr>
	<tr><td>Age :</td><td><input type="text" name="age"></td></tr>
	<tr><td></td><td><input type="submit" value="追加"></td></tr>
	</form>
	</table>
	<hr>
	<ol>
	<% for(Object entity : (List) request.getAttribute("entities")){ %>
	<li><%=entity %></li>
	<% } %>
	</ol>
</body>
</html>
