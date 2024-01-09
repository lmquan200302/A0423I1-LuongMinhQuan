<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 1/9/2024
  Time: 2:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Convert Money</h1>
<form action="/convert" method="post">
  <input type="text" name="vnd" placeholder="Nhap so tien VND">
  <select name="currency">
    <option value="usd">usd</option>
    <option value="won">won</option>
  </select>
  <input type="submit" value="Submit">
</form>
<p>Ket qua: ${ketqua}</p>

</body>
</html>
