package com.cg.healthAssist.service;
/**
 * Interface of Order Service which consist of methods to be implemented in implementation class
 * @author Hemalatha S
 */

import java.util.List;

import com.cg.healthAssist.model.Order;

public interface OrderService {
	/*
	 * This method will return the list of orders
	 */
	public List<Order> viewOrders();
	/*
	 * This method will remove the order from Order database if the delivery is
	 * done.
	 */
	public void deliverOrder(long orderId);
	/*
	 * This method will show the order details of a particular orderId
	 */
	public Order viewOrderHistory(long orderId);

}
