<!DOCTYPE html>
<!---------------------------------------------------------------------------- 
// list_08_27 : request.getAttributeの追加
------------------------------------------------------------------------------>
<%@page import="java.util.List" %>
<%@page import="jp.tuyano.spring.domain.model.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<!---------------------------------------------------------------------------->
<head>
<meta charset="utf-8">
<title>Welcome</title>
</head> 
<!---------------------------------------------------------------------------->
<body>
<h1>JPA Sample</h1>

<h2>認証成功！</h2>

<%-- 編集はいったん置いておく
<p><%= request.getAttribute("msg") %></p>
<table>
  <form method="post" action="person">
    <tr><td>Name:</td><td><input type="text" name="name" value="<%= request.getAttribute("name") %>"></td></tr>
    <tr><td>Mail:</td><td><input type="text" name="mail" value="<%= request.getAttribute("mail") %>"></td></tr>
    <tr><td>Age :</td><td><input type="text" name="age" value="<%= request.getAttribute("age") %>"></td></tr>
    <tr><td></td><td><input type="submit" value="追加"></td></tr>
  </form>
</table>
<hr>
<h2>MyPersonData</h2>
<ol>
  <% for(Object entity : (List) request.getAttribute("mypersondata")){ %>
  <li><%=entity %></li>
  <% } %>
</ol>
<hr>
<h2>Room</h2>
<ol>
  <% for(Room r : (List<Room>) request.getAttribute("room")){ %>
  <li> id : <%=r.getRoom_id() %>, name : <%=r.getRoom_name() %>, capacity : <%=r.getCapacity()%></li>
  <% } %>
</ol>
<br>
 --%>

</body>
<!---------------------------------------------------------------------------->
</html>
