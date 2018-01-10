package com.tc.rewards.mapper;

import com.tc.rewards.pojo.User;

public interface UserMapper {
	
	  /*查询用户*/
	  public User findUserById(String id);
	  /*删除用户*/
	  public void deleteUserById(String id);
	  /*增加用户*/
	  public void insertUserById(User user);
	  
	 
	  
	// 通过用户名进行查询
	public User findByName(User user);
		
	
}
