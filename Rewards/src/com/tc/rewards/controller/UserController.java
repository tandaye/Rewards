package com.tc.rewards.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;




import javax.validation.constraints.Null;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tc.rewards.expand.ArticleExpand;
import com.tc.rewards.expand.UserExpand;
import com.tc.rewards.pojo.User;
import com.tc.rewards.service.ArticleService;
import com.tc.rewards.service.UserService;

	
@RequestMapping("/user")
@Controller
public class UserController {
	
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@Autowired
	@Qualifier("articleService")
	private ArticleService articleService;
		
	@RequestMapping("/login")
	public String login(HttpServletRequest request, User user1) {
		
		System.err.println(user1.toString()+"________________________");
		User user = userService.checkLogin(user1);
		
		if (user!= null) {
			request.getSession().setAttribute("user", user);
			request.getSession().setAttribute("userId", user.getId());
			request.getSession().setAttribute("roleId", user.getRoleId());
			//判断用户权限是否为空，是不是后台管理员
			if((user.getRoleId())!=null && (user.getRoleId()).equals("2")){
				User user2 = userService.findUserById(user.getId());
				request.setAttribute("name", user2);
				//跳转到后台的主页
				return "backstage/jsp/index";
			}
			else{
				
				return "frontstage/index";
		  	}
		 }
 
		return "frontstage/error";
	}
	
	@RequestMapping("/loginOut")
	public String loginOut(){
		
		
		return "index.jsp";	
	}
	
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));
	}
	
	@RequestMapping("/toMemberList")
	public String toMemberList(){ 
		return "backstage/jsp/members/memberList";
	}
	
	@RequestMapping("/findAllMember")
	public String findAllMember(HttpServletRequest request){
		List<UserExpand> UserExpand =  userService.findAllUsers();
		request.setAttribute("userList", UserExpand);
		return "backstage/jsp/members/memberList";
	}
	
}
