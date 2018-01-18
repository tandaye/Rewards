package com.tc.rewards.service;

import java.util.List;

import com.tc.rewards.pojo.Article;


public interface ArticleService {
	
	public Article findArticleById(String id) throws Exception;
	
	public void insertArticleById(Article article);

	public void deleteArticleById(String id);
	
	public List<Article> findAllArticle();

	//修改商品信息
		public void updateArticleById(Article article);
		
	//根据商品ID查询商品类型
	public void findTypeById(String id);
}
