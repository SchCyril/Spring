package fr.dta.exception;

public class EmployeNotFoundException extends RuntimeException{
	private static final long serialVersionUID = -77777L;
	
	public EmployeNotFoundException(String s) {
		super(s);
	}
}
