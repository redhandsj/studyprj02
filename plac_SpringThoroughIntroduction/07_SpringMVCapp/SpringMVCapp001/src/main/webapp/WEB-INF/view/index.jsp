<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<%--
<spring:theme code="stylesheet" var="stylesheet"/>
<link rel="stylesheet" href="/resources/${stylesheet}">
 --%>
<body>
<h2>Hello World!</h2>
ようこそ、「 <sec:authentication property="principal.username"/> 」
<!-- ============================================================= -->
<sec:authorize access="hasRole('ADMIN')">
  <h2>管理者メニュー</h2>
</sec:authorize> 
<!-- ============================================================= -->
<!-- hidden項目としてCSRFトークン値を埋め込む -->
<sec:csrfInput />
<!-- ============================================================= -->
<!-- HTMLのmeta要素としてCSRFトークンの情報を出力 -->
<sec:csrfMetaTags />
<!-- ============================================================= -->
<ul>
  <!-- 
  「"/admin/accounts"と いうURLが割り振られているWebリソースにアクセス可能な場合は表示を許可する」
    というアクセスポリシーを定義
    Webリソースに以下のようなアクセスポリシーが定義されている場合は、"ROLE_ACCOUNT_MANA GER"という
    ロールを保持しているログインユーザーに対してのみ「アカウント管理」のリンクが表示
    .antMatchers("/admin/accounts/**").hasRole("ACCOUNT_MANAGER")
   -->
  <sec:authorize url="/admin/accounts">
    <li>
      <a href="<c:url value='/admin/accounts' />">アカウント管理</a>
    </li>
  </sec:authorize>
</ul>
</body>
</html>
