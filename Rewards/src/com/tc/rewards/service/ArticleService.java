package com.tc.rewards.service;

import java.util.List;

import com.tc.rewards.pojo.Article;


public interface ArticleService {
	
	public Article findArticleById(String id) throws Exception;
	
	public void insertArticleById(Article article);

	public void deleteArticleById(String id);
	
	public List<Article> findAllArticle();

	//�޸���Ʒ��Ϣ
		public void updateArticleById(Article article);
}