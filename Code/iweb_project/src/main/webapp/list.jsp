<%@ page import="com.duye.bean.Good" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 蔡雨芸
  Date: 2021/5/31
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>商品列表</h1>
<%
    Object goods = request.getAttribute("goods");
    if (goods != null) {
        List<Good> list = (List<Good>) goods;
        for (Good good : list) {
%>
<h2>
    <a href="/good/selectGoodById?gid=<%=good.getGid()%>">
        <%=good.getGname()%>
    </a>
</h2>
<%

        }
    }
%>
</body>
</html>
