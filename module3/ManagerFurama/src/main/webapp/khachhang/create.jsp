<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 11/23/2023
  Time: 4:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" name="myForm" onsubmit="return validateForm()">
    <table>
        <tr>
            <td>Ma loai khach</td>
            <td><input type="text" name="maloaikhach"></td>
        </tr>
        <tr>
            <td>Ho ten</td>
            <td><input type="text" name="hoten"></td>
        </tr>
        <tr>
            <td>ngay sinh</td>
            <td><input type="text" name="ngaysinh"></td>
        </tr>
        <tr>
            <td>gioi tinh</td>
            <td><input type="text" name="gioitinh"></td>
        </tr>
        <tr>
            <td>cccd</td>
            <td><input type="text" name="cccd"></td>
        </tr>
        <tr>
            <td>sdt</td>
            <td><input type="text" name="sdt"></td>
        </tr>
        <tr>
            <td>email</td>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <td>Dia chi</td>
            <td><input type="text" name="diachi"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Save"></td>
        </tr>
        <a href="khachhang?action=khachhang">back to list</a>
    </table>

</form>

</body>
<script>
    // kiem tra email
    function validateForm() {
        var email = document.forms["myForm"]["email"].value;
        var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

        if (!emailRegex.test(email)) {
            alert("Email không hợp lệ. Vui lòng nhập đúng định dạng!");
            return false;
        }
    }
    // kiem tra cmnd
    function validateCMND(cmnd) {
        var cmndRegex = /^\d{9}$|^\d{12}$/;

        return cmndRegex.test(cmnd);
    }

    // Sử dụng hàm trong mã của bạn:
    var cmnd = document.forms["myForm"]["cmnd"].value;

    if (!validateCMND(cmnd)) {
        alert("Số CMND không hợp lệ. Định dạng đúng là XXXXXXXXX hoặc XXXXXXXXXXXX (X là số 0-9)!");
    }


</script>
</html>
