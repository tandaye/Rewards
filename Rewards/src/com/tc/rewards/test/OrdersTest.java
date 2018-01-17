package com.tc.rewards.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.tc.rewards.mapper.OrdersMapper;
import com.tc.rewards.service.OrdersService;

public class OrdersTest {
	
	@Autowired
	@Qualifier("ordersService")
	private OrdersService ordersService;
	
	@Autowired
	@Qualifier("ordersMapper")
	private OrdersMapper ordersMapper;
	
	@Test
	public void findOrdersById(){
		System.err.println(ordersService.findOrdersById("1"));
		
	}
	
	@Test
	public void findOrdersByMapper(){
		System.out.println(ordersMapper.findOrdersById("1"));
	}
	
}
