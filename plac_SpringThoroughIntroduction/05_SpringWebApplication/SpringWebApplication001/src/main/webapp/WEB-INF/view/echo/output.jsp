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
<h2>出力画面</h2>
<div>入力したテキストは...：</div>
<%--
TODO c:out は XSS 攻撃に備えたもの
 --%>
<div>「<span><c:out value="${echoForm.text}"/></span>」</div>
<div>です。</div>

<div><a href="<c:url value='/' />">トップ画面へ戻る</a></div>

</body>
</html>