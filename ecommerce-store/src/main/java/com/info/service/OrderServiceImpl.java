package com.info.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.dao.OrderRepository;
import com.info.model.Order;
import com.info.model.User;

@Service
@Transactional
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void addOrder(Order order)
	{
		orderRepository.save(order);
	};
	@Override
	public List<Order> listOrder(){
		return orderRepository.findAll();
	}
	@Override
	public Optional<Order> getOrderById(long orderID){
		return orderRepository.findById(orderID);
	}
	@Override
	public List<Order> findByUserID(long userID){
		return orderRepository.findByUser_UserID(userID);
	}
	@Override
	public void deleteOrder(long orderID){
		orderRepository.deleteById(orderID);
	}
}
