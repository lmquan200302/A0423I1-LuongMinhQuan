<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 11/3/2023
  Time: 7:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
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
  <c:forEach items="${students}" var="s">
    <tr>
      <td>${s.id}</td>
      <td><a href="/students?action=view&id=${s.id}">s.name</a></td>
      <td>${s.email}</td>
      <td>${s.grader}</td>
      <td>${s.address}</td>
      <td>${s.point}</td>
      <td><a href="/students?action=edit&id=${s.id}">Edit</a></td>
      <td><a href="/students?action=delete&id=${s.id}">Delete</a></td>
    </tr>

  </c:forEach>


</table>

</body>
</html>
