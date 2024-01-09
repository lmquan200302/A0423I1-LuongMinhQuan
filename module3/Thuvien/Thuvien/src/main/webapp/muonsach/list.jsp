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
<h2>Danh sach Hoc sinh da muon Sach</h2>
<table>
  <thead>

  <tr>
    <th>ma muon sach</th>
    <th>ma sach</th>
    <th>ten sach</th>
    <th>ma hoc sinh</th>
    <th>ten hoc sinh</th>
    <th>trang thai</th>
    <th>ngay muon</th>
    <th>ngay tra</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${themuonsachList}" var="themuonsachList">
    <tr>
      <td>${themuonsachList.mamuonsach}</td>
      <td>${themuonsachList.masach}</td>
      <td>${themuonsachList.tensach}</td>
      <td>${themuonsachList.mahocsinh}</td>
      <td>${themuonsachList.tenhocsinh}</td>
      <td>${themuonsachList.trangthai}</td>
      <td>${themuonsachList.ngaymuon}</td>
      <td>${themuonsachList.ngaytra}</td>
    </tr>
  </c:forEach>


  </tbody>
</table>

</body>
</html>
