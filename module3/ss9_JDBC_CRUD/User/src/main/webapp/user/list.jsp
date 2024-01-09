<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 11/10/2023
  Time: 4:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>List User</h2>
<form>
    <input type="text" name="nameSearch">
    <input type="hidden" name="action" value="findByName">
    <button>Search</button>
</form>
<form>
    <input type="text" name="countrySearch">
    <input type="hidden" name="action" value="findByCountry">
    <button>Search</button>
</form>
<a href="user?action=create">Add user</a>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Country</th>
        <th>Action</th>
    </tr>
    <c:forEach items="${userList}" var="u">
        <tr>
            <td>${u.id}</td>
            <td>${u.name}</td>
            <td>${u.email}</td>
            <td>${u.country}</td>
            <td><a href="/user?action=delete&id=${u.id}">Delete</a> | <a href="/user?action=update&id=${u.id}"> Update</a></td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
