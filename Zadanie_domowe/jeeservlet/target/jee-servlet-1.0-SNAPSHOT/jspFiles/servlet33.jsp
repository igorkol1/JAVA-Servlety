<%--
  Created by IntelliJ IDEA.
  User: Z6IKL
  Date: 23.06.2019
  Time: 08:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Servlet 33</title>
</head>
<body>
<form action="servlet33" method="POST">
    <c:forEach var="number" items="${numbers}" varStatus="counter">
        <c:choose>
            <c:when test="${isFilled}">
                <input type="number" name="number${counter.index}" value="${number}">
            </c:when>
            <c:otherwise>
                <input type="number" name="number${counter.index}" placeholder="Fill me">
            </c:otherwise>
        </c:choose>
        <br>
    </c:forEach>
    <button type="submit">Save</button>
</form>
</body>
</html>
