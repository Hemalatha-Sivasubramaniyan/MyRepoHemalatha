package com.cg.healthAssist.exception;

public class OrderIdNotFoundException extends RuntimeException{
	/*
	 * If the orderId is not found then this exception will take place and print
	 * the message
	 */
	private static final long serialVersionUID = 1L;

	public OrderIdNotFoundException(String message) {
		super(message);
	}

}
