package de.hawlandshut.calculus;

/**
* <h1>Exponentional</h1>
* Form of x^b
*
* @author  Eisenmann, Paul
* @see paul.eisenmann@prosiebensat1.com
* @see https://github.com/ir0n08/haw/tree/master/year01-02/Task4
* @version 1.0 
* @since   19-06-2020 
*/

public class Exp extends RealFunction implements Differentiable {
	
	@Override
	double evaluateAt(double x) {
		return Math.exp(x); // return the function at point x
	}

	@Override
	boolean inDomain(double x) {
		return true; // allways true
	}
	
	@Override 
	public String toString() {
		return String.format("e^x"); // boring string format
	}

	@Override
	public RealFunction derive() {
		return new Exp(); // the derivation is just a new exponentional func
	}

}
