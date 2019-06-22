<%--
  Created by IntelliJ IDEA.
  User: Z6IKL
  Date: 22.06.2019
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form JSP</title>
</head>
<body>
<form action="mvc14" method="post">
    <div>
        Title 1:
        <input type="text" name="title1">
        Author 1:
        <input type="text" name="author1">
        ISBN 1:
        <input type="number" name="isbn1">
    </div>
    <div>
        Title 2:
        <input type="text" name="title2">
        Author 2:
        <input type="text" name="author2">
        ISBN 2:
        <input type="number" name="isbn2">
    </div>
    <button type="submit">Save</button>
</form>
</body>
</html>
