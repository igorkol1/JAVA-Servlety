<%--
  Created by IntelliJ IDEA.
  User: Z6IKL
  Date: 23.06.2019
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="servlet351" method="POST">
    <label>
        Nazwa:
        <input type="text" name="product_name">
    </label>
    <label>
        Cena:
        <input type="number" step="0.01" name="price">
    </label>
    <label>
        Ilość:
        <input type="number" name="quantity">
    </label>
    <input type="submit">
    <p>
        <a href="servlet352">Koszyk</a>
    </p>
</form>
