package com.tc.rewards.mapper;

import com.tc.rewards.pojo.Type;

public interface TypeMapper {
	public Type findTypeById(String id);
	
	public void insertTypeById(Type type);
}
