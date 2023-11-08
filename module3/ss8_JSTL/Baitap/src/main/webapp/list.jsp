<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<form method="post" action="customer">
  <h1>Danh sach khach hang</h1>
  <table>
    <thead>
    <th>Ho Ten</th>
    <th>Ngay sinh</th>
    <th>Dia chi</th>
    </th>
    </thead>
    <tbody>
    <c:forEach var="customer" items="${customers}">
      <td>${customer.name}</td>
      <td>${customer.birthday}</td>
      <td>${customer.address}</td>

    </c:forEach>
    </tbody>
  </table>
</form>
</body>
</html>