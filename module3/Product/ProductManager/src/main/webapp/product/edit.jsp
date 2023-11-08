<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 11/8/2023
  Time: 1:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sua san pham</h1>
<p><a href="/product">Tro ve trang chu</a></p>
<form method="post">
    <table>
        <tr>
            <td>ID</td>
            <td><input type="text" name="id" id="id"></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name" id="name"></td>
        </tr>
        <tr>
            <td>Quoc gia</td>
            <td><input type="text" name="made" id="made"></td>
        </tr>
        <tr>
            <td>Gia ban</td>
            <td><input type="text" name="price" id="price"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Create Form"></td>
        </tr>
    </table>
</form>
</body>
</html>
