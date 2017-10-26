<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!--页面标题-->
    <title>如果可以就好了</title>
    <!--页面Logo-->
    <link rel="shortcut icon" href="<%=basePath%>images/voicecyber.ico"/>
    <!--引入bootstrap样式-->
    <link href="<%=basePath%>bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="container">
    <h1>Welcome, this is ${username} SpringMVC Bootstrap WebApp</h1>
</div>

<!--引入jquery脚本-->
<script src="<%=basePath%>bootstrap/js/jquery.js" type="text/javascript"></script>
<!--引入bootstrap脚本-->
<script src="<%=basePath%>bootstrap/js/bootstrap.js" type="text/javascript"></script>
</body>
</html>