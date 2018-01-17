package com.tc.rewards.mapper;

import java.util.List;

import com.tc.rewards.pojo.Article;

public interface ArticleMapper {
	
	public Article findArticleById(String id);
	
	public void insertArticleById(Article article);

	public void deleteArticleById(String id);
	//��ѯ������Ʒ��Ϣ
	public List<Article> findAllArticle();
	//�޸���Ʒ��Ϣ
	public void updateArticleById(Article article);

}