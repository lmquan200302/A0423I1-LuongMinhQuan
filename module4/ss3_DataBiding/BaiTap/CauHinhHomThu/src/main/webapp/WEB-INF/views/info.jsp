<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 1/11/2024
  Time: 11:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Info Setting</h2>

<table border="1">
    <tr>
        <th>Language: </th>
        <td> ${Language}</td>
    </tr>
    <tr>
        <th>Page Size</th>
        <td>Show ${Pagesize} emails per page</td>
    </tr>
    <tr>
        <th>Spams filler</th>
        <td>${Spams}</td>
    </tr>
    <tr>
        <th>Signature</th>
        <td>${Signature}</td>
    </tr>
    <tr>
        <td></td>
        <td><a href="home.jsp">Back</a></td>
    </tr>
</table>
</body>
</html>
