<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<body>
<h2>ファイルアップ</h2>
ようこそ、「 <sec:authentication property="principal.username"/> 」
<br>

<form:form modelAttribute="fileUploadForm" enctype="multipart/form-data" >
  ファイル : <form:input path="file" type="file" /><br>
  <input type="submit" name="upload" value="アップロード" /><br>
  
</form:form>
<!-- ============================================================= -->
</body>
</html>
