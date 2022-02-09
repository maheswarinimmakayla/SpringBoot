package com.mouritech.springbootandhibernateexample.exception;

public class ProductNameAlreadyExistsException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;

	public ProductNameAlreadyExistsException(String message) {
		super(message);
		this.message = message;
	}
}
