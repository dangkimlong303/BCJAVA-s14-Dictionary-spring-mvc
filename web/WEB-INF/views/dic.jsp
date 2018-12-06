<%--
  Created by IntelliJ IDEA.
  User: longdk
  Date: 12/6/18
  Time: 10:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<h1>Dictionary</h1>
<form method="post" action="/dictionary">
    <table>
        <tr>
            <td>Eng:</td>
            <td><input type="text" name="eng" value="${eng}"></td>
        </tr>
        <tr>
            <td>VN:</td>
            <td><input type="text" name="vn" value="${vn}"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="translate"></td>
        </tr>
    </table>
</form>
</body>
</html>
