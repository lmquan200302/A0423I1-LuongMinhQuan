<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 11/15/2023
  Time: 9:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>

</head>
</head>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f4f4f4;
    }

    header {
        background-color: #333;
        color: white;
        padding: 1em;
        text-align: center;
        font-size: 1.5em;
    }

    nav {
        background-color: #eee;
        padding: 1em;
    }

    nav a {
        text-decoration: none;
        padding: 0.5em 1em;
        color: #333;
        font-weight: bold;
        border-radius: 5px;
        margin-right: 10px;
    }

    section {
        padding: 20px;
    }

    table {
        width: 100%;
        border-collapse: collapse;
        margin-top: 20px;
    }

    th, td {
        border: 1px solid #ddd;
        padding: 8px;
        text-align: left;
    }

    th {
        background-color: #333;
        color: white;
    }

    form {
        max-width: 600px;
        margin: 20px auto;
        padding: 20px;
        background-color: white;
        border-radius: 5px;
    }

    input[type="text"], input[type="email"] {
        width: 100%;
        padding: 10px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        box-sizing: border-box;
    }

    input[type="submit"] {
        background-color: #333;
        color: white;
        padding: 10px 15px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
    }
    nav {
        background-color: #eee;
        padding: 1em;
        display: flex;
        justify-content: space-between;
        align-items: center;
    }

    nav a {
        text-decoration: none;
        padding: 0.5em 1em;
        color: #333;
        font-weight: bold;
        border-radius: 5px;
        margin-right: 10px;
    }

    #search-form {
        display: inline-block;
    }

    #search {
        padding: 8px;
        margin-right: 5px;
        border: 1px solid #ccc;
        border-radius: 5px;
    }

    #search[type="text"] {
        width: 150px; /* Adjust the width as needed */
    }

    #search[type="submit"] {
        background-color: #333;
        color: white;
        padding: 8px 15px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
    }

</style>
<body>

<header>
    Manager Resort Furama
</header>

<nav>
    <a href="#">Customer</a>
    <a href="#">Employe</a>
    <a href="#">Service</a>
    <a href="#">Contract</a>

    <form>
        <input type="text" name="nameSearch" id="search" placeholder="Tìm kiếm...">
        <input type="hidden" name="action" value="selectByName">
        <input type="submit" value="Tìm">
    </form>
</nav>

<section>
    <h2>Danh sách khách hàng</h2>
    <button><a href="/furama?action=create">Add new Customer</a></button>
    <table>
        <thead>
        <tr>
            <th>Ma khach hang</th>
            <th>Ma loai khach</th>
            <th>Ho ten</th>
            <th>Ngay sinh</th>
            <th>Gioi Tinh</th>
            <th>CCCD</th>
            <th>So dien thoai</th>
            <th>Email</th>
            <th>Dia chi</th>
            <th colspan="2">Action</th>
        </tr>
        </thead>
        <tbody>
        <!-- Dữ liệu khách hàng sẽ được hiển thị ở đây -->

        <c:forEach items="${customerList}" var="customerList">
            <tr>
                <td>${customerList.maKhachHang}</td>
                <td>${customerList.maLoaiKhach}</td>
                <td>${customerList.hoTen}</td>
                <td>${customerList.ngaySinh}</td>
                <td>${customerList.gioiTinh}</td>
                <td>${customerList.CCCD}</td>
                <td>${customerList.SDT}</td>
                <td>${customerList.email}</td>
                <td>${customerList.diaChi}</td>
                <td><button><a href="/furama?action=">Delete</a></button></td>
                <td><button><a href="#">Update</a></button></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</section>
</body>
</html>
