package com.tc.rewards.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
	public String login(HttpServletRequest request, User user1) {
		

		User user = userService.checkLogin(user1);
		
		if (user!= null) {
			request.getSession().setAttribute("user", user);
			request.getSession().setAttribute("userId", user.getId());
			return "backstage/jsp/success";
		}
		request.setAttribute("flag", "2");
		request.setAttribute("msg", "你输入的密码和账户名不匹配 ！");
		return "backstage/jsp/error";
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));
	}
	
}
