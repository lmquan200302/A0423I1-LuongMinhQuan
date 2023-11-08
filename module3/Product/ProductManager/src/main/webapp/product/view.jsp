<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 11/8/2023
  Time: 7:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Chi tiet san pham</h1>

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
    <td><a href="/product">Quay ve trang chu</a></td>
  </tr>
</table>


</body>
</html>
