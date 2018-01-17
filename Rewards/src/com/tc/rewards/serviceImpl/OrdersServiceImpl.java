package com.tc.rewards.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import com.tc.rewards.mapper.OrdersMapper;
import com.tc.rewards.pojo.Orders;
import com.tc.rewards.service.OrdersService;

@Transactional
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	@Qualifier("ordersMapper")
	private OrdersMapper ordersMapper;
	
	public Orders findOrdersById(String id){
		Orders orders = ordersMapper.findOrdersById(id);
		return orders;
	}

	@Override
	public String insertOrdersById(Orders orders) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
