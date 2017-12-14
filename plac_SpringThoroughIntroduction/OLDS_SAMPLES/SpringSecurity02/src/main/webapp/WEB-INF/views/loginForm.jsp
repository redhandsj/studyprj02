<!DOCTYPE html>
<!---------------------------------------------------------------------------->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!---------------------------------------------------------------------------->
<html>
<head>
<meta charset="utf-8">
<title>Welcome</title>
</head> 
<!---------------------------------------------------------------------------->
<body>
<div id="wrapper">
  <h2>ログインフォーム</h2>
  <c:if test="${param.containsKey('error') }">
    <span>
      <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"/>
    </span>
  </c:if>
  <form:form action="/SpringSecurity02/authentication" method="post">
    <table>
      <tr>
        <td><label for="username">ユーザ名</label></td>
        <td><input type="text" id="username" name="username"></td>
      </tr>
      <tr>
        <td><label for="password">パスワード</label></td>
        <td><input type="password" id="password" name="password"></td>
      </tr>
      <!-- CSRF対策が入っているため入れる。 -->
      <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
      <tr>
        <td>&nbsp;</td>
        <td><button>ログイン</button></td>
      </tr>
    </table>
  </form:form>
</div>
</body>
<!---------------------------------------------------------------------------->
</html>
