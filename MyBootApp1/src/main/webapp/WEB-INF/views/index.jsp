<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>Index Page</h1>
  <p>this is sample page for Spring Boot!</p>
  <p>${msg}</p>
  <form method="post" action="/post">
    <input type="text" name="title"><br>
    <textarea name="content"></textarea>><br>
    <input type="submit"><br>
  </form>
</body>
</html>