package com.tc.rewards.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tc.rewards.pojo.Article;
import com.tc.rewards.service.ArticleService;



@Controller
@RequestMapping("detail")
public class DetailController {
	
	@Autowired
	@Qualifier("articleService")
	private ArticleService articleService;
	
	
	

	@RequestMapping("/articleDetail")
	public String articleDetail(HttpServletRequest request,String id) throws Exception{
		
		Article article = articleService.findArticleById(id);
		request.setAttribute("article", article);
		
		 return "frontstage/checkout";
	}
	
	@RequestMapping("/OrderGeneration")
	//¶©µ¥Éú³É
	public String OrderGeneration(String cmbProvince,String cmbCity,String cmbArea){
		System.err.println("______________________________________________");
		System.out.println(cmbProvince);
		System.out.println(cmbCity);
		System.out.println(cmbArea);
		return"frontstage/products";
	}
}
