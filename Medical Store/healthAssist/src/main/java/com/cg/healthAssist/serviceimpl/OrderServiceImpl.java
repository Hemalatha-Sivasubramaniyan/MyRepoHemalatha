package com.cg.healthAssist.serviceimpl;

/**
 * The OrderServiceImpl class will implements the methods in OrderService
 * @author Hemalatha S
 */

import java.util.List;

import com.cg.healthAssist.dao.OrderDao;
import com.cg.healthAssist.daoimpl.OrderDaoImpl;
import com.cg.healthAssist.model.Order;
import com.cg.healthAssist.service.OrderService;

public class OrderServiceImpl implements OrderService {
	/*
	 * Invoking medicineDao to perform the respective operation
	 */
	private OrderDao orderDao;

	public OrderServiceImpl() {
		orderDao = new OrderDaoImpl();
	}

	/*
	 * This method will return the list of orders
	 */
	@Override
	public List<Order> viewOrders() {
		List<Order> orderList = orderDao.viewOrders();
		return orderList;
	}

	/*
	 * This method will remove the order from Order database if the delivery is
	 * done.
	 */
	@Override
	public void deliverOrder(long orderId) {
		orderDao.deliverOrder(orderId);
	}

	/*
	 * This method will show the order details of a particular orderId
	 */
	@Override
	public Order viewOrderHistory(long orderId) {
		Order order;
		order = orderDao.viewOrderHistory(orderId);
		return order;
	}

}
