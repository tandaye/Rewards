package com.tc.rewards.mapper;

import com.tc.rewards.pojo.Activities;

public interface ActivitiesMapper {
	
	public Activities findActivitiesById(String id);
	
	public void insertActivitiesById(Activities activities);

	public void deleteActivitiesById(String id);
}
