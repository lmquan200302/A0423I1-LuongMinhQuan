<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1>Danh sach sinh vien</h1>
<table border="1">
  <thead>
  <tr>
    <th>Id</th>
    <th>Ho va ten</th>
    <th>Dia chi</th>
    <th>SDT</th>
    <th>Trang thai</th>
    <th>Class ID</th>
  </tr>
  </thead>
  <c:forEach items="${studentList}" var="student">
  <tr>
    <td>${student.id}</td>
    <td>${student.name}</td>
    <td>${student.address}</td>
    <td>${student.phone}</td>
    <td>${student.status}</td>
    <td>${student.class_id}</td>
  </tr>
  </c:forEach>
</table>
</body>
</html>