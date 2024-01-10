<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 1/10/2024
  Time: 6:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Email Validate</h1>
<form action="/validate" method="post">
    <input type="text" name="email" placeholder="Nhap email">
    <button>Submit!</button>
</form>
<p>Result: ${Result}</p>

</body>
</html>
