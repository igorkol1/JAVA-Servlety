<%--
  Created by IntelliJ IDEA.
  User: Z6IKL
  Date: 22.06.2019
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>JSP 13</title>
</head>
<body>
<c:out value="${book.getTitle()}"></c:out>
<c:out value="${book.getAuthor()}"></c:out>
<c:out value="${book.getIsbn()}"></c:out>
</body>
<a href='<c:url value="/all-books"/>'>Back to list</a>
</html>
