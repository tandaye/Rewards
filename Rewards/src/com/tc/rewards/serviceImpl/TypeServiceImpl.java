package com.tc.rewards.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tc.rewards.mapper.TypeMapper;
import com.tc.rewards.pojo.Type;
import com.tc.rewards.service.TypeService;

@Transactional
public class TypeServiceImpl implements TypeService{

	@Autowired
	@Qualifier("typeMapper")
	private TypeMapper typeMapper;
	
	@Override
	public Type findTypeById(String id) {
		return typeMapper.findTypeById(id);
	}

	@Override
	public void insertTypeById(Type type) {
		typeMapper.insertTypeById(type);
	 }

	@Override
	public List<Type> findAllType() {
		
		return typeMapper.findAllType();
		}

}
