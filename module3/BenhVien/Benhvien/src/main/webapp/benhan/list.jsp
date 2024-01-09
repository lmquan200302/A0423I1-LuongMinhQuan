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
<h2>Danh sach benh an</h2>
<table>
    <thead>

    <tr>
        <th>Ma benh an</th>
        <th>Ma benh nhan</th>
        <th>Ten benh nhan</th>
        <th>Ngay nhap vien</th>
        <th>Ngay ra vien</th>
        <th>Ly do nhap vien</th>
        <th>Tac vu</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${benhanList}" var="benhanList">
        <tr>
            <td>${benhanList.mabenhan}</td>
            <td>${benhanList.mabenhnhan}</td>
            <td>${benhanList.tenbenhnhan}</td>
            <td>${benhanList.ngaynhapvien}</td>
            <td>${benhanList.ngayravien}</td>
            <td>${benhanList.lydo}</td>
            <td><button><a href="benhan?action=update&mabenhan=${benhanList.mabenhan}">Edit</a></button>|
                <button><a href="benhan?action=delete&mabenhan=${benhanList.mabenhan}">Delete</a></button></td>

        </tr>
    </c:forEach>


    </tbody>
</table>

</body>
</html>
