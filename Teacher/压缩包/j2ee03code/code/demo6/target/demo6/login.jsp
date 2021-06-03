<%--
  南京艾瑞
  User: jack
  Date: 2021-06-03 0003
  Time: 14:21
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
        <input type="text" name="account">
        <input type="text" name="pwd">
        <input type="submit" value="login">
    </form>
</div>
<h1>${msg}</h1>

</body>
</html>
