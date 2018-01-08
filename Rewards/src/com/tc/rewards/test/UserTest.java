package com.tc.rewards.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tc.rewards.pojo.User;
import com.tc.rewards.service.UserService;
import com.tc.rewards.util.JunitClassRunner;


@RunWith(JunitClassRunner.class)
@ContextConfiguration(locations="classpath:com/tc/rewards/config/applicationContext.xml")
public class UserTest {

	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@Test
	public void findUserById(){ 
		User user = userService.findUserById("001");
		System.err.println(userService.findUserById("001"));
	}

	
	@Test
	public void insertUser(){
		User user = new User();
		user.setId("3");
		user.setName("ÍõÏþ½Ü");
		user.setAge("22");
		user.setSex("ÄÐ");
		user.setPassword("123123");
		userService.insertUserById(user);
		System.err.println(user);
	}
	
}
