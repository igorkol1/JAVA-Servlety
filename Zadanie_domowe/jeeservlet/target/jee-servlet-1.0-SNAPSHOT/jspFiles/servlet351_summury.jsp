<%--
  Created by IntelliJ IDEA.
  User: Z6IKL
  Date: 23.06.2019
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Summury</title>
</head>
<body>
<p>Produkt <c:out value="${product_name}"/> dodany</p>
Dodaj kolejny proudkt<br>
<jsp:include page="servlet351_add.jsp"/>
</body>
</html>
