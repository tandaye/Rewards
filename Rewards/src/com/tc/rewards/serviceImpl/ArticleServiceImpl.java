 package com.tc.rewards.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tc.rewards.expand.ArticleExpand;
import com.tc.rewards.mapper.ArticleMapper;
import com.tc.rewards.pojo.Article;
import com.tc.rewards.service.ArticleService;
@Transactional
public class ArticleServiceImpl implements ArticleService {
	
	@Autowired
	@Qualifier("articleMapper")
	private ArticleMapper articleMapper;
	

	@Override
	public Article findArticleById(String id) {
		Article article = articleMapper.findArticleById(id);
		return article;
	}



	@Override
	public void insertArticleById(Article article) {
		articleMapper.insertArticleById(article);
	}


	@Override
	public void deleteArticleById(String id) {
		articleMapper.deleteArticleById(id);
	}



	@Override
	public List<Article> findAllArticle() {
		
		return articleMapper.findAllArticle();
	}


	//修改信息
	@Override
	public void updateArticleById(Article article) {
		articleMapper.updateArticleById(article);
	}


	//根据商品id查询商品类型
	@Override
	public void findTypeById(String id) {
		articleMapper.findTypeById(id);
		
	}



	@Override
	public List<ArticleExpand> findArticleExpand() {
		
		return articleMapper.findArticleExpand();
	}



	@Override
	public List<ArticleExpand> findTypeByOption(String typeId){
		
		return articleMapper.findTypeByOption(typeId);
	}



 

}
