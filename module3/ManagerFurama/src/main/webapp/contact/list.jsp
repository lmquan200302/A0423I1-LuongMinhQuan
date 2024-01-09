<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 11/24/2023
  Time: 12:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
        <button><a href="/dichvu?action=create">Them moi</a></button>
    </aside>

    <main class="content">
        <table border="1">
            <tr>
                <td>ma hop dong</td>
                <td>Ngay len</td>
                <td>Ngay ket thuc</td>
                <td>tien dat coc</td>
                <td>ma nhan vien</td>
                <td>ma khach hang</td>
                <td>ma dich vu</td>
            </tr>
            <c:forEach items="${contactList}" var="contactList">
                <tr>
                    <td>${contactList.mahopdong}</td>
                    <td>${contactList.ngaylenhopdong}</td>
                    <td>${contactList.ngayketthuchopdong}</td>
                    <td>${contactList.tiendatcoc}</td>
                    <td>${contactList.manhanvien}</td>
                    <td>${contactList.makhachhang}</td>
                    <td>${contactList.madichvu}</td>
                </tr>

            </c:forEach>
        </table>

        </table>

    </main>
</div>

<footer>
    <p>&copy; 2023 Your Website. All rights reserved.</p>
</footer>

</body>
</html>

