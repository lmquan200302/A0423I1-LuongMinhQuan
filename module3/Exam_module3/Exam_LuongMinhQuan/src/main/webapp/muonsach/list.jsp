<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 11/24/2023
  Time: 7:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Muon sach</h1>
<table border="1">
  <tr>
    <td>ma muon sach</td>
    <td>ma sach</td>
    <td>ma hoc sinh</td>
    <td>trang thai</td>
    <td>ngay muon</td>
    <td>ngay tra</td>
  </tr>
  <c:forEach items="${muonsachList}" var="muonsachList">
    <tr>
      <td>${muonsachList.mamuonsach}</td>
      <td>${muonsachList.masach}</td>
      <td>${muonsachList.mahocsinh}</td>
      <td>${muonsachList.trangthai}</td>
      <td>${muonsachList.ngaymuon}</td>
      <td>${muonsachList.ngaytra}</td>
    </tr>

  </c:forEach>
</table>

</body>
</html>
