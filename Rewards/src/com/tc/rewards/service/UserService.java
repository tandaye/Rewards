package com.tc.rewards.service;

import com.tc.rewards.pojo.User;

public interface UserService {
	
	  /*查询用户*/
	  public User findUserById(String id);
	  /*删除用户*/
	  public void deleteUserById(String id);
	  /*增加用户*/
	  public void insertUserById(User user);
}
