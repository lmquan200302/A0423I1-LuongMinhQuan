<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 11/7/2023
  Time: 10:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<style>
table{
    border: 1px solid;
}
</style>
<body>
<h1>Quan ly san pham</h1>
<p>
    <a href="/product?action=create">Them moi san pham</a>
</p>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Ten San Pham</th>
        <th>Quoc gia</th>
        <th>Gia ban</th>
        <th colspan="2">Action</th>
    </tr>

    <c:forEach items="${productList}" var="s">
        <tr>
            <td>${s.id}</td>
            <td><a href="/product?action=view&id=${s.id}">${s.name}</a></td>
            <td>${s.made}</td>
            <td>${s.price}</td>
            <td><a href="/product?action=edit&id=${s.id}">Edit</a></td>
            <td><a href="/product?action=delete&id=${s.id}">Delete</a></td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
