package com.cg.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.cg.healthAssist.daoimpl.MedicineDaoImpl;
import com.cg.healthAssist.model.Medicine;

public class MedicineDaoimpltest {

	MedicineDaoImpl medicine = new MedicineDaoImpl();
	Medicine med = new Medicine();
    /*
     * Test for addMedicine method in DaoImpl
     */
	@Test
	public void addMedicineTest() {
		med.setMedicineId(987876);
		med.setMedicineName("abc");
		med.setCompanyName("xyz");
		med.setExpirydate("date");
		med.setStock(765);
		assertNotNull(med.getMedicineId());
	}
    /*
     * Test for removeMedicine method in DaoImpl
     */
	@Test
	public void removeMedicineTest() {
		med.setMedicineId(1234);
		assertEquals(1234, med.getMedicineId());
	}
}
