package com.tc.rewards.service;

import com.tc.rewards.pojo.User;

public interface UserService {
	
	  /*��ѯ�û�*/
	  public User findUserById(String id);
	  /*ɾ���û�*/
	  public void deleteUserById(String id);
	  /*�����û�*/
	  public void insertUserById(User user);
}