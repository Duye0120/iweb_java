<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>登录页面</h1>
<form action="/user/login" method="post">
    <label for="uname">username:</label>
    <input type="text" name="uname" id="uname">
    <label for="upwd">password:</label>
    <input type="text" name="upwd" id="upwd">
    <input type="submit" value="登录">
</form>
<div>
    <h2>
        <%
            Object message = request.getAttribute("message");
            if (message != null) {
        %>
        <%=message%>
        <%
            }
        %>
    </h2>
</div>
</body>
</html>
