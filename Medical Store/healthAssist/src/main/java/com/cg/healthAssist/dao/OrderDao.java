package com.cg.healthAssist.dao;

/**
 * OrderDao interface consist of methods to be implemented in the Dao implementation class
 * @author Hemalatha S
 */

import java.util.List;

import com.cg.healthAssist.exception.OrderIdNotFoundException;
import com.cg.healthAssist.model.Order;

public interface OrderDao {
	/*
	 * This method will return the list of orders
	 */
	public List<Order> viewOrders();

	/*
	 * This method will remove the order from Order database if the delivery is
	 * done. Also if the order is not available then results in exception
	 */
	public void deliverOrder(long orderId) throws OrderIdNotFoundException;

	/*
	 * This method will show the order details of a particular orderId
	 */
	public Order viewOrderHistory(long orderId);

	/*
	 * This two methods will perform begin and commit transaction
	 */
	void beginTransaction();

	void commitTransaction();

}
