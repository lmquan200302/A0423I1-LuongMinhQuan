<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 11/24/2023
  Time: 7:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh sach Sach</h1>
<table border="1">
    <tr>
        <td>Ma sach</td>
        <td>Ten sach</td>
        <td>Tac gia</td>
        <td>So luong</td>
        <td>Mo ta</td>
        <td>Action</td>
    </tr>
    <c:forEach items="${sachList}" var="sachList">
        <tr>
            <td>${sachList.masach}</td>
            <td>${sachList.tensach}</td>
            <td>${sachList.tacgia}</td>
            <td>${sachList.soluong}</td>
            <td>${sachList.mota}</td>
            <td><a href="sach?action=create"></a></td>
        </tr>
    </c:forEach>


</table>

</body>
</html>
