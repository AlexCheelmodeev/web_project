<%@ page import="module.Cart" %><%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 10.12.2022
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cart</title>
</head>
<body>
<% Cart cart =(Cart) session.getAttribute("cart"); %>
<p>
  Наименование : <%=cart.getProduct() %>
</p>
<p>
 Колличество : <%=cart.getQuantity() %>
</p>
</body>
</html>
