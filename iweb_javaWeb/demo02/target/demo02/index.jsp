<%--
  Created by IntelliJ IDEA.
  User: Dario
  Date: 2021/5/27
  Time: 18:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>请在输入框输入你的名字</h1>
<%
    Object res = request.getAttribute("name");
    if (res != null) {
%>
<span style="color: red"><%=res.toString()%></span>
<%
    }
%>
<form action="/test">
    <input type="text" name="name">
    <input type="submit" >
</form>
</body>
</html>
