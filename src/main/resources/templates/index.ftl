<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="/bootstrap/ioc/favicon.ico">

<title>登陆</title>

<!-- Bootstrap core CSS -->
<link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/bootstrap/css/signin.css" rel="stylesheet">
<script  src="/js/jquery-3.2.1.min.js"></script>
<script  src="/layer/layer.js"></script>
<script >
    function login() {
        if(!$("#userName").val()){
            return ;
        }
        if(!$("#pwd").val()){
            return;
        }
        var param = {
            "userName": $("#userName").val(),
            "password": $("#pwd").val()
        };
        var index = layer.load();
        $.ajax({
            url: "/login",
            type: "post",
            contentType: "application/json",
            data: JSON.stringify(param),
            success: function (data) {
                if(data == "success"){
                    window.location.href="/";
                } else {
                    layer.close(index);
                    $("#pwd").val("");
                    layer.msg('用户名或密码错误',{icon:5});
                }
            }
        })
    }

</script>
    <style>
        body {
            background: url("/img/4.jpg") no-repeat center;
            /*background-size: 100%;*/

        }
    </style>
</head>

<body>
<div class="">

</div>
<div class="container" >
    <#--<img style="position:absolute;left:0px;top:0px;width:100%;height:100%;z-Index:-1; border:1px solid white;" src="/img/3.jpg" />-->
    <form class="form-signin" action="javascript:;">
        <h2 class="form-signin-heading">欢迎登陆</h2>
        <label for="inputEmail" class="sr-only">用户名</label>
        <input type="text" id="userName" class="form-control" placeholder="用户名" required autofocus>
        <label for="inputPassword" class="sr-only">密码</label>
        <input type="password" id="pwd" class="form-control" placeholder="密码" required>
        <div class="checkbox">
            <label>
                <input type="checkbox" value="记住密码"> Remember me
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit" onclick="login()">登陆</button>
        <button class="btn btn-lg btn-primary btn-block" type="button" onclick="javascript:window.location.href='/gotoRegister'">注册</button>
    </form>

</div>

</body>
</html>