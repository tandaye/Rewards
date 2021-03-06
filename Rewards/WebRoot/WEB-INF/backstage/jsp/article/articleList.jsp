<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://"
      + request.getServerName() + ":" + request.getServerPort()
      + path + "/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html class="no-js">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>积分管理系统-商品列表</title>
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
        <li><a href="${pageContext.request.contextPath}/article/toAddNewArticle">添加新商品</a></li>
        <li><a href="${pageContext.request.contextPath}/article/toArticleClassify">商品分类</a></li> 
        <li><a href="${pageContext.request.contextPath}/article/toStockControl">库存管理</a></li>
      </ul>
      <h3 class="am-icon-cart-plus"><em></em> <a href="#"> 订单管理</a></h3>
      <ul>
        <li><a href="${pageContext.request.contextPath}/Orders/orderList">订单列表</a></li>
        <li><a href=""> 添加订单</a></li>
        <li><a href=""> 发货单列表</a></li>
      </ul>
      <h3 class="am-icon-users"><em></em> <a href="#">会员管理</a></h3>
      <ul>
        <li><a href="${pageContext.request.contextPath}/user/findAllMember">会员列表</a> </li>
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
      <ul class="am-icon-flag on"> 栏目名称</ul>
      
      <dl class="am-icon-home" style="float: right;"> 当前位置： 首页 > <a href="#">商品列表</a></dl>
      
      <dl>
        <a href="${pageContext.request.contextPath}/article/toAddNewArticle"><button type="button" class="am-btn am-btn-danger am-round am-btn-xs am-icon-plus"> 添加产品</button></a>
      </dl>
      
      
    </div>
	
	<div class="am-btn-toolbars am-btn-toolbar am-kg am-cf">
	<form action="">

  <ul>
    <li>
      <div class="am-btn-group am-btn-group-xs">
       
      </div>
    </li>
    <li>
      <div class="am-btn-group am-btn-group-xs">
      
      </div>
    </li>
    <li style="margin-right: 0;">
    	<span ></span>
    </li>
       <li style="margin-left: -4px;">
    	<span  ></span>
    </li>
    
        <li style="margin-left: -10px;">
      <div >
      <!-- <select data-am-selected="{btnWidth: 90, btnSize: 'sm', btnStyle: 'default'}">
        <option value="b">产品分类</option>
        <option value="o">下架</option>
      </select>
      </div> -->
    </li>
  </ul>
  </form>
</div>


    <form class="am-form am-g">
          <table width="100%" class="am-table am-table-bordered am-table-radius am-table-striped">
            <thead>
              <tr class="am-success">
                <th class="table-check"><input type="checkbox" /></th>
                <th class="table-id">ID</th>
                <th class="table-title">商品名称</th>
                <th class="table-type">类别</th>
                <th class="table-author am-hide-sm-only">商品描述</th>
                <th class="table-date am-hide-sm-only">兑换所需积分</th>
                <th class="table-date am-hide-sm-only">剩余数量</th>
                <th width="163px" class="table-set">操作</th>
              </tr>
            </thead>
            
            <!-- 商品列表， 用c:foreach循环 -->
            <tbody>
             <!-- items就是取resquest里面中的对象，然后var就是取一个别名，然后遍历出来 -->
            
           <c:forEach items="${list}" var="i">
              <tr>
                <td><input type="checkbox" /></td>
                <td>${i.id}</td>
                <td>${i.name}</td>
                <td>${i.tname}</td>
                <td>${i.describes}</td>
                <td>${i.exchangeScore}</td>
                <td>${i.number}</td>
                <td><div class="am-btn-toolbar">
                    <div class="am-btn-group am-btn-group-xs">
                    <!-- 查看商品详情 -->
                      <button class="am-btn am-btn-default am-btn-xs am-text-success am-round"><span class="am-icon-search"></span> </button>
                    <!-- 修改商品信息 --> 
                      <a class="am-btn am-btn-default am-btn-xs am-text-secondary am-round" href="${pageContext.request.contextPath}/article/findArticleById?id=${i.id}" ><span class="am-icon-pencil-square-o"></span></a>
                    <!-- 删除商品 --> 
                      <a class="am-btn am-btn-default am-btn-xs am-text-danger am-round" href="${pageContext.request.contextPath}/article/deleteArticleById?id=${i.id}"  ><span class="am-icon-trash-o" onclick="deleteArticle()"></span></a>
                    </div>
                  </div></td>
              </tr>
              </c:forEach>
              
              
              
            </tbody>
          </table>
          
                 <div class="am-btn-group am-btn-group-xs">
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 删除</button>
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-save"></span> 上架</button>
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-save"></span> 下架</button>
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-save"></span> 移动</button>
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 新增</button>
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-save"></span> 保存</button>
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-archive"></span> 移动</button>
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-trash-o"></span> 删除</button>
            </div>
          
          <ul class="am-pagination am-fr">
                <li class="am-disabled"><a href="#">«</a></li>
                <li class="am-active"><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
                <li><a href="#">»</a></li>
              </ul>
          
          
          
      
          <hr />
          <p>注：.....</p>
        </form>
 
 
 
 
 <div class="foods">
  <ul>
    版权所有@2015. 模板收集自 <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> -  More Templates<a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
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
<script src="resource/js/amazeui.min.js"></script>
<!--<![endif]-->
<script type="text/javascript">
	function deleteArticle(){
		 var flag = confirm("确定删除吗?");
         if(flag){
             alert("你点击了确定");
             //进行后台处理,路径跳转
             window.location.href="${pageContext.request.contextPath}/article/deleteArticleById?id=${i.id}";
         }else{
             alert("你点击了取消");
         }
	}

</script>

<script type="text/javascript">
$.ajax({
	//通过get方法
	type:"get",
	//跳转到controller中的findAllTpye方法
	url:'findAllType',
	//查询到数据封装到data当中
	success:function(data){
		//把json对象转换为json字符串
		data=eval(data);
		//foreach把查询的结果遍历出来，用字符串拼接，然后存在str中，用append的方法添加到typeID的select中
		for(item in data){
			var str="<option value="+"\""+data[item].id+"\">"+data[item].name+"</option>";
			$('#typeId').append(str);
		}
 	}		
});
</script>


</body>
</html>