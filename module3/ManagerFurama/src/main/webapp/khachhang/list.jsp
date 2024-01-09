<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles.css">
    <title>Your Website</title>
</head>
<style>
    body {
        margin: 0;
        font-family: Arial, sans-serif;
    }

    header {
        background-color: #333;
        color: #fff;
        text-align: center;
        padding: 1em 0;
    }

    nav {
        background-color: #444;
        color: #fff;
        padding: 0.5em 0;
    }

    nav ul {
        list-style: none;
        margin: 0;
        padding: 0;
    }

    nav ul li {
        display: inline-block;
        margin-right: 20px;
    }

    nav a {
        text-decoration: none;
        color: #fff;
        font-weight: bold;
    }

    .search-box {
        float: right;
    }

    .search-box input {
        padding: 5px;
        border: none;
    }

    .search-box button {
        padding: 5px;
        background-color: #555;
        color: #fff;
        border: none;
        cursor: pointer;
    }

    .container {
        display: flex;
    }

    .left-sidebar {
        width: 200px;
        background-color: #ddd;
        padding: 10px;
    }

    .content {
        flex: 1;
        padding: 10px;
    }

    footer {
        background-color: #333;
        color: #fff;
        text-align: center;
        padding: 1em 0;
        position: fixed;
        width: 100%;
        bottom: 0;
    }

</style>
<body>

<header>
    <h1>Your Website</h1>
</header>

<nav>
    <ul>
        <li><a href="#">Home</a></li>
        <li><a href="/nhanvien">Nhan vien</a></li>
        <li><a href="/khachhang">Khach hang</a></li>
        <li><a href="/dichvu">Dich vu</a></li>
        <li><a href="/contact">Contact</a></li>
        <li><a href="/contact_detail">Contact detail</a></li>
        <li class="search-box">
           <form method="get">
               <input type="text" name="nameSearch" placeholder="Search...">
               <input type="hidden" name="action" value="searchByName">
               <button type="submit">Search</button>
           </form>
        </li>
    </ul>
</nav>

<div class="container">
    <aside class="left-sidebar">
        <button><a href="khachhang?action=create">Them moi</a></button>
    </aside>

    <main class="content">
        <table border="1">
            <tr>
                <td>Ma kh</td>
                <td>ma lk</td>
                <td>ten</td>
                <td>ngay sinh</td>
                <td>gioi tinh</td>
                <td>cccd</td>
                <td>sdt</td>
                <td>email</td>
                <td>dia chi</td>
                <td>Action</td>

            </tr>
            <c:forEach items="${khachHangList}" var="khachHangList">
                <tr>
                    <td>${khachHangList.makhachhang}</td>
                    <td>${khachHangList.maloaikhach}</td>
                    <td>${khachHangList.hoten}</td>
                    <td>${khachHangList.ngaysinh}</td>
                    <td>${khachHangList.gioitinh}</td>
                    <td>${khachHangList.cccd}</td>
                    <td>${khachHangList.sdt}</td>
                    <td>${khachHangList.email}</td>
                    <td>${khachHangList.diachi}</td>

                    <td><a href="khachhang?action=update&makhachhang=${khachHangList.makhachhang}">Update</a>|<a href="/khachhang?action=delete&makhachhang=${khachHangList.makhachhang}">Delete</a></td>

                </tr>
            </c:forEach>
        </table>

    </main>
</div>

<footer>
    <p>&copy; 2023 Your Website. All rights reserved.</p>
</footer>

</body>
</html>
