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
        <li><a href="listNhanVien.jsp?action=listNhanVien">Nhan vien</a></li>
        <li><a href="/listKhachHang.jsp">Khach hang</a></li>
        <li><a href="#">Dich vu</a></li>
        <li><a href="#">Contact</a></li>
        <li class="search-box">
            <input type="text" placeholder="Search...">
            <button type="submit">Search</button>
        </li>
    </ul>
</nav>

<div class="container">
    <aside class="left-sidebar">

        <button> <h2>Them moi nhan vien</h2></button>

        <!-- Add additional content for the left sidebar here -->
    </aside>

    <main class="content">
        <h2>Main Content</h2>


    </main>
</div>

<footer>
    <p>&copy; 2023 Your Website. All rights reserved.</p>
</footer>

</body>
</html>
