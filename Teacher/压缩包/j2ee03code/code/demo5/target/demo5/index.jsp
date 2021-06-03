<%--
  南京艾瑞
  User: jack
  Date: 2021-06-03 0003
  Time: 13:34
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="jquery-1.8.3.js"></script>
</head>
<body>

<form action="/hi" method="get">
    <label for="name">name:</label>
    <input type="text" name="name" id="name">
    <input type="submit" value="请求">
</form>

<h1 id="ajax"></h1>
<script>

    $.ajax({
        url: "/ajax",
        type: "get",
        data: {name: "小黑"},
        dataType: "text",
        success: function (data) {
            $("#ajax").text(data);
        }
    })

</script>

</body>
</html>
