<!DOCTYPE html>
<%@page import="java.util.List" %>
<%@page import="jp.co.stylez.sepl2.team3a.atm.domain.mst.*" %>
<%@page import="jp.co.stylez.sepl2.team3a.atm.domain.trn.*" %>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<!---------------------------------------------------------------------------->
<head>
<meta charset="utf-8">
<title>Welcome</title>
</head> 
<!---------------------------------------------------------------------------->
<body>
<h1>ATM Sample JPA Test</h1>
<h2>m_user</h2>
<ol>
  <% for(User u : (List<User>) request.getAttribute("m_users")){ %>
  <li> id : <%=u.getUser_id()%> , name : <%=u.getUser_name()%>, password : <%=u.getPassword()%></li>
  <% } %>
</ol>
<br>
<h2>m_bank</h2>
<ol>
  <% for(Bank b : (List<Bank>) request.getAttribute("m_banks")){ %>
  <li> id : <%=b.getBank_id()%> , name : <%=b.getBank_name()%></li>
  <% } %>
</ol>
<br>
<h2>m_account</h2>
<ol>
  <% for(Account a : (List<Account>) request.getAttribute("m_accounts")){ %>
  <li> id : <%=a.getAccount_id()%> , user : <%=a.getUser_id() %>, bank : <%=a.getBank_id() %>, bal : <%=a.getBalance() %></li>
  <% } %>
</ol>

</body>
<!---------------------------------------------------------------------------->
</html>
