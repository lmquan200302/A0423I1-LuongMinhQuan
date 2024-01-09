<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 11/24/2023
  Time: 12:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<button><a href="contact?action=contact">Back to list</a></button>
<form method="post">
<table>
    <tr>
        <td>Ngay len hop dong</td>
        <td><input type="text" name="ngaylenhopdong"></td>
    </tr>
    <tr>
        <td>Ngay ket thuc</td>
        <td><input type="text" name="ngayketthuchopdong"></td>
    </tr>
    <tr>
        <td>tien dat coc</td>
        <td><input type="text" name="tiendatcoc"></td>
    </tr>
    <tr>
        <td>ma nhan vien</td>
        <td><input type="text" name="manhanvien"></td>
    </tr>
    <tr>
        <td>ma khach hang</td>
        <td><input type="text" name="makhachhang"></td>
    </tr>
    <tr>
        <td>ma dich vu</td>
        <td><input type="text" name="madichvu"></td>
    </tr>
    <tr>
        <td></td>
        <td><input type="submit" value="Save"></td>
    </tr>
</table>
</form>

</body>
</html>
