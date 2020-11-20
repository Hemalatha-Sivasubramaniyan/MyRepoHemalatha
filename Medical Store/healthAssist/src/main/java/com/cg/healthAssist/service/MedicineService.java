package com.cg.healthAssist.service;

/**
 *Interface of Medicine Service which consist of methods to be implemented in implementation class
 * @author Hemalatha S
 */


import com.cg.healthAssist.model.Medicine;

public interface MedicineService {
	/*
	 * This method will perform adding operation in the medicine database
	 */
	public void addMedicine(Medicine medicine);

	/*
	 * This method will perform updation process in the medicine database
	 */
	public void updateMedicine( Medicine medicine);

	/*
	 * This method will perform remove operation in the medicine database
	 */
	public void removeMedicine(long medicineId);

	

}
