package com.info.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="order")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long orderId;

	@Column(nullable = false)
	private long userID;

	@Column(nullable = false)
	private int quantity;

	@Column(nullable = false)
	private int cost;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;
	
	public Order() 
	{
	 userID = -1;
	 quantity = 0;
	 cost = 0;
	}
	
	public void setUser(User user)
	{
		this.user = user;
	}
	
	public void setUserID(long userID)
	{
		this.userID = userID;
	}
	
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	
	public void setCost(int cost)
	{
		this.cost = cost;
	}
	
	public long getUserID()
	{
		return userID;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public int getCost()
	{
		return cost;
	}
	
	public User getUser()
	{
		return user;
	}
	
	
}
