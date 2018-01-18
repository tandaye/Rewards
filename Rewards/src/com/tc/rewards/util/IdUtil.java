package com.tc.rewards.util;

import java.security.MessageDigest;

import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import sun.misc.BASE64Encoder;


/**
 * 
 * @author TC1016
 *  对密码进行MD5加密
 */
public class IdUtil {
	//获得一个随机的ID
	public static String getUUID(){
		return UUID.randomUUID().toString();
	}
	
	//MD5加密
	public static String md5(String password){
		String key="block_data";
		password+=key;
		MessageDigest md=null;
		
		try {
			md=MessageDigest.getInstance("md5");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BASE64Encoder en = new BASE64Encoder();
		return en.encode(md.digest(password.getBytes()));
	}
}
