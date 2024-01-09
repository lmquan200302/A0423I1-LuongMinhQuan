<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 11/13/2023
  Time: 8:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Edit User</h2>
<form method="post">
  <table>
    <tr>
      <td>Name</td>
      <td><input type="text" name="name" id="name"></td>
    </tr>
    <tr>
      <td>Email</td>
      <td><input type="text" name="email" id="email"></td>
    </tr>
    <tr>
      <td>Country</td>
      <td><input type="text" name="country" id="country"></td>
    </tr>
    <tr>
      <td></td>
      <td><input type="submit" value="Save"></td>
    </tr>
  </table>
</form>
<a href="/user?action=user">back to list</a>

</body>
</html>
