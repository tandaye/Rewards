package com.tc.rewards.mapper;

import com.tc.rewards.pojo.User;

public interface UserMapper {
	
	  /*��ѯ�û�*/
	  public User findUserById(String id);
	  /*ɾ���û�*/
	  public void deleteUserById(String id);
	  /*�����û�*/
	  public void insertUserById(User user);
	  
}