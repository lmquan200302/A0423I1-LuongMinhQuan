<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 11/26/2023
  Time: 10:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <table>
        <tr>
            <td>Ma muon sach</td>
            <td><input type="text" name="mamuonsach"></td>
        </tr>
        <tr>
            <td>Ma sach</td>
            <td><input type="text" name="masach"></td>
        </tr>
        <tr>
            <td>Ten Sach</td>
            <td><input type="text" name="tensach"></td>
        </tr>
        <tr>
            <td>ma hoc sinh</td>
            <td><input type="text" name="mahocsinh"></td>
        </tr>
        <tr>
            <td>Ten hoc sinh</td>
            <td><input type="text" name="hoten"></td>
        </tr>
        <tr>
            <td>Trang thai</td>
            <td><input type="text" name="trangthai"></td>
        </tr>
        <tr>
            <td>Ngay muon</td>
            <td><input type="text" name="ngaymuon"></td>
        </tr>
        <tr>
            <td>Ngay tra</td>
            <td><input type="text" name="ngaytra"></td>
        </tr>
        <tr>
            <td></td>
            <td><button>Muon sach</button></td>
        </tr>
    </table>
    <a href="/muonsach?action=danhsachmuonsach">Hien thi danh sach hoc sinh da muon sach</a>
</form>

</body>
</html>
