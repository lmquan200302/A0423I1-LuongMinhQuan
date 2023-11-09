<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<h1>Caculator</h1>
<form method="post" action="CaculatorServlet">
    <input type="text" id="num1" name="num1">
    <input type="text" id="num2" name="num2">
    <input type="submit" name="cong" value="+">
    <input type="submit" name="tru" value="-">
    <input type="submit" name="nhan" value="X">
    <input type="submit" name="chi" value="/">

</form>
</body>
</html>