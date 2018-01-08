<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
			<form class="m-t" role="form" action="user/login" method="post">
			<input type="hidden" name="type" value="admin">
				<div class="form-group">
					<input name="username" type="text" class="form-control"
						id="username" placeholder="管理员账户" required="">
				</div>
				<div class="form-group">
					<input name="password" type="password" class="form-control"
						id="password" placeholder="密码" required="">
				</div>
				<button type="submit" class="btn btn-primary block full-width m-b">管理员登录</button>
				<p class="text-muted text-center">
					<a href="user/toUserAccountAuthentication"><small>忘记密码了？</small></a>
				</p>   

  </body>
</html>
