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
    <script src="/jquery-1.8.3.js"></script>
</head>
<body>
<h1>用户基本信息</h1>

<div>
    <p>
        id: <span id="id"></span>
    </p>
    <p>
        account: <span id="account"></span>
    </p>
    <p>
        pwd: <span id="pwd"></span>
    </p>
    <form action="/user/pwd" method="post">
        new-pwd: <input type="text" name="pwd">
        <input type="submit" value="pwd">
    </form>
    <p>
        addr: <span id="addr"></span>
    </p>
    <form action="/user/addr" method="post">
        new-pwd: <input type="text" name="addr">
        <input type="submit" value="addr">
    </form>

</div>
<script>
    // ajax请求获取用户数据
    $.getJSON("/user/info", function (data) {
        if (data) {
            let user = data;
            $("#id").text(user.id);
            $("#account").text(user.account);
            $("#pwd").text(user.pwd);
            $("#addr").text(user.addr);
        } else {
            window.location = "/login.jsp"; // js实现页面跳转
        }
    })
</script>
</body>
</html>
