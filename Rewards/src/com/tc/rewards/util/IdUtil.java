package com.tc.rewards.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

import sun.misc.BASE64Encoder;


/**
 * 
 * @author TC1016
 *  对密码进行MD5加密
 */
public class IdUtil {
	
	//获得一个随机数字ID
	public static String dateId(){
		SimpleDateFormat sdf =new SimpleDateFormat("yyyyMMddHHmm");
		String str = sdf.format(new Date());
		int max=20000;
        int min=10000;
        Random random = new Random();
     
        int s = random.nextInt(max)%(max-min+1) + min; 
        String id= str+s;
		  
		return id;
	}

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
