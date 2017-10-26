<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<link href="<%=basePath%>bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
<script src="<%=basePath%>bootstrap/js/jquery.js" type="text/javascript"></script>
<script src="<%=basePath%>bootstrap/js/bootstrap.js" type="text/javascript"></script>
<link href="<%=basePath%>bootstrap/css/style.css" rel="stylesheet" type="text/css"/>
<html>
<head>
    <base href="<%=basePath%>"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>登陆</title>  
</head>
	<body>
		<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="jumbotron">
			</div>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-4 column">
		</div>
		<div class="col-md-4 column">
			<form class="form-horizontal" action="user/showUser.do" role="form">
				<div class="form-group">
					<div class="col-sm-12">
						<input  class="form-control" id="username"  name="username" placeholder="请输入用户名"/>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-12">
						<input type="password" class="form-control" id="password" name="password" placeholder="请输入密码"/>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<div class="checkbox">
							 <label><input type="checkbox" />   &nbsp &nbsp记住我</label>
						</div>
					</div>
				</div>
				<div class="form-group">					
					<div class="col-md-4">
						 <button type="submit" class="btn btn-default">登陆</button>
					</div>					
				</div>
			</form>
		</div>
		<div class="col-md-4 column">			
		</div>
	</div>
</div>
    </body> 
</html>