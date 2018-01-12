<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--... --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン画面</title>
</head>
<body>
<div id="wrapper">
  <h3>ログインフォーム</h3>
  <c:if test="${param.containsKey('error')}">
    <span style="color: red;">
      <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"/>
    </span>
  </c:if>
  <c:url var="loginUrl" value="/login"/> 
  <form:form action="${loginUrl}" method="post">
    <!-- hidden項目としてCSRFトークン値を埋め込む -->
    <sec:csrfInput />
    <!-- HTMLのmeta要素としてCSRFトークンの情報を出力 -->
    <sec:csrfMetaTags />
    <table>
      <tr>
        <td><label for="username">ユーザー名</label></td>
        <td><input type="text" id="username" name="username"></td>
      </tr>
      <tr>
        <td><label for="password">パスワード</label></td>
        <td><input type="password" id="password" name="password"></td>
      </tr>
      <tr>
        <td>&nbsp;</td>
        <td><button>ログイン</button></td>
      </tr>
    </table>
  </form:form>
</div>
</body>
</html>