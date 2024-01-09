<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 11/24/2023
  Time: 2:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<button><a href="contact_detail?action=contact_detail">back to list</a></button>
<form method="post">
    <table>
        <tr>
            <td>Ma hop dong</td>
            <td><input type="text" name="mahopdong"></td>
        </tr>
        <tr>
            <td>ma dich vu di kem</td>
            <td><input type="text" name="madichvudikem"></td>
        </tr>
        <tr>
            <td>so luong</td>
            <td><input type="text" name="soluong"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Save"></td>
        </tr>
    </table>
</form>

</body>
</html>
