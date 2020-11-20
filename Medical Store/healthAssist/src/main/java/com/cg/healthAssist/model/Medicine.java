package com.cg.healthAssist.model;

/**
 * Creating a class with the table name as medicines to store medicine class attributes in the database
 * @author Hemalatha S
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Using Id and Entity annotation table name and primary key is assigned
 */
@Entity
@Table(name = "medicines")
public class Medicine {
	@Id
	private long medicineId;
	private String medicineName;
	private double price;
	private String expirydate;
	private String companyName;
	private int stock;

	public Medicine() {
		super();
	}

	/*
	 * Parameterized constructor for medicine class
	 */
	public Medicine(long medicineId, String medicineName, double price, String expirydate, String companyName,
			int stock) {
		super();
		this.medicineId = medicineId;
		this.medicineName = medicineName;
		this.price = price;
		this.expirydate = expirydate;
		this.companyName = companyName;
		this.stock = stock;
	}

	/*
	 * Getters and Setters of Medicine class
	 */
	public long getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	/*
	 * Overriding the toString method for return the object in String format
	 */
	@Override
	public String toString() {
		return "Medicine [medicineId=" + medicineId + ", medicineName=" + medicineName + ", price=" + price
				+ ", expirydate=" + expirydate + ", companyName=" + companyName + ", stock=" + stock + "]";
	}

}
