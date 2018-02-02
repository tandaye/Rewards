package com.tc.rewards.service;

import java.util.List;

import com.tc.rewards.expand.ArticleExpand;
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
	
	//根据ID查询article表中的内容和关联type表中的类型名
	public List<ArticleExpand> findArticleExpand();
	
	//根据商品类型查询商品信息
	public List<ArticleExpand> findTypeByOption(String typeId);
 
}
