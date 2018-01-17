package com.tc.rewards.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;




import javax.validation.constraints.Null;

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
		
		System.err.println(user1.toString()+"________________________");
		User user = userService.checkLogin(user1);
		
		if (user!= null) {
			request.getSession().setAttribute("user", user);
			request.getSession().setAttribute("userId", user.getId());
			request.getSession().setAttribute("roleId", user.getRoleId());
			if((user.getRoleId())!=null && (user.getRoleId()).equals("2")){
				//跳转到后台的主页
				return "backstage/jsp/index";
			}
			else{
				System.err.println(user.getRoleId()+"________________________");
				//暂时跳转到登录成功页面，等写好前台以后就跳转到主页
				return "frontstage/success";
		  	}
		 }
		request.setAttribute("flag", "2");
		request.setAttribute("msg", "你输入的密码和账户名不匹配 ！");
		return "frontstage/error";
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));
	}
	
}
