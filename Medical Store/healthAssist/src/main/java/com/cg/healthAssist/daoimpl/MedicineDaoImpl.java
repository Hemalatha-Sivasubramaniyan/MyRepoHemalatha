package com.cg.healthAssist.daoimpl;

/**
 * Implementation class of MedicineDao
 * @author Hemalatha S
 */


import javax.persistence.EntityManager;

import com.cg.healthAssist.dao.MedicineDao;
import com.cg.healthAssist.exception.MedicineIdNotFoundException;
import com.cg.healthAssist.model.Medicine;
import com.cg.healthAssist.util.JPAUtil;

public class MedicineDaoImpl implements MedicineDao {
	/*
	 * Creating EntityManager instance to perform the ORM operations
	 */
	private EntityManager entityManager;

	public MedicineDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	/*
	 * This overridden method will perform the add operation in the database by
	 * using begin() and commit() for transaction
	 */
	@Override
	public void addMedicine(Medicine medicine) {
		entityManager.getTransaction().begin();
		entityManager.persist(medicine);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	/*
	 * This overridden method will perform the update operation in the database by
	 * using begin() and commit() for transaction. If the id is not found then it
	 * will return MedicineIdNotFoundException
	 */
	@Override
	public void updateMedicine (Medicine medicine) {
		entityManager.getTransaction().begin();
		Medicine medicine1 = entityManager.find(Medicine.class, medicine.getMedicineId());
		if (medicine1 != null) {
			entityManager.merge(medicine1);
		} else {
			throw new MedicineIdNotFoundException("Medicine Id is not found");
		}
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	/*
	 * This overridden method will perform the remove operation in the database by
	 * using begin() and commit() for transaction. If the id is not found then it
	 * will return MedicineIdNotFoundException
	 */
	@Override
	public void removeMedicine(long medicineId) {
		entityManager.getTransaction().begin();
		Medicine medicine = entityManager.find(Medicine.class, medicineId);
		if (medicine != null) {
			entityManager.remove(medicine);
		} else {
			throw new MedicineIdNotFoundException("Medicine Id is not found");
		}
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	

	/*
	 * This method will begin the transaction
	 */
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();

	}

	/*
	 * This method will commit the transaction
	 */
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();

	}

}
