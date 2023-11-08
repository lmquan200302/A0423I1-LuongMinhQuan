<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 11/7/2023
  Time: 11:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Them san pham moi</h1>
<form method="post">
<table>
  <tr>
    <th>ID</th>
    <td><input type="text" name="id" id="id" placeholder="Nhap id san pham"></td>
  </tr>
  <tr>
    <th>Ten san pham</th>
    <td><input type="text" name="name" id="name" placeholder="Nhap ten san pham "></td>
  </tr>
  <tr>
    <th>Quoc gia</th>
    <td><input type="text" name="made" id="made" placeholder="Nhap quoc gia"></td>
  </tr>
  <tr>
    <th>Gia ban</th>
    <td><input type="text" name="price" id="price" placeholder="Nhap gia ban"></td>
  </tr>
  <tr>
    <th></th>
    <th><input type="submit" value="Them"></th>
  </tr>
</table>
</form>
<p>
  <a href="/product">Quay lai trang chu</a>
</p>

</body>
</html>
