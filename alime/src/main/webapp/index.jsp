<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
	<title>主页</title>
    <link href="<%=basePath%>bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
</head>
<body>



<script src="<%=basePath%>bootstrap/js/jquery.js" type="text/javascript"></script>
<script src="<%=basePath%>bootstrap/js/bootstrap.js" type="text/javascript"></script>
</body>
</html>