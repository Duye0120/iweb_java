<%@ page import="java.util.List" %>
<%@ page import="com.iweb.bean.User" %><%--
  南京艾瑞
  User: jack
  Date: 2021-05-27 0027
  Time: 15:31
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
<h1>主页</h1>

<table style="width: 500px; text-align: center">
    <thead>
    <tr>
        <th>id</th>
        <th>username</th>
        <th>password</th>
    </tr>
    </thead>
    <tbody>
    <%
        Object res = request.getAttribute("users");
        if (res != null) {
            List<User> users = (List<User>) res;
            for (int i = 0; i < users.size(); i++) {
                /*显示数据*/
                User user = users.get(i);
    %>
    <tr>
        <td>
            <%=user.getId()%>
        </td>
        <td>
            <%=user.getUsername()%>
        </td>
        <td>
            <%=user.getPassword()%>
        </td>
    </tr>
    <%
            }
        }
    %>
    </tbody>
</table>

</body>
</html>
