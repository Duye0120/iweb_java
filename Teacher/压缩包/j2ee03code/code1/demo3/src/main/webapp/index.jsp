<%--
  南京艾瑞
  User: jack
  Date: 2021-06-03 0003
  Time: 10:46
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="jquery-1.8.3.js"></script>
</head>
<body>


<script>
    /*$.ajax({
        url: "/ajax",
        data: {id: 1},
        async: false, // 设定成同步
        dataType: "text"
    })
    $.ajax({
        url: "/ajax",
        data: {id: 2},
        async: false,
        dataType: "text"
    })
    $.ajax({
        url: "/ajax",
        data: {id: 3},
        async: false,
        dataType: "text"
    })
    $.ajax({
        url: "/ajax",
        data: {id: 4},
        async: false,
        dataType: "text"
    })*/


    // 默认json 默认get
    /*$.getJSON("/ajax", {id: 1}, function (data) {
        console.log(data)
    })*/

    $.get("/ajax", {id: 1}, function (data) {
        console.log(data);
    }, "json")

</script>

</body>
</html>
