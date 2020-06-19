package de.hawlandshut.calculus;

/**
* <h1>DiffExecption</h1>
* Custom exception
*
* @author  Eisenmann, Paul
* @see paul.eisenmann@prosiebensat1.com
* @see https://github.com/ir0n08/haw/tree/master/year01-02/Task4
* @version 1.0 
* @since   19-06-2020 
*/

public class DiffException extends Exception {
	
	private static final long serialVersionUID = 42L;

	public DiffException(String message) {
		super(message); 
	}
	
	public DiffException(Throwable cause){ 
		super(cause); 
	}
	
	public DiffException(String message, Throwable cause){
		super(message, cause);
	}
}
