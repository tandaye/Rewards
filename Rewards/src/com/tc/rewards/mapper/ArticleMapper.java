package com.tc.rewards.mapper;

import java.util.List;

import com.tc.rewards.expand.ArticleExpand;
import com.tc.rewards.pojo.Article;

public interface ArticleMapper {
	
	public Article findArticleById(String id);
	
	public void insertArticleById(Article article);

	public void deleteArticleById(String id);
	//查询所有商品信息
	public List<Article> findAllArticle();
	
	//修改商品信息
	public void updateArticleById(Article article);
	
	//根据商品ID查询商品类型
	public void findTypeById(String id);
	
	//根据ID查询article表中的内容和关联type表中的类型名
	public List<ArticleExpand> findArticleExpand();
	
	//根据商品类型查询商品信息
	public List<ArticleExpand> findTypeByOption(String id);
 
}
