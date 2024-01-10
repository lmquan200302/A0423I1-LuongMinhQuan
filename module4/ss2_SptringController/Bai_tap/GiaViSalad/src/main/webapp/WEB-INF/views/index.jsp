<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 1/10/2024
  Time: 8:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="save" method="post">
  <input type="checkbox" name="condiment" value="lettuce"> Lettuce
  <input type="checkbox" name="condiment" value="tomato"> Tomato
  <input type="checkbox" name="condiment" value="mustard"> Mustard
  <input type="checkbox" name="condiment" value="sprouts"> Sprouts
    <button>Submit!</button>
</form>
<p>Result: ${Result}</p>
</body>
</html>
