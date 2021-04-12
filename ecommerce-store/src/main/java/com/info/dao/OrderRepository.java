package com.info.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.info.model.Order;

@Repository 
public interface OrderRepository extends JpaRepository{
	public List<Order> findByUser_UserID(long userID);
}
