package com.tc.rewards.test;

import org.junit.Test; 

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;

import com.tc.rewards.pojo.Activities;
import com.tc.rewards.service.ActivitiesService;
import com.tc.rewards.service.UserService;
import com.tc.rewards.util.JunitClassRunner;


@RunWith(JunitClassRunner.class)
@ContextConfiguration(locations="classpath:com/tc/rewards/config/applicationContext.xml")

public class ActivitiesTest {
	
	@Autowired
	@Qualifier("activitiesService")
	private ActivitiesService activitiesService;
	
	@Test
	public void findActivitiesById() throws Exception{ 
		Activities activities = activitiesService.findActivitiesById("1");
		System.err.println(activitiesService.findActivitiesById("1").getName());
	}
	
	@Test
	public void insertActivities(){
		Activities activities = new Activities();
		System.err.println("________________________________________________");
		activities.setId("11");
		activities.setName("циеёеёдл");
		activities.setNumber("25");
		activities.setTypeId("2");
		activities.setExchangeId("1");
		activitiesService.insertActivitieseById(activities);
		System.out.println(activities);
	}
	
	@Test
	public void deleteActivitiesById(){
		activitiesService.deleteActivitiesById("11");
	}
	

}
