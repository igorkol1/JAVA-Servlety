<%--
  Created by IntelliJ IDEA.
  User: Z6IKL
  Date: 22.06.2019
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Book</title>
</head>
<body>
<form action="add-book" method="post">
    Title:
    <input type="text" name="title">
    Author:
    <input type="text" name="author">
    ISBN:
    <input type="number" name="isbn">
    <button type="submit">Save</button>
</form>
</body>
</html>
