<%--
  Created by IntelliJ IDEA.
  User: Z6IKL
  Date: 22.06.2019
  Time: 09:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP 3</title>
</head>
<body>
<p>
    ${empty param.a ? "brak" : param.a}
</p>
<p>
    ${empty param.b ? "brak" : param.b}
</p>
</body>
</html>
