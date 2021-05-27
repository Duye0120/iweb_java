<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--应用header.jsp--%>
<div>
    <jsp:include page="/header.jsp"/>
</div>
<h1>
    main: <%=request.getAttribute("name")%>
    <%
        int x = 100;
    %> <%--局部变量--%>
    <%!
        int y = 100;
    %>  <%--全局变量--%>
    username: <%=request.getAttribute("username")%>
</h1>

</body>
</html>
