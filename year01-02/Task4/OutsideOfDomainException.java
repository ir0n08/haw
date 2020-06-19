package de.hawlandshut.calculus;

/**
* <h1>OutsideOfDomainException</h1>
* custom exception
*
* @author  Eisenmann, Paul
* @see paul.eisenmann@prosiebensat1.com
* @see https://github.com/ir0n08/haw/tree/master/year01-02/Task4
* @version 1.0 
* @since   19-06-2020 
*/

public class OutsideOfDomainException extends RuntimeException {
	
	private static final long serialVersionUID = 1337L;

	public OutsideOfDomainException(String message) {
		super(message); 
	}
	
	public OutsideOfDomainException(Throwable cause){ 
		super(cause); 
	}
	
	public OutsideOfDomainException(String message, Throwable cause){
		super(message, cause);
	}
}
