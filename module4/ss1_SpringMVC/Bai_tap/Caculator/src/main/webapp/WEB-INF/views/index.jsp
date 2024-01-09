<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 1/9/2024
  Time: 11:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Caculator</h1>
<form action="/calculator" method="post">
    <input name="num1" placeholder="Nhap so thu nhat">
    <select name="operation">
        <option value="cong">(+)</option>
        <option value="tru">(-)</option>
        <option value="nhan">(X)</option>
        <option value="chia">(/)</option>
    </select>
    <input name="num2" placeholder="Nhap so thu hai">
    <input type="submit" value="Submit">
</form>
<h2>Ket qua</h2>
<p>${ketqua}</p>

</body>
</html>
