<%--
  Created by IntelliJ IDEA.
  User: Z6IKL
  Date: 22.06.2019
  Time: 09:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>JSP 11</title>
</head>
<body>
<c:choose>
    <c:when test="${not empty role}">
        Role: ${role}
    </c:when>
    <c:otherwise>
        Role: Guest
    </c:otherwise>
</c:choose>
</body>
</html>
