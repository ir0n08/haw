package de.hawlandshut.calculus;

/**
* <h1>Constant</h1>
* Creates an obj of a constant
*
* @author  Eisenmann, Paul
* @see paul.eisenmann@prosiebensat1.com
* @see https://github.com/ir0n08/haw/tree/master/year01-02/Task4
* @version 1.0 
* @since   19-06-2020 
*/

public class Constant extends RealFunction implements Differentiable {
	
	private final double c; // the constructer value
	
	public Constant(double x) {
		this.c = x; // assagin input value
	}

	@Override
	public double evaluateAt(double x) {
		return c; // a constant is always constant
	}

	@Override
	public boolean inDomain(double c) {
		return true; // and its always in the domain
	}
	
	@Override
	public String toString() {
		return String.format("%f", c); // return input vaule as it is
	}

	@Override
	public RealFunction derive() {
		return new Constant(0); // the derivation of a constant is always 0
	}

}
