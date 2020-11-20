package com.cg.healthAssist.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patients")                        
public class Patient {
	@Id                                              
	private int patientId;
	private String patientName;
	private String gender;
	private int age;
	private String address;
	public Patient(int patientId, String patientName, String gender, int age, String address) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", gender=" + gender + ", age="
				+ age + ", address=" + address + "]";
	}

}
