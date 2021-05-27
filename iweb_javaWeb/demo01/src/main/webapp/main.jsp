<%@ page import="java.util.List" %>
<%@ page import="com.duye.bean.Users" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
<h1>主页</h1>
<table>
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
            List<Users> users = (List<Users>) res;
            for (int i = 0; i < users.size(); i++) {
                Users user = users.get(i);
    %>
    <tr>
        <td>
            <%=user.getId()%>
        </td>
        <td>
            <%=user.getUserName()%>

        </td>
        <td>
            <%=user.getPassWord()%>
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
