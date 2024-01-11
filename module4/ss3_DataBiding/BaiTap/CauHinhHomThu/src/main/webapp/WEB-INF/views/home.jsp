<%--
  Created by IntelliJ IDEA.
  User: ADMINIS
  Date: 1/11/2024
  Time: 10:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Setting</h2>
<form action="/setting" method="post">
  <table border="1">
    <tr>
      <th>Language:</th>
      <td>
        <select name="Language">
          <option value="English">English</option>
          <option value="Vietnamese">Vietnamese</option>
          <option value="Japanese">Japanese</option>
          <option value="Chinese">Chinese</option>
        </select>
      </td>
    </tr>
    <tr>
      <th>Page Size</th>
      <td>
        <select name="Pagesize">
          <option value="5">5</option>
          <option value="10">10</option>
          <option value="15">15</option>
          <option value="20">20</option>
          <option value="25">25</option>
          <option value="50">50</option>
          <option value="100">100</option>
        </select>
      </td>
    </tr>
    <tr>
      <th>Spams filler</th>
      <td><input type="checkbox" name="Spams"> Enable spams filler</td>
    </tr>
    <tr>
      <th>Signature</th>
      <td><input type="text" name="Signature"></td>
    </tr>
    <tr>
      <td></td>
      <td><button>Submit!</button></td>
    </tr>

  </table>

</form>

</body>
</html>
