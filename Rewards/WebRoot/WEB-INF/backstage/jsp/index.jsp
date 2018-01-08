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

<title>测试</title>

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
<table width="100%" border="1">
	<tr>
		<td>编号</td>
		<td>商品名称</td>
		<td>剩余数量</td>
		<td>类型</td>
	</tr>
	<tr>
		<td>"${activities.id}"</td>
		<td>${activities.name}</td>
		<td>${activities.number}</td>
		<td>${activities.typeId}</td>
	</tr>
	
   
</table>
</body>
</html>
