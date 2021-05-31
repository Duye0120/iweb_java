<%--
  南京艾瑞
  User: jack
  Date: 2021-05-28 0028
  Time: 11:11
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

name:<%=request.getAttribute("name")%>
<br>
ses-name: <%=session.getAttribute("ses-name")%>

br
ap-name :<%=application.getAttribute("app-name")%>
</body>
</html>
