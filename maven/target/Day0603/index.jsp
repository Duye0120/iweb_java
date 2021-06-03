<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="jquery-1.8.3.js"></script>
</head>
<body>
<script>
    $.ajax({
        url: '/info',
        type: 'post',// 两种请求方式 get post
        data: {
            name: 'admin',
            pwd: '123456'
        },
        // dataType:'text',
        dataType: 'xml',
        // dataType:'json',
        success: function (data) { // 回调函数, 当请求成功后会将数据在这个函数中返回
            console.log(typeof data);
            // $(".box").text(data); // 将数据显示在box中
            console.log(data);
            $(data).find("bean").each(function (index, el) {
                let name1 = $($(el).find("property")[0]).attr("name");
                let value1 = $($(el).find("property")[0]).attr("value");
                console.log(name1 + "->" + value1);
                let name2 = $($(el).find("property")[1]).attr("name");
                let value2 = $($(el).find("property")[1]).attr("value");
                console.log(name2 + "->" + value2);
            })
        }

    })
</script>
</body>
</html>
