 package com.tc.rewards.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tc.rewards.mapper.ActivitiesMapper;
import com.tc.rewards.pojo.Activities;
import com.tc.rewards.service.ActivitiesService;

@Transactional
public class ActivitiesServiceImpl implements ActivitiesService {
	
	@Autowired
	@Qualifier("activitiesMapper")
	private ActivitiesMapper activitiesMapper;
	

	@Override
	public Activities findActivitiesById(String id) throws Exception {
		
		Activities activities = activitiesMapper.findActivitiesById(id);
		return activities;
		
		
	}


	@Override
	public void insertActivitieseById(Activities activities) {
		activitiesMapper.insertActivitiesById(activities);
		}


	@Override
	public void deleteActivitiesById(String id) {
		activitiesMapper.deleteActivitiesById(id);
		
	}

}
