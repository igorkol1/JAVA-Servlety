<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Z6IKL
  Date: 23.06.2019
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Koszyk</title>
</head>
<body>
<c:choose>
    <c:when test="${isEmpty}">
        <p>Koszyk jest pusty</p>
    </c:when>
    <c:otherwise>
        <c:forEach var="product" items="${cartItems}">
            <c:out value="${product.toString()}"></c:out><br>
        </c:forEach>
    </c:otherwise>
</c:choose>
<p>
    Suma: <c:out value="${sum}"></c:out> zł
</p>


</body>
</html>
