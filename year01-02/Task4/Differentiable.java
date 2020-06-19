package de.hawlandshut.calculus;

/**
* <h1>Differentiable</h1>
* Create interface
*
* @author  Eisenmann, Paul
* @see paul.eisenmann@prosiebensat1.com
* @see https://github.com/ir0n08/haw/tree/master/year01-02/Task4
* @version 1.0 
* @since   19-06-2020 
*/

public interface Differentiable {
	RealFunction derive() throws DiffException;	
}
