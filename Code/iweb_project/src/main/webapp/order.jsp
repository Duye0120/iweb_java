<%@ page import="com.duye.bean.Order" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>order</h1>
<%
    Object order = request.getAttribute("order");
    if (order != null) {
        List<Order> list = (List<Order>) order;
        for (Order orders : list) {
%>
<h2>
    <a href="/good/selectGoodById?gid=<%=orders.getOid()%>">
        <%=orders.getUid()%>;
        <%=orders.getGid()%>;
        <%=orders.getCount()%>;
        <%=orders.getStatus()%>
    </a>
</h2>
<%

        }
    }
%>
</body>
</html>
