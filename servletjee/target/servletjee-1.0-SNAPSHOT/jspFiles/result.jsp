<%--
  Created by IntelliJ IDEA.
  User: Z6IKL
  Date: 22.06.2019
  Time: 11:01
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
        </tr>
    </c:forEach>
</table>

</body>
</html>
