package com.cg.healthAssist.exception;

public class MedicineIdNotFoundException extends RuntimeException {
	/*
	 * If the medicineId is not found then this exception will take place and print
	 * the message
	 */
	private static final long serialVersionUID = 1L;

	public MedicineIdNotFoundException(String message) {
		super(message);
	}

}
