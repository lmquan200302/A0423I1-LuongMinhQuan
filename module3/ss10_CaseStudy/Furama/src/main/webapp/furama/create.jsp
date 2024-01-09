<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 11/20/2023
  Time: 7:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Create Customer</h2>
<form method="post">
<table>
    <tr>
        <td>Ma Khach hang</td>
        <td><input type="text" name="ma_khach_hang"></td>
    </tr>

    <tr>
        <td>Ma loai khach</td>
        <td><input type="text" name="ma_loai_khach"></td>
    </tr>
    <tr>
        <td>Ho ten</td>
        <td><input type="text" name="ho_ten"></td>
    </tr>
    <tr>
        <td>Ngay sinh</td>
        <td><input type="text" name="ngay_sinh"></td>
    </tr>
    <tr>
        <td>Gioi tinh</td>
        <td><input type="text" name="gioi_tinh"></td>
    </tr>
    <tr>
        <td>CCCD</td>
        <td><input type="text" name="cccd"></td>
    </tr>
    <tr>
        <td>SDT</td>
        <td><input type="text" name="so_dien_thoai"></td>
    </tr>
    <tr>
        <td>Email</td>
        <td><input type="text" name="email"></td>
    </tr>
    <tr>
        <td>Dia chi</td>
        <td><input type="text" name="dia_chi"></td>
    </tr>
    <tr>
        <td></td>
        <td><input type="submit" value="Submit"></td>
        <td><a href="/furama?action=furama">Back to list</a></td>
    </tr>

</table>
</form>

</body>
</html>
