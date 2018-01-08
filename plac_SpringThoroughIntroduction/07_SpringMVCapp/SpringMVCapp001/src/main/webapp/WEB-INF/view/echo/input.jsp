<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>入力画面</h2>
<form:form modelAttribute="echoForm">
<div>テキストを入力してください：</div>
<div>
  <form:input path="text" /><br>
  <form:errors path="text" />
</div>
<div><form:button>送信</form:button></div>
<%--
属性のデフォルト
 - method属性は"post"
 - action属性は画面表示時のURLのアプリケーションのコンテキストパス以降の値
 --%>
</form:form>
</body>
</html>