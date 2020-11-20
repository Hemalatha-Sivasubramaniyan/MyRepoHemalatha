package com.cg.healthAssist.dao;
/**
 * MedicineDao interface consist of methods to be implemented in the Dao implementation class
 * @author Hemalatha S
 */


import com.cg.healthAssist.exception.MedicineIdNotFoundException;
import com.cg.healthAssist.model.Medicine;

public interface MedicineDao {
	/*
	 * This method will perform add operation in the database
	 */
	public void addMedicine(Medicine medicine);
	/*
	 * This method will perform update operation in the database
	 */
	public void updateMedicine(Medicine medicine)throws MedicineIdNotFoundException;
	/*
	 * This method will perform remove operation in the database
	 */
	public void removeMedicine(long medicineId)throws MedicineIdNotFoundException;
	/*
	 * This method will begin the transaction
	 */
	void beginTransaction();
	/*
	 * This method will commit the transaction
	 */
	void commitTransaction();

}
