package com.tc.rewards.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;

import com.tc.rewards.service.TypeService;
import com.tc.rewards.util.JunitClassRunner;


@RunWith(JunitClassRunner.class)
@ContextConfiguration(locations="classpath:com/tc/rewards/config/applicationContext.xml")
public class TypeTest {
	
	@Autowired
	@Qualifier("typeService")
	private TypeService typeService;
		
	
	@Test
	public void findType(){
		typeService.findTypeById("1");
		System.err.println(typeService.findTypeById("1"));	
	}
}
