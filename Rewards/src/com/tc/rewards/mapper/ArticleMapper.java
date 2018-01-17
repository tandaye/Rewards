package com.tc.rewards.mapper;

import java.util.List;

import com.tc.rewards.pojo.Article;

public interface ArticleMapper {
	
	public Article findArticleById(String id);
	
	public void insertArticleById(Article article);

	public void deleteArticleById(String id);
	//查询所有商品信息
	public List<Article> findAllArticle();
	//修改商品信息
	public void updateArticleById(Article article);

}
