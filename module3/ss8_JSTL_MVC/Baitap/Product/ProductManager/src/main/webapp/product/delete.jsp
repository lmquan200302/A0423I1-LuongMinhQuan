<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 11/8/2023
  Time: 6:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Delete Product</h1>
<p><a href="/product">Quay lai trang chu</a></p>
<form method="post">
  <h3>Ban muon xoa?</h3>
  <table>
    <tr>
      <td>ID</td>
      <td>${product.id}</td>
    </tr>
    <tr>
      <td>Name</td>
      <td>${product.name}</td>
    </tr>
    <tr>
      <td>Made</td>
      <td>${product.made}</td>
    </tr>
    <tr>
      <td>Price</td>
      <td>${product.price}</td>
    </tr>
    <tr>
      <td></td>
      <td><input type="submit" value="Xoa!"></td>
    </tr>
  </table>
</form>
</body>
</html>
