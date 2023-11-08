<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 11/3/2023
  Time: 6:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Student</title>
</head>
<body>
<h2>Student</h2>

<p>
    <a href="/students?action=create">Create new Student</a>
</p>
<table border="1">
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Email</td>
        <td>Grader</td>
        <td>Address</td>
        <td>Point</td>
    </tr>
    <c:forEach items="${students}" var="students">
        <tr>
            <td>${students.id}</td>
            <td>${students.name}</td>
            <td>${students.email}</td>
            <td>${students.grader}</td>
            <td>${students.address}</td>
            <td>${students.point}</td>
        </tr>

    </c:forEach>


</table>
</body>
</html>
