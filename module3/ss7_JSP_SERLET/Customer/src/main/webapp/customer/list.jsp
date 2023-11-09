<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 11/8/2023
  Time: 9:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Customer List</h1>
<table border="1">
    <tr>
        <th>Ten</th>
        <th>Ngay Sinh</th>
        <th>Dia Chi</th>
    </tr>
    <c:forEach items="${customerList}" var="customerList">
        <tr>
            <td>${customerList.name}</td>
            <td>${customerList.date}</td>
            <td>${customerList.address}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
