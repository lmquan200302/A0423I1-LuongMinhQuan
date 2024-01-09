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
        <li><a href="#">Contact</a></li>
        <li class="search-box">
            <input type="text" placeholder="Search...">
            <button type="submit">Search</button>
        </li>
    </ul>
</nav>

<div class="container">
    <aside class="left-sidebar">
        <h2>them moi</h2>
    </aside>

    <main class="content">
        <table border="1">
            <tr>
                <td>Ma nhan vien</td>
                <td>Ho ten</td>
                <td>Ngay sinh</td>
                <td>CCCD</td>
                <td>Luong</td>
                <td>SDT</td>
                <td>Email</td>
                <td>Dia chi</td>
                <td>Ma vi tri</td>
                <td>Ma trinh do</td>
                <td>Ma bo phan</td>
                <td>Action</td>
            </tr>
            <c:forEach items="${nhanVienList}" var="nhanVienList">
            <tr>
                <td>${nhanVienList.manhanvien}</td>
                <td>${nhanVienList.hoten}</td>
                <td>${nhanVienList.ngaysinh}</td>
                <td>${nhanVienList.cccd}</td>
                <td>${nhanVienList.luong}</td>
                <td>${nhanVienList.sdt}</td>
                <td>${nhanVienList.email}</td>
                <td>${nhanVienList.diachi}</td>
                <td>${nhanVienList.mavitri}</td>
                <td>${nhanVienList.matrinhdo}</td>
                <td>${nhanVienList.mabophan}</td>
                <td>Update | Delete</td>

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
