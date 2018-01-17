package com.tc.rewards.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import com.tc.rewards.mapper.UserMapper;
import com.tc.rewards.pojo.User;
import com.tc.rewards.service.UserService;
import com.tc.rewards.util.IdUtil;
import com.tc.rewards.util.SecurityUtil;


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

/*	@Override
	// 验证用户名密码
	  登陆验证 
    public User checkLogin(String name, String password) {
        //根据用户名实例化用户对象
        //User user = userMapper.findByUserNameAndPassword(name, password);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }*/

	@Override
	public User checkLogin(User user) {
		User user2 =userMapper.findByName(user);
		System.out.println(user2.toString()+"1111111111111111111111");
		//String psw =IdUtil.md5(user.getPassword());
		
		if(user2!=null && (user.getPassword()).equals(user2.getPassword())){
			System.err.println("登录成功！");
			return user2;
		}
		
		return null;
	}

	
}
