package org.except;

public class InvalidDataException extends Exception{
	
	public InvalidDataException() {
		super();
	}
	
	public InvalidDataException(String message) {
		super(message);
	}

}
