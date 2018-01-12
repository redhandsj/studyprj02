<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<body>
<h2>welcome !</h2>
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
  <br><br>
  account ： ${accountId}
  <br><br>
<form:form modelAttribute="welcomeForm" action="../welcome" >
<!-- ============================================================= -->
  <br><br>
<%--
  <spring:eval expression="@hobbyCodeList" var="hobbyCodeList"/>
  趣味：<form:checkboxes path="hobbies" items="${hobbyCodeList}" />
  利用規約：<form:checkbox path="agreement" label="同意する" />
  
  性別：<form:radiobutton path="gender" value="men" label="男性" />      
        <form:radiobutton path="gender" value="women" label="女性" />

  // セレクトボックス用       
  <spring:eval expression="@prefectureCodeList" var="prefectureCodeList"/>
  お住まい：<form:select path="livingPrefecture" items="${prefectureCodeList}"/>
 
--%>
  <spring:message code="title.home"/>
  <br><br>
  <spring:message code="guidance.passwordValidPolicy" arguments="90"/>
  <br><br>
  <spring:message code="guidance.passwordValidPolicy">
    <spring:argument>
      <spring:eval expression="@appSettings.passwordValidDays"/>
    </spring:argument>
  </spring:message>
<!-- ============================================================= -->
  <form:errors path="*"/>
  <br><br><br>

  <form:errors path="name" /><br>
  <span>名前</span><form:input path="name" />
  <br><br>

  <form:errors path="tel" /><br>
  <span>TEL</span><form:input path="tel" />
  <br><br>

  <form:errors path="dateOfBirth" /><br>
  <span>誕生日</span><form:input path="dateOfBirth" type="date" />
  <br><br>

  <form:errors path="email" /><br>
  <span>E-Mail</span><form:input path="email" type="email" />
  <br><br> 

  <!-- account -->
  <form:errors path="account.name" /><br>
  <span>名前</span><form:input path="account.name" />
  <br><br>

  <form:errors path="account.email" /><br>
  <span>E-Mail</span><form:input path="account.email" />
  <br><br>

  <!-- card -->
  <form:errors path="card.no" /><br>
  <span>番号</span><form:input path="card.no" />
  <br><br>

  <form:errors path="card.validMonth" /><br>
  <span>期限</span><form:input path="card.validMonth"/>
  <br><br>

  <%--
  <!-- card -->
  <span>番号1</span><form:input path="card[0].no" /><br>
  <span>期限1</span><form:input path="card[0].validMonth"/><br><br>
  <!-- card -->
  <span>番号2</span><form:input path="card[1].no" /><br>
  <span>期限2</span><form:input path="card[1].validMonth"/><br><br>

  <!-- 会員ラジオ -->
  <form:radiobutton path="type" label="無料会員" value="1" /><br>
  <form:radiobutton path="type" label="有料会員" value="2" /><br>
   --%>

  <!-- POST -->
  <input type="submit" name="kakunin" value="確認" /><br>
  <input type="submit" name="confirm" value="ラジオボタン実験" /><br>
  
</form:form>
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
