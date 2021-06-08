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
<%--    <script src="./jquery-1.8.3.js"></script>--%>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.0/jquery.js"></script>
</head>
<body>

<h1>用户基本信息</h1>
<div>
    <p>
        id: <span id="id"></span>
    </p>
    <p>
        user: <span id="user"></span>
    </p>
    <p>
        password: <span id="password"></span>
    </p>
    <form action="/user/pwd" method="post">
        new_password: <input type="text" name="pwd">
        <input type="submit" value="更改密码">
    </form>
    <p>
        addr: <span id="addr"></span>
    </p>
    <form action="/usr/addr" method="post">
        new_address: <input type="text" name="addr">
        <input type="submit" value="更改地址">
    </form>
</div>

</body>
<script>
    // ajax 请求获取用户数据
    $.getJSON("/user/info", function (data) {
        if (data) {
            let user = data;
            $("#id").text(user.id);
            $("#user").text(user.username);
            $("#password").text(user.password);
            $("#addr").text(user.addr);
        }else {
            window.location = "/login.jsp"; // js实现页面跳转
        }
    })
</script>
</html>
