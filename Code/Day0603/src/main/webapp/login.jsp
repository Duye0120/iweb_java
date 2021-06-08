<%--
  Created by IntelliJ IDEA.
  User: Dario
  Date: 2021/6/5
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>用户登录</h1>
<div class="login">
    <form action="/user/login" method="post">
        <input type="text" name="user" placeholder="请输入用户名">
        <input type="text" name="pwd" placeholder="请输入密码">
        <input type="submit" value="登录">
    </form>
</div>
<h1>${msg}</h1>
</body>
</html>
