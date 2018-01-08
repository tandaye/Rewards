package com.tc.rewards.controller;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tc.rewards.pojo.User;
import com.tc.rewards.service.UserService;

	
@RequestMapping("/user")
@Controller
public class UserController {
	
	@Autowired
	@Qualifier("userService")
	private UserService userService;
		
	@RequestMapping("/login")
	public String login(HttpServletRequest request, User user) {
 
		if (user != null) {
			request.getSession().setAttribute("user", user);
			request.getSession().setAttribute("userId", user.getId());
			
		}
		request.setAttribute("flag", "2");
		request.setAttribute("msg", "你输入的密码和账户名不匹配 ！");
		return "backstage/jsp/login";
	}
	
}
