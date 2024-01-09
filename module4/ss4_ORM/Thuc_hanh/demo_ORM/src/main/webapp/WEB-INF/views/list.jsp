<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 1/8/2024
  Time: 7:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Gioi tinh</td>
        <td>Ngon ngu</td>
    </tr>
    <tr>
    <tr th:each="student : ${students}">
        <td th:text="${student.name}"></td>
        <td th:text="${student.age}"></td>
    </tr>
    </tr>
</table>

</body>
</html>
