<%--
  Created by IntelliJ IDEA.
  User: Dario
  Date: 2021/6/6
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <thead>
    <tr>
        <th>id</th>
        <th>account</th>
        <th>pwd</th>
        <th>addr</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="user" items="${dataGrid.list}">
        <tr>
            <td>${user.id}</td>
            <td>${user.user}</td>
            <td>${user.pwd}</td>
            <td>${user.addr}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
