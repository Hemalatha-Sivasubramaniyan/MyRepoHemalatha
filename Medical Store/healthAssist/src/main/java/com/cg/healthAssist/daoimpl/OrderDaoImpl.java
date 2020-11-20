package com.cg.healthAssist.daoimpl;
/**
 * Implementation class of OrderDao
 * @author Hemalatha S
 */
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.cg.healthAssist.dao.OrderDao;
import com.cg.healthAssist.exception.MedicineIdNotFoundException;
import com.cg.healthAssist.model.Order;
import com.cg.healthAssist.util.JPAUtil;

public class OrderDaoImpl implements OrderDao {
	/*
	 * Creating EntityManager instance to perform the ORM operations
	 */
	private EntityManager entityManager;

	public OrderDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	/*
	 * This method will return the list of orders
	 */
	@Override
	public List<Order> viewOrders() {
		entityManager.getTransaction().begin();
		List<Order> orderList = entityManager.createQuery("Select order From Order order", Order.class).getResultList();
		entityManager.getTransaction().commit();
		entityManager.close();
		return orderList;
	}

	/*
	 * This method will remove the order from Order database if the delivery is
	 * done. Also if the order is not available then results in exception
	 */
	@Override
	public void deliverOrder(long orderId) {
		entityManager.getTransaction().begin();
		Order order1 = entityManager.find(Order.class, orderId);
		if (order1 != null) {
			entityManager.remove(order1);
		} else {
			throw new MedicineIdNotFoundException("Medicine Id is not found");
		}
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	/*
	 * This method will show the order details of a particular orderId
	 */
	@Override
	public Order viewOrderHistory(long orderId) {
		entityManager.getTransaction().begin();
		Order order;
		Query query = entityManager.createQuery("Select order from Order order where order.orderId=orderid",
				Order.class);
		order = (Order) query.getSingleResult();
		entityManager.getTransaction().commit();
		entityManager.close();
		return order;
	}

	/*
	 * This two methods will perform begin and commit transaction
	 */
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();

	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();

	}

}
