package com.solvd.laba.army.exceptoins;

public class IncorrectYearException extends IllegalArgumentException{

	public IncorrectYearException() {
		super();
	}

	public IncorrectYearException(String message, Throwable cause) {
		super(message, cause);
	}

	public IncorrectYearException(String message) {
		super(message);
	}

	public IncorrectYearException(Throwable cause) {
		super(cause);
	}
	
}
