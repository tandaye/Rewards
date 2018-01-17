package com.tc.rewards.service;

import com.tc.rewards.pojo.Orders;

public interface OrdersService {


	public Orders findOrdersById(String id);
	
	public String insertOrdersById(Orders orders);
}
