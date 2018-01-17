package com.tc.rewards.service;

import java.util.List;

import com.tc.rewards.pojo.Type;

public interface TypeService {
	public Type findTypeById(String id);
	
	public void insertTypeById(Type type);
	
	public List<Type> findAllType();
}
