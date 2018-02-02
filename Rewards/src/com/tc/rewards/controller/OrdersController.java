package com.tc.rewards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tc.rewards.service.OrdersService;

@Controller
@RequestMapping("/orders")
public class OrdersController {
	
	@Autowired
	@Qualifier("ordersService")
	private OrdersService ordersService;
	
	public String findAllOrders(){
	
		
		return null;
		
	}
	
	@RequestMapping("/toOrder")
	//跳转到订单页面
	public String toOrder(){
		
		return "frontstage/checkout";
	}
	
	
	
	
}
