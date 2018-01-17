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
<form action="article/findArticleTest" method="post">
 <!--  <input type="text" name="id" placeholder="商品id">
  <div>
		<button type="submit">查询</button>
	</div> -->
  <tr>
     <!-- pojo绑定     既name=""中的值和pojo中的一样，输入框中的值就传进去了。-->
  		<td>
  		商品ID:<input name="id"/>
  		</td>
  		<td>
  			<input type="submit" value="查询"/>
  		</td>
  </tr>
<table width="100%" border="1">
	<tr>
		<td>编号</td>
		<td>商品名称</td>
		<td>剩余数量</td>
		<td>类型</td>
	</tr>
	
	<tr>
		<td>${article.id}</td>
		<td>${article.name}</td>
		<td>${article.number}</td>
		<td>${article.typeId}</td>
	</tr>
	
   
</table>
	
</form>
</body>
</html>
