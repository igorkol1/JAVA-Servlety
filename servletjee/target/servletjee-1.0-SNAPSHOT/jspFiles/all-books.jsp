<%--
  Created by IntelliJ IDEA.
  User: Z6IKL
  Date: 22.06.2019
  Time: 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<table>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.getTitle()}, ${book.getAuthor()},${book.getIsbn()}</td>
            <td><a href='<c:url value="/delete-book?id=${book.getId()}"/>'>Delete</a></td>
        </tr>
    </c:forEach>
</table>
<a href='<c:url value="/add-book"/>'>Add new book</a><br>
<a href='<c:url value="/search-book"/>'>Search book</a>
</body>
</html>
