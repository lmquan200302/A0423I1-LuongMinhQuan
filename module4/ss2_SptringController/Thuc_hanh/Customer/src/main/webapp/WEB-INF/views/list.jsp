<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 1/10/2024
  Time: 6:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Age</td>
        <td>Gender</td>
    </tr>
    <c:forEach items="${customerList}" var="c">
        <tr>
            <td>${c.id}</td>
            <td>${c.name}</td>
            <td>${c.age}</td>
            <td>${c.gender}</td>
        </tr>
    </c:forEach>
</table>
<button><a href="">Add</a></button>
</body>
</html>
