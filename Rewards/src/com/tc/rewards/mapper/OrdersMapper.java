package com.tc.rewards.mapper;

import com.tc.rewards.pojo.Orders;

public interface OrdersMapper {

		public Orders findOrdersById(String id);
		
		public String insertOrdersById(Orders orders);

}
