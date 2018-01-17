package com.tc.rewards.controller;

import java.util.ArrayList;
import java.util.List;








import javax.servlet.http.HttpServletRequest; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.mail.iap.Response;
import com.tc.rewards.pojo.Article;
import com.tc.rewards.pojo.Type;
import com.tc.rewards.service.ArticleService;
import com.tc.rewards.service.TypeService;

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
		
		List<Article> articlesList= articleService.findAllArticle();
		//model.addAttribute("list", articlesList);
		request.setAttribute("list", articlesList);
		return "backstage/jsp/article/articleList";	
	}
	
	
	@RequestMapping("/addArticle")
	public String addArticle(HttpServletRequest request,Article articleList){
		
		articleService.insertArticleById(articleList);
		request.setAttribute("articleList", articleList);
		//添加完商品之后，再一次查询article表中的所有内容然后遍历显示出来。
		List<Article> articlesList= articleService.findAllArticle();
		request.setAttribute("list", articlesList);
		
		System.err.println(articleList+"!!!!!!!!!!");
		return "backstage/jsp/article/articleList";
	 }
	
	
	@RequestMapping("/findArticleTest")
	public String findArticleTest(HttpServletRequest request,String id) throws Exception{
		Article article = articleService.findArticleById(id);
		
		request.setAttribute("article", article);
		
		return "backstage/jsp/article11";
	}
	
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
		System.out.println(article2.getName()+"_______________________");
		System.out.println(article2.getTypeId()+"_____________________");
		System.out.println(article2.getDescribes()+"_____________________");
		articleService.updateArticleById(article);
		
		//添加完商品之后，再一次查询article表中的所有内容然后遍历显示出来。
		List<Article> articlesList= articleService.findAllArticle();
		request.setAttribute("list", articlesList);

		return  "backstage/jsp/article/articleList";
	}
	
	//查询出所有Type表中的数据
	@RequestMapping("/findAllType")
	@ResponseBody
	public List<Type> findAllType(){
		List<Type> type=typeService.findAllType();
		return type ;
		
	}
	
	//根据ID删除商品信息
	@RequestMapping("/deleteArticleById")
	public String deleteArticleById(String id){
		articleService.deleteArticleById(id);

		return  "backstage/jsp/article/articleList";
	}
	
}
