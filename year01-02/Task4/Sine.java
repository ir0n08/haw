package de.hawlandshut.calculus;

/**
* <h1>Sinus</h1>
* Creates obj with a sin(
*
* @author  Eisenmann, Paul
* @see paul.eisenmann@prosiebensat1.com
* @see https://github.com/ir0n08/haw/tree/master/year01-02/Task4
* @version 1.0 
* @since   19-06-2020 
*/

public class Sine extends RealFunction implements Differentiable {
	
	private double a, f; // setup vars
	
	public Sine(double a, double f) {
		this.a = a;
		this.f = f; // assign them
	}

	@Override
	double evaluateAt(double x) {
		return a * Math.sin(f*x); // return the sin function
	}

	@Override
	boolean inDomain(double x) { 
		return true; // always true
	}
	
	@Override
	public String toString() {
		return String.format("%f*sin(%f*x)", a, f); // return readable string
	}

	@Override
	public RealFunction derive() {
		return new Cosine(a*f,f); // derivation of sin is cos 
	}
	
}
