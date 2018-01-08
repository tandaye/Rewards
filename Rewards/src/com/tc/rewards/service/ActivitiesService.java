package com.tc.rewards.service;

import com.tc.rewards.pojo.Activities;


public interface ActivitiesService {
	
	public Activities findActivitiesById(String id) throws Exception;
	
	public void insertActivitieseById(Activities activities);

	public void deleteActivitiesById(String id);
}
