<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 11/3/2023
  Time: 8:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Create new Student</h2>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/students">Back to Student List</a>
</p>
<table>
    <tr>
        <td>Id</td>
        <id><input type="text" name="id" placeholder="Nhap ID"></id>
    </tr>
    <tr>
        <td>Name</td>
        <td><input type="text" name="name" placeholder="Nhap name"></td>
    </tr>
    <tr>
        <td>Email</td>
        <td><input type="text" name="address" placeholder="Nhap Dia chi"></td>
    </tr>
    <tr>
        <td>Grader</td>
        <td><input type="text" name="grader" placeholder="Nhap Gioi tinh"></td>
    </tr>
    <tr>
        <td>Point</td>
        <td><input type="text" name="point" placeholder="Nhap Diem"></td>
    </tr>

</table>
</body>
</html>
