<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 11/26/2023
  Time: 7:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<style>
    table {
        border-collapse: collapse;
        width: 100%;
    }

    th, td {
        border: 1px solid #ddd;
        padding: 8px;
        text-align: left;
    }

    th {
        background-color: #f2f2f2;
    }
</style>
<body>
<h2>Danh sach Sach</h2>
<table>
<thead>

<tr>
    <th>Ma sach</th>
    <th>Ten sach</th>
    <th>Tac gia</th>
    <th>Mo ta</th>
    <th>So luong</th>
</tr>
</thead>
<tbody>
<c:forEach items="${sachList}" var="sachList">
    <tr>
        <td>${sachList.masach}</td>
        <td>${sachList.tensach}</td>
        <td>${sachList.tacgia}</td>
        <td>${sachList.mota}</td>
        <td>${sachList.soluong}</td>
        <td><button><a href="/muonsach?action=muonsach">Muon sach</a></button></td>
    </tr>
</c:forEach>


</tbody>
</table>

</body>
</html>
