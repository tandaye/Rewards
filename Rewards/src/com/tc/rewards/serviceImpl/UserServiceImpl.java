package com.tc.rewards.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import com.tc.rewards.mapper.UserMapper;
import com.tc.rewards.pojo.User;
import com.tc.rewards.service.UserService;


@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	@Qualifier("userMapper")
	private UserMapper userMapper;
	
	@Override
	public User findUserById(String id) {
		
		User user = userMapper.findUserById(id);
		return user;
 	}

	@Override
	public void deleteUserById(String id) {
		 userMapper.deleteUserById(id);
		
	}

	@Override
	public void insertUserById(User user) {
		userMapper.insertUserById(user);
		}

}
