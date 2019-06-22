<%--
  Created by IntelliJ IDEA.
  User: Z6IKL
  Date: 22.06.2019
  Time: 09:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>JSP 12</title>
</head>
<body>
<c:forEach var="i" begin="${start}" end="${end}" step="1">
    <c:out value="${i}"/><br>
</c:forEach>
</body>
</html>
