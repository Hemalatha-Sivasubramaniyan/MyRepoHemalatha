package com.cg.healthAssist.serviceimpl;

/**
 * The MedicineServiceImpl class will implements the methods in MedicineService
 * @author Hemalatha S
 */


import com.cg.healthAssist.dao.MedicineDao;
import com.cg.healthAssist.daoimpl.MedicineDaoImpl;
import com.cg.healthAssist.model.Medicine;
import com.cg.healthAssist.service.MedicineService;

public class MedicineServiceImpl implements MedicineService {
	/*
	 * Creating the medicineDao as object of MedicineDaoImpl to perform the
	 * respective operation
	 */
	private MedicineDao medicineDao;

	public MedicineServiceImpl() {
		medicineDao = new MedicineDaoImpl();
	}

	/*
	 * Overriding the addMedicine method from MedicineService to pass the values to
	 * Dao layer
	 */
	@Override
	public void addMedicine(Medicine medicine) {
		medicineDao.addMedicine(medicine);
	}

	/*
	 * Overriding the updateMedicine method from MedicineService to pass the values
	 * to Dao layer
	 */
	@Override
	public void updateMedicine(Medicine medicine) {
		medicineDao.updateMedicine( medicine);
	}

	/*
	 * Overriding the removeMedicine method from MedicineService to pass the values
	 * to Dao layer
	 */
	@Override
	public void removeMedicine(long medicineId) {
		medicineDao.removeMedicine(medicineId);
	}

	
	

}
