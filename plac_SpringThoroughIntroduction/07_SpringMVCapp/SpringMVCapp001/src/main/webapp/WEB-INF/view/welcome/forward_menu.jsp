<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<body>
<h2>フォワードメニュー</h2>
ようこそ、「 <sec:authentication property="principal.username"/> 」
<!-- ============================================================= -->
<!-- hidden項目としてCSRFトークン値を埋め込む -->
<sec:csrfInput />
<!-- ============================================================= -->
<!-- HTMLのmeta要素としてCSRFトークンの情報を出力 -->
<sec:csrfMetaTags />
<!-- ============================================================= -->
</body>
</html>
