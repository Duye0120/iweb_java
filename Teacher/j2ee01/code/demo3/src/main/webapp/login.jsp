<%--
  南京艾瑞
  User: jack
  Date: 2021-05-27 0027
  Time: 15:31
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h1>登录:
    <%
        Object res = request.getAttribute("message");
        if (res != null) {
    %>
    <span style="color: red"><%=res.toString()%></span>
    <%
        }
    %>

</h1>
<form action="/user/login" method="post">
    <label for="username1">username:</label>
    <input type="text" name="username" id="username1">
    <label for="password1">username:</label>
    <input type="text" name="password" id="password1">
    <input type="submit" value="登录">
</form>
</body>
</html>
