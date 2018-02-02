package com.tc.rewards.test;

import java.util.List;

import org.junit.Test;  
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;

import com.tc.rewards.expand.ArticleExpand;
import com.tc.rewards.mapper.ArticleMapper;
import com.tc.rewards.mapper.OrdersMapper;
import com.tc.rewards.pojo.Article;
import com.tc.rewards.service.ArticleService;
import com.tc.rewards.service.UserService;
import com.tc.rewards.util.JunitClassRunner;


@RunWith(JunitClassRunner.class)
@ContextConfiguration(locations="classpath:com/tc/rewards/config/applicationContext.xml")

public class ArticleTest {
	
	@Autowired
	@Qualifier("articleService")
	private ArticleService articleService;
	
	@Autowired
	@Qualifier("articleMapper")
	private ArticleMapper articleMapper;
	
	@Test
	public void findArticleById() throws Exception{ 
		Article activities = articleService.findArticleById("1");
		System.err.println(articleService.findArticleById("1").getName());
	}
	
	@Test
	public void insertArticle(){
		Article article = new Article();
		System.err.println("________________________________________________");
		article.setId("11");
		article.setName("циеёеёдл");
		article.setNumber("25");
		article.setTypeId("2");
		article.setExchangeId("1");
		articleService.insertArticleById(article);
		System.out.println(article);
	}
	
	@Test
	public void deleteArticleById(){
		articleService.deleteArticleById("11");
	}
	
	
	@Test
	public void findByMapper(){
		Article article =articleMapper.findArticleById("1");
		System.err.println(article);
	}
	
	
	@Test
	public void findAllArticle(){
		List<Article> articlesList = articleMapper.findAllArticle();
	
		for (Article article : articlesList) {
			System.err.println(article.toString());
		}
	}
	
	@Test
	public void findArticleExpand(){
		List<ArticleExpand> articlesList = articleMapper.findArticleExpand();
		for (ArticleExpand articleExpand : articlesList) {
			System.err.println(articleExpand.toString());
		}
	}
	
	/*@Test
	public void findTypeByOption(){
		
		List<ArticleExpand> articleList = articleMapper.findTypeByOption(article);
		
		for (ArticleExpand articleExpand : articleList) {
			System.out.println(articleExpand.toString());
		}
	}*/
}
