<%--
  南京艾瑞
  User: jack
  Date: 2021-06-03 0003
  Time: 08:52
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="/jquery-1.8.3.js"></script>

</head>
<body>

<%--box中显示服务器返回的数据--%>
<div class="box"></div>

<script>
    // http://localhost:8080/login?name=admin&pwd=123456
    $.ajax({
        url: "/info",  // 请求url
        type: "POST", // 请求方式
        data: {name: "admin", pwd: "123456"}, // 请求参数
        // dataType: "text", // 返回参数类型
        // dataType: "xml",
        dataType: "json",
        success: function (data) { // 回调函数, 当请求成功后会将数据在这个函数中返回
            console.log(typeof data);
            // $(".box").text(data); // 将数据显示在box中

            console.log(data);

            /*xml解析*/
            // $(data).find("bean").each(function (index, el) {
            //     let name1 = $($(el).find("property")[0]).attr("name");
            //     let value1 = $($(el).find("property")[0]).attr("value");
            //     console.log(name1 + "->" + value1);
            //     let name2 = $($(el).find("property")[1]).attr("name");
            //     let value2 = $($(el).find("property")[1]).attr("value");
            //     console.log(name2 + "->" + value2);
            // })

            /*json解析： jQuery 会帮助我们将 json字符串*/
            for (let i = 0; i < data.length; i++) {
                console.log(data[i].id + "\t" + data[i].name + "\t" + data[i].age);
            }
        }
    })
</script>
</body>
</html>
