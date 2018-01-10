package com.tc.rewards.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tc.rewards.pojo.Activities;
import com.tc.rewards.service.ActivitiesService;

@RequestMapping("/activities")
@Controller
public class ActivitiesController {

	@Autowired
	@Qualifier("activitiesService")
	private ActivitiesService activitiesService;
	
	@RequestMapping("/findActivities")
	public String findActivities(HttpServletRequest request,String id) throws Exception{
		Activities activities = activitiesService.findActivitiesById(id);
		System.err.println(activities.toString()+"____________________________________");
		request.setAttribute("activities", activities);
		
		return "backstage/jsp/index";
	}
	
	
	
}
