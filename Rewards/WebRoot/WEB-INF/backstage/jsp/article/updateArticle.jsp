<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://"
      + request.getServerName() + ":" + request.getServerPort()
      + path + "/";
%>

<!doctype html>
<html class="no-js">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>会员积分管理系统-修改商品信息</title>
<meta name="description" content="这是一个 index 页面">
<meta name="keywords" content="index">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png" href="${pageContext.request.contextPath}/resource/i/favicon.png">
<link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath}/resource/i/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/amazeui.min.css"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/admin.css">
<script src="${pageContext.request.contextPath}/resource/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resource/js/app.js"></script>
</head>
<body>
<!--[if lte IE 9]><p class="browsehappy">升级你的浏览器吧！ <a href="http://se.360.cn/" target="_blank">升级浏览器</a>以获得更好的体验！</p><![endif]-->






</head>

<body>
<header class="am-topbar admin-header">
  <div class="am-topbar-brand"><img src="${pageContext.request.contextPath}/resource/i/logo.png"></div>

  <div class="am-collapse am-topbar-collapse" id="topbar-collapse">
    <ul class="am-nav am-nav-pills am-topbar-nav admin-header-list">

   <li class="am-dropdown tognzhi" data-am-dropdown>
  <button class="am-btn am-btn-primary am-dropdown-toggle am-btn-xs am-radius am-icon-bell-o" data-am-dropdown-toggle> 消息管理<span class="am-badge am-badge-danger am-round">6</span></button>
  <ul class="am-dropdown-content">
  	
  	
  	
    <li class="am-dropdown-header">所有消息都在这里</li>

    

    <li><a href="#">未激活会员 <span class="am-badge am-badge-danger am-round">556</span></a></li>
    <li><a href="#">未激活代理 <span class="am-badge am-badge-danger am-round">69</span></a></a></li>
    <li><a href="#">未处理汇款</a></li>
    <li><a href="#">未发放提现</a></li>
    <li><a href="#">未发货订单</a></li>
    <li><a href="#">低库存产品</a></li>
    <li><a href="#">信息反馈</a></li>
    
    
    
  </ul>
</li>

 <li class="kuanjie">
 	
 	<a href="#">会员管理</a>          
 	<a href="#">奖金管理</a> 
 	<a href="#">订单管理</a>   
 	<a href="#">产品管理</a> 
 	<a href="#">个人中心</a> 
 	 <a href="#">系统设置</a>
 </li>

 <li class="soso">
 	
<p>   
	
	<select data-am-selected="{btnWidth: 70, btnSize: 'sm', btnStyle: 'default'}">
          <option value="b">全部</option>
          <option value="o">产品</option>
          <option value="o">会员</option>
          
        </select>

</p>

<p class="ycfg"><input type="text" class="am-form-field am-input-sm" placeholder="圆角表单域" /></p>
<p><button class="am-btn am-btn-xs am-btn-default am-xiao"><i class="am-icon-search"></i></button></p>
 </li>




      <li class="am-hide-sm-only" style="float: right;"><a href="javascript:;" id="admin-fullscreen"><span class="am-icon-arrows-alt"></span> <span class="admin-fullText">开启全屏</span></a></li>
    </ul>
  </div>
</header>

<div class="am-cf admin-main"> 

<div class="nav-navicon admin-main admin-sidebar">
    
    
    <div class="sideMenu am-icon-dashboard" style="color:#aeb2b7; margin: 10px 0 0 0;"> 欢迎系统管理员：超哥哥</div>
    <div class="sideMenu">
      <h3 class="am-icon-flag"><em></em> <a href="#">商品管理</a></h3>
      <ul>
        <li><a href="${pageContext.request.contextPath}/article/toArticleList">商品列表</a></li>
        <li><a href="${pageContext.request.contextPath}/article/toAddNewArticle">添加新商品</li>
        <li><a href="${pageContext.request.contextPath}/article/toArticleClassify">商品分类</li> 
        <li><a href="${pageContext.request.contextPath}/article/toStockControl"></a>库存管理 </li>
      </ul>
      <h3 class="am-icon-cart-plus"><em></em> <a href="#"> 订单管理</a></h3>
      <ul>
        <li><a href="${pageContext.request.contextPath}/Orders/orderList">订单列表</a></li>
        <li>添加订单</li>
        <li>发货单列表</li>
      </ul>
      <h3 class="am-icon-users"><em></em> <a href="#">会员管理</a></h3>
      <ul>
        <li>会员列表 </li>
        <li>会员积分修改</li>
        <li>会员积分分布图</li>
        <li>会员等级分布图</li>
      </ul>
      
      <h3 class="am-icon-gears"><em></em> <a href="#">系统设置</a></h3>
      <ul>
        <li>数据备份</li>
        <li>权限</li>
        <li>网站设置</li>
        <li>平台设置</li>
        <li>声音文件</li>
      </ul>
    </div>
    <!-- sideMenu End --> 
    
    <script type="text/javascript">
			jQuery(".sideMenu").slide({
				titCell:"h3", //鼠标触发对象
				targetCell:"ul", //与titCell一一对应，第n个titCell控制第n个targetCell的显示隐藏
				effect:"slideDown", //targetCell下拉效果
				delayTime:300 , //效果时间
				triggerTime:150, //鼠标延迟触发时间（默认150）
				defaultPlay:true,//默认是否执行效果（默认true）
				returnDefault:true //鼠标从.sideMen移走后返回默认状态（默认false）
				});
		</script> 

    
    
    
    
    
    
    
