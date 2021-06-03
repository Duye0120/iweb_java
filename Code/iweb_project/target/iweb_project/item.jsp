<%@ page import="com.duye.bean.Good" %><%--
  Created by IntelliJ IDEA.
  User: 蔡雨芸
  Date: 2021/5/31
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>item</h1>
<%
    Good good = (Good) request.getAttribute("good");
%>
<form action="/order/add" method="post">
    <input type="hidden" name="gid" value="<%=good.getGid()%>">
    商品名称: <%=good.getGname()%>; 商品价格:<%=good.getGprice()%>;订单数量:
    <input type="number" name="count" value="1">
    <input type="submit" value="加入购物车">
</form>
</body>
</html>
