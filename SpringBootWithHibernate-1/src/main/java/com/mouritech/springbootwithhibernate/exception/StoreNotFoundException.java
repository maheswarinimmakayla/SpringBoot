package com.mouritech.springbootwithhibernate.exception;

public class StoreNotFoundException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public  StoreNotFoundException(String msg) {
		super(msg);
	}

}
