package com.cg.healthAssist.model;

/**
 * Creating a class with the table name as orders to store Order class attributes in the database
 * @author Hemalatha S
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Using Id and Entity annotation table name and primary key is assigned
 */
@Entity
@Table(name = "orders")
public class Order {
	@Id
	private long orderId;
	private long patientId;
	private String medicineName;
	private int quantity;

	/*
	 * Parameterized constructor for Order class
	 */
	public Order(long orderId, long patientId, String medicineName, int quantity) {
		super();
		this.orderId = orderId;
		this.patientId = patientId;
		this.medicineName = medicineName;
		this.quantity = quantity;
	}

	public Order() {
		super();
	}

	/*
	 * Getters and Setters of Order class
	 */
	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/*
	 * Overriding the toString method for return the object in String format
	 */
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", patientId=" + patientId + ", medicineName=" + medicineName
				+ ", quantity=" + quantity + "]";
	}

}
