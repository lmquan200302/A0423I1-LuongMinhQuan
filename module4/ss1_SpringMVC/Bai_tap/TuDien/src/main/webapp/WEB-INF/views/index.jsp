<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 1/10/2024
  Time: 4:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Tu dien don gian</h1>
<form action="/find" method="post">
    <input type="text" name="input" placeholder="Nhap...">
    <input type="submit" value="Submit!">
</form>
<p>Ket qua: ${ketqua}</p>
</body>
</html>
