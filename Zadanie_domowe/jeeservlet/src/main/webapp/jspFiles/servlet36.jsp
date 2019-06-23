<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Z6IKL
  Date: 23.06.2019
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Servlet 36</title>
</head>
<body>
Liczby:
<ul>
    <c:forEach var="number" items="${nums}">
        <li>${number}</li>
    </c:forEach>
</ul>
<p>Srednia: ${avg}</p>
<p>Suma: ${sum}</p>
<p>Iloczyn: ${product}</p>
</body>
</html>
