<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>欢迎登录超市会员积分管理系统</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">


<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="Free HTML5 Template by FreeHTML5.co" />
<meta name="keywords"
	content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />
<!-- Facebook and Twitter integration -->
<meta property="og:title" content="" />
<meta property="og:image" content="" />
<meta property="og:url" content="" />
<meta property="og:site_name" content="" />
<meta property="og:description" content="" />
<meta name="twitter:title" content="" />
<meta name="twitter:image" content="" />
<meta name="twitter:url" content="" />
<meta name="twitter:card" content="" />

<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
<link rel="shortcut icon" href="favicon.ico">

<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300'
	rel='stylesheet' type='text/css'>

<link rel="stylesheet" href="resource/css/bootstrap.min.css">
<link rel="stylesheet" href="resource/css/animate.css">
<link rel="stylesheet" href="resource/css/style.css">


<!-- Modernizr JS -->
<script src="resource/js/modernizr-2.6.2.min.js"></script>
<!-- FOR IE9 below -->
<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
	function checkUser() {
		var result = document.getElementById("name").value;
		var password = document.getElementById("password").value;
		if (result == "") {
			alert("用户名不能为空");
			return false;
		}
		if (password == "") {
			alert("密码不能为空");
			return false;
		} else {
			return true;
		}
	}
</script>
</head>

<body class="style-1">

	<div class="style">
		<div class="col-md-4">


			<!-- Start Sign In Form -->
			<form action="user/login" class="fh5co-form animate-box"
				data-animate-effect="fadeInLeft">
				<h2>请登陆</h2>
				<div class="form-group">
					<label for="name" class="sr-only">请输入帐号</label>
					<input type="text" name="name" class="form-control" id="name"
						placeholder="请输入帐号" autocomplete="off">
				</div>
				<div class="form-group">
					<label for="password" class="sr-only">请输入密码</label>
					<input type="password" name="password" class="form-control"
						id="password" placeholder="请输入密码" autocomplete="off">
				</div>
				<div class="form-group">
					<label for="remember"><input type="checkbox" id="remember">记住帐号</label>
				</div>

				<div class="form-group">
					<input type="submit" value="登陆" class="btn btn-primary">
				</div>
			</form>
			<!-- END Sign In Form -->

		</div>
	</div>
	<div class="row" style="padding-top: 60px; clear: both;">
		<div class="col-md-12 text-center">
			<p>
				<small>&copy;超哥哥 版权所有<a
					href="http://127.0.0.1:8080/Rewards/login.jsp" target="_blank"
					title="超哥哥"> 跳转到主页</a></small>
			</p>
		</div>
	</div>
	</div>

	<!-- jQuery -->
	<script src="resource/js/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script src="resource/js/bootstrap.min.js"></script>
	<!-- Placeholder -->
	<script src="resource/js/jquery.placeholder.min.js"></script>
	<!-- Waypoints -->
	<script src="resource/js/jquery.waypoints.min.js"></script>
	<!-- Main JS -->
	<script src="resource/js/main.js"></script>

</body>
</html>
