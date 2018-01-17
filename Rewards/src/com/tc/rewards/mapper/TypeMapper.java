package com.tc.rewards.mapper;

import java.util.List;

import com.tc.rewards.pojo.Type;

public interface TypeMapper {
	public Type findTypeById(String id);
	
	public void insertTypeById(Type type);
	
	public List<Type> findAllType();
}
