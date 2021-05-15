<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript">
        /*
         * 刷新验证码
         */
        function redraw() {
            // var imgObjs = document.getElementsByName("draw"); // 根据name属性获取元素
            // var imgObjs = document.getElementsByTagName("img"); // 根据元素名称获取
            // if (imgObjs.length > 0) {
            //     imgObjs[0].src = 'drawImage?'+new Date().getTime();
            // }

            var imgObj = document.getElementById("draw"); // 根据ID属性获取
            imgObj.src = 'drawImage?'+new Date().getTime();

        }
    </script>
</head>
<body>
<%
    String username = request.getParameter("username");
    username = username == null ? "" : username;
//    if(username == null){
//        username = "";
//    }
%>
<div style="text-align: center;color:red;">
    <%
        String err = request.getParameter("err");
        if ("1".equals(err)) {
            out.print("用户名/密码错误。");
        } else if("2".equals(err)){
            out.print("请输入验证码。");
        } else if("3".equals(err)){
            out.print("验证码不一致。");
        }
    %>
</div>
<div style="width:500px;margin:0 auto;">
    <form action="login" method="post">
        <label for="username" style="font-size:18px">用户名：</label>
        <div style="height:35px;width:400px;position:relative;display:inline">
            <input id="username" name="userName" value="<%=username%>" type="text"
                   style="height:30px;width:350px;padding-right:50px;">
            <span style="position:absolute;right:18px;top:2px;height:16px;width:16px;display:inline-block;"></span>
            <!--绝对位置-->
        </div>
        <br/>
        <br/>
        <label for="password1" style="font-size:18px">&nbsp密码：</label>
        <div style="height:35px;width:400px;position:relative;display:inline">
            <input id="password1" name="password" type="text" style="height:30px;width:350px;padding-right:50px;">
            <span style="position:absolute;right:16px;top:2px;background-image:url();height:16px;width:16px;display:inline-block;"></span>
            <!--绝对位置-->
        </div>
        <br/>
        <br/>
        <label for="verification_code" style="font-size:18px">验证码：</label>
        <input id="verification_code" name="vcode" type="text" style="height:30px;width:160px;">
        <img name="draw" id="draw" src="drawImage"/><a href="javascript:void(0);" onclick="redraw();">换一张</a>
        <br/>
        <br/>
        <div style="width:426px;float: right;">
            <input type="radio" name="auto_login" value="1"/> 自动登录
            <a href="#">忘记密码？</a>
            <a href="regist">注册</a>
        </div>
        <br/>
        <br/>
        <div style="width:426px;float: right;">
            <input type="submit" value="登录" style="height:30px;width:400px;background-color:red;"/>
        </div>
    </form>
</div>
</body>
</html>
