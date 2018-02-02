package com.tc.rewards.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;













import java.util.UUID;

import javax.servlet.http.HttpServletRequest; 

import net.sf.json.JSONArray;

import org.apache.http.protocol.HTTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.sun.mail.iap.Response;
import com.tc.rewards.expand.ArticleExpand;
import com.tc.rewards.pojo.Article;
import com.tc.rewards.pojo.Type;
import com.tc.rewards.service.ArticleService;
import com.tc.rewards.service.TypeService;
import com.tc.rewards.util.IdUtil;

@RequestMapping("/article")
@Controller
public class ArticleController {

	@Autowired
	@Qualifier("articleService")
	private ArticleService articleService;
	
	@Autowired
	@Qualifier("typeService")
	private TypeService typeService;
	
	@RequestMapping("/findArticle")
	public String findArticle(HttpServletRequest request,String id) throws Exception{
		Article article = articleService.findArticleById(id);
		System.err.println(article.toString()+"____________________________________");
		request.setAttribute("article", article);
		
		return "backstage/jsp/article";
	}
	
	@RequestMapping("/toAddNewArticle")
	public String toAddNewArticle(){
		return "backstage/jsp/article/addNewArticle";
	}
	
	//查询所有商品并显示在后台列表中
	@RequestMapping("/toArticleList")
	public String toArticleList(HttpServletRequest request,Model model){
		
		//List<Article> articlesList= articleService.findAllArticle();
		//model.addAttribute("list", articlesList);
		List<ArticleExpand> articlesList=articleService.findArticleExpand();

		request.setAttribute("list", articlesList);
		return "backstage/jsp/article/articleList";	
	}
	
	
	@RequestMapping("/addArticle")
	public String addArticle(HttpServletRequest request,@Validated Article articleList,MultipartFile articleImg) throws IllegalStateException, IOException{
		
		Article article = articleList;
		article.setId(IdUtil.dateId());

		
		// MultipartFile pic用来接收客户图片
	/*	if (!articleImg.isEmpty()) {
			 // 上传文件路径  
			String uploadPath = request.getSession().getServletContext().getRealPath("/upload");
			String fileName=articleImg.getOriginalFilename();
			String newFileName=UUID.randomUUID()+
					fileName.substring(
					fileName.lastIndexOf("."));
			String path=uploadPath+File.separator;
			File newFile=new File(path+newFileName);
			articleImg.transferTo(newFile);
			article.setImage(newFileName);
		}*/

		
		//上传图片
		if(articleImg!=null){
			
			//String path="resource/articleImg/articleImg/";
			//存放图片的物理地址
			String pic_path = request.getSession().getServletContext().getRealPath("resource/articleImg/12/");
			//String pic_path = "H:/apache-tomcat-7.0.73/webapps/Rewards/resource/articleImg/";
			//获得图片的原始名称
			String  originalFilename = articleImg.getOriginalFilename();
			//改个新名字
			String newFilename = UUID.randomUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
			
			File newFile = new File(pic_path + newFilename);
			
			articleImg.transferTo(newFile);
			
			
			article.setImage(newFilename);
		}
		
		articleService.insertArticleById(article);
		request.setAttribute("articleList", article);
		
		//添加完商品之后，再一次查询article表中的所有内容然后遍历显示出来。
		List<ArticleExpand> articlesList=articleService.findArticleExpand();
		request.setAttribute("list", articlesList);
		
		
		return "backstage/jsp/article/articleList";
	 }
	
	
/*	@RequestMapping("/findArticleTest")
	public String findArticleTest(HttpServletRequest request,String id) throws Exception{
		Article article = articleService.findArticleById(id);
		
		request.setAttribute("article", article);
		
		return "backstage/jsp/article11";
	}*/
	
	//根据id查询商品信息，用于商品修改时回显
	@RequestMapping("/findArticleById")
	public String findArticleById(HttpServletRequest request,Article article) throws Exception{
		//System.err.println("_________________________________________");
		Article article2 =articleService.findArticleById(article.getId());
	
		request.setAttribute("article2", article2);
		return "backstage/jsp/article/updateArticle";
	}
	
	//商品回显后，把数据传回后修改
	@RequestMapping("/updateArticleById")
	public String updateArticleById(Article article,HttpServletRequest request){
		Article article2 = article;
		articleService.updateArticleById(article);
		
		//添加完商品之后，再一次查询article表中的所有内容然后遍历显示出来。
		List<ArticleExpand> articlesList=articleService.findArticleExpand();
		request.setAttribute("list", articlesList);

		return  "backstage/jsp/article/articleList";
	}
	
	//查询出所有Type表中的数据
	@RequestMapping("/findAllType")
	@ResponseBody
	public String findAllType(){
		//查询type中所有的内容存到type集合当中
		List<Type> type=typeService.findAllType();
		//实例化一个json对象
		JSONArray jsonArray = new JSONArray();
		//将list集合添加到json容器当中
		jsonArray.addAll(type);
		//返回转化好的json对象
		return jsonArray.toString() ;
	}
	//根据ID删除商品信息
	@RequestMapping("/deleteArticleById")
	public String deleteArticleById(String id){
		articleService.deleteArticleById(id);

		return  "backstage/jsp/article/articleList";
	}
	
	@RequestMapping("/toArticleClassify")
	//跳转到商品商品分类页
	public String  toArticleClassify(){
		
		return "backstage/jsp/article/articleClassify";
	}
	
	@RequestMapping("/findTypeByOption")
	public String findTypeByOption(HttpServletRequest request,String typeId){
		System.err.println(typeId+"________________________________");
		List<ArticleExpand> articleExpand =articleService.findTypeByOption(typeId);
		request.setAttribute("lists", articleExpand);
		return  "backstage/jsp/article/articleClassify";	
	}
	
	
	//打开前台的商品页面
	@RequestMapping("/findArticleList")
	public String findArticleList(HttpServletRequest request){
		
		List<ArticleExpand> articlesList=articleService.findArticleExpand();
		request.setAttribute("articlesList", articlesList);
		
		return "frontstage/products";
	}
	
	@RequestMapping("/toArticleDetail")
	public String toArticleDetail(HttpServletRequest request,ArticleExpand articleExpand){
		List<ArticleExpand> articleExpands = articleService.findArticleExpand();
		return "frontstage/checkout";
	}
}
