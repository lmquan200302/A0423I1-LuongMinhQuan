<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 11/27/2023
  Time: 7:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sua thong tin benh an</h1>
<form method="post">
<table>
  <tr>
    <td>Ma benh an</td>
    <td><input type="text" name="mabenhan"></td>
  </tr>
  <tr>
    <td>Ma benh nhan</td>
    <td><input type="text" name="mabenhnhan"></td>
  </tr>
  <tr>
    <td>Ten benh nhan</td>
    <td><input type="text" name="tenbenhnhan"></td>
  </tr>
  <tr>
    <td>Ngay nhap vien</td>
    <td><input type="text" name="ngaynhapvien"></td>
  </tr>
  <tr>
    <td>Ngay ra vien</td>
    <td><input type="text" name="ngayravien"></td>
  </tr>
  <tr>
    <td>Ly do</td>
    <td><input type="text" name="lydo"></td>
  </tr>
  <tr>
    <td></td>
    <td><input type="submit" value="Sua"></td>
    <td><a href="/benhan?action=benhan">Tro ve danh sach</a></td>
  </tr>
</table>
</form>

</body>
</html>