</div>

<div class=" admin-content">
	
		<div class="daohang">
			<ul>
				<li><button type="button" class="am-btn am-btn-default am-radius am-btn-xs"> 首页 </li>
				<li><button type="button" class="am-btn am-btn-default am-radius am-btn-xs">帮助中心<a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close="">×</a></button></li>
				<li><button type="button" class="am-btn am-btn-default am-radius am-btn-xs">奖金管理<a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close="">×</a></button></li>
				<li><button type="button" class="am-btn am-btn-default am-radius am-btn-xs">产品管理<a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close="">×</a></button></li>
				
				
			</ul>

       

	
</div>
	
	


<div class="admin-biaogelist">
	
    <div class="listbiaoti am-cf">
      <ul class="am-icon-flag on">商品修改</ul>
      
      <dl class="am-icon-home" style="float: right;"> 当前位置： 首页 > <a href="#">商品修改</a></dl>

      
      
    </div>
	
    <div class="fbneirong">
      <form class="am-form" action="updateArticleById" method="post">
        <div class="am-form-group am-cf">
          <div class="zuo">商品编号</div>
          <div class="you">
            <input type="text" name="id" class="am-input-sm"  value="${article2.id }"
            
            id="doc-ipt-email-1" placeholder="请输入商品编号">
          </div>
        </div>
        <div class="am-form-group am-cf">
          <div class="zuo">商品名称</div>
          <div class="you">
            <input type="text" name="name" class="am-input-sm" 
            value="${article2.name}"
            id="doc-ipt-pwd-1" placeholder="请输入商品名称">
          </div>
        </div>
        
         <div class="am-form-group am-cf">
          <div class="zuo">商品数量</div>
          <div class="you">
            <input type="text" name="number" class="am-input-sm" 
            value="${article2.number}"
            id="doc-ipt-pwd-1" placeholder="请输入商品数量">
          </div>
        </div>
        
        <div class="am-form-group am-cf">
          <div class="zuo">商品类型</div>
          <div class="you">
            <input type="text" name="typeId" class="am-input-sm" 
            value="${article2.typeId }"
            id="doc-ipt-pwd-1" placeholder="请输入商品类型">
          </div>
        </div>
    
        
        <div class="am-form-group am-cf">
          <div class="zuo">描述：</div>
          <div class="you">
            <textarea   name="describes" 
            value="${article2.describes}"
            rows="2" id="doc-ta-1"></textarea>
            
            
          </div>
        </div>
        <div class="am-form-group am-cf">
          <div class="zuo">缩略图：</div>
          <div class="you"><input type="file" id="doc-ipt-file-1"> </div>
        </div>
        
        <div class="am-form-group am-cf">
          <div class="zuo">产品图片：</div>
          <div class="you" style="height: 45px;">
            <input type="file" id="doc-ipt-file-1">
            <p class="am-form-help">请选择要上传的文件...</p>
          </div>
        </div>
        
       
        
        
        
        <div class="am-form-group am-cf">
          <div class="you" style="margin-left: 11%;">
              <button type="submit" class="am-btn am-btn-success am-radius">修改并关闭窗口</button>&nbsp;  &raquo; &nbsp; 
              <button type="submit" class="am-btn am-btn-secondary am-radius">修改并继续发布</button>

          </div>
        </div>
      </form>
    </div>

  
 
 <div class="foods">
  <ul>
   	超哥哥版权所有 <a href="http://www.ttimor.cn/" target="_blank" title="谭提莫">会员积分管理系统</a> 
  </ul>
  <dl>
    <a href="" title="返回头部" class="am-icon-btn am-icon-arrow-up"></a>
  </dl>
</div>




</div>

</div>




</div>

<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="resource/js/polyfill/rem.min.js"></script>
<script src="resource/js/polyfill/respond.min.js"></script>
<script src="resource/js/amazeui.legacy.js"></script>
<![endif]--> 

<!--[if (gte IE 9)|!(IE)]><!--> 
<script src="${pageContext.request.contextPath}/resource/js/amazeui.min.js"></script>
<!--<![endif]-->

	<!-- ajax请求页面 -->
<!-- <script type="text/javascript">
	$.ajax({
		url:'findAllType',
		success:function(data){
			alert(data);
			
		}		
	});


</script> -->


</body>
</html>