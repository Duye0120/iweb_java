<%--
  南京艾瑞
  User: jack
  Date: 2021-05-27 0027
  Time: 15:25
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>index</h1>
<%
    request.setAttribute("username", "admin");
%>
<jsp:forward page="/main.jsp"/>

</body>
</html>
