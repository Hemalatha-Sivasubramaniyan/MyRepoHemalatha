package com.cg.healthAssist.util;

/**
 * @author Hemalatha S
 */

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	/*
	 * Creating EntityManager and EntityManagerFactory
	 */
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManger;
	static {
		entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
	}

	/*
	 * The getEntityManager method will invoke the entityManager if it is equal to
	 * null or not in the open state.
	 */
	public static EntityManager getEntityManager() {
		if (entityManger == null || !entityManger.isOpen()) {
			entityManger = entityManagerFactory.createEntityManager();
		}
		return entityManger;
	}

}
