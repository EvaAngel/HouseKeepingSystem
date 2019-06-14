<%--
  Created by IntelliJ IDEA.
  User: fuxin
  Date: 2018/6/12
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录页面</title>
    <script src="../js/jquery-3.3.1.min.js"></script>
</head>
<body>
<script>
    function submit() {
        var username=$("#username").val();
        var password=$("#password").val();
        alert(username);
        $.ajax({
            url: "/isLogin.do",   //这里不用加路径的！！！！
            type: "POST",
            //发送参数
            data: {"username": username,"password":password},
            //返回结果
            success: function (result) {

            }
        });
    }
</script>
<jsp:include page="../common/head.jsp"></jsp:include>
<div class="login">
    <div class="login_content">
        <div class="login_content_top">用户登录</div>
        <div class="login_content_middle">
            <table align="center">
                <tr>
                    <td class="login_content_middle_1"></td>
                    <td class="login_content_middle_2"><input type="text" id="username" name="username"></td>
                </tr>
                <tr>
                    <td class="login_content_middle_3"></td>
                    <td class="login_content_middle_2"><input type="password" id="password" name="password"></td>
                </tr>
            </table>
            <div class="login_content_middle_4">
                <span class="fl"><input type="checkbox" name=""> 自动登录</span>
                <span class="fr"><a href="">忘记密码？</a></span>
            </div>
            <a href="" onclick="submit()">

                <div class="login_content_middle_5">
                    登录
                </div>
            </a>
        </div>
        <div class="login_content_bottom">
            <div class="login_content_bottom_logo fl"></div>
            <a href=""><div class="login_content_bottom_font fl">立即注册</div></a>
        </div>
    </div>
</div>
<jsp:include page="../common/floor.jsp"></jsp:include>
</body>
</html>
