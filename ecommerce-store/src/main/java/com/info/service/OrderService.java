package com.info.service;

import java.util.List;
import java.util.Optional;

import com.info.model.Order;
import com.info.model.User;

public interface OrderService {

	public void addOrder(Order order);

	public List<Order> listOrder();
	
	public Optional<Order> getOrderById(long productId);
	
	public List<Order> findByUserID(long userID);
	
	public void deleteOrder(long orderID);

}