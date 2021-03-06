<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>欢迎登陆会员积分管理系统</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta name="description" content="这是一个 index 页面">
<meta name="keywords" content="index">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png" href="${pageContext.request.contextPath}/resource/i/favicon.png">
<link rel="apple-touch-icon-precomposed"
	href="${pageContext.request.contextPath}/resource/i/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />

<link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/amazeui.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/amazeui.datatables.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/app.css">
<script src="${pageContext.request.contextPath}/resource/js/jquery.min.js"></script>

</head>

<body data-type="login">
	<script src="${pageContext.request.contextPath}/resource/js/theme.js"></script>
	<div class="am-g tpl-g">
		<!-- 风格切换 -->
		<div class="tpl-skiner">
			<div class="tpl-skiner-toggle am-icon-cog"></div>
			<div class="tpl-skiner-content">
				<div class="tpl-skiner-content-title">选择主题</div>
				<div class="tpl-skiner-content-bar">
					<span class="skiner-color skiner-white" data-color="theme-white"></span>
					<span class="skiner-color skiner-black" data-color="theme-black"></span>
				</div>
			</div>
		</div>
		<div class="tpl-login">
			<div class="tpl-login-content">
				<div class="tpl-login-logo"></div>



				<form  action="user/login" class="am-form tpl-form-line-form" method="post">
					<div class="am-form-group">
						<input type="text" name="name" class="tpl-form-input" id="name"
							placeholder="请输入账号">

					</div>

					<div class="am-form-group">
						<input type="password" class="tpl-form-input" name="password"
							id="password" placeholder="请输入密码">

					</div>
		 

					<div class="am-form-group">
						<input type="submit"
							class="am-btn am-btn-primary  am-btn-block tpl-btn-bg-color-success  tpl-login-btn">

					</div>
				</form>
			</div>
		</div>
	</div>
	<script src="${pageContext.request.contextPath}/resource/js/amazeui.min.js"></script>
	<script src="${pageContext.request.contextPath}/resource/js/app.js"></script>

</body>

</html>