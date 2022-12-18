<%@ page import="module.Numbers" %>
<%@ page import="java.util.Objects" %><%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 11.12.2022
  Time: 12:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<% Numbers numbers = (Numbers) session.getAttribute("numbers");%>
<p>
    Что получилось : <%
    double result = 0;
    double a = numbers.getA();
    double b = numbers.getB();
    String sign = numbers.getSign();
    if (Objects.equals(sign, "divide")) {
        result = a / b;
    } else if (Objects.equals(sign, "multiply")) {
        result = a * b;
    } else if (Objects.equals(sign, "plus")) {
        result = a + b;
    } else if (Objects.equals(sign, "minus")) {
        result = a - b;
    }
    System.out.println(a + sign + b +" = " + result);
%>
</p>
</body>
</html>
