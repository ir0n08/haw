package de.hawlandshut.calculus;

/**
* <h1>Cosine</h1>
* Creates an obj of a cos
*
* @author  Eisenmann, Paul
* @see paul.eisenmann@prosiebensat1.com
* @see https://github.com/ir0n08/haw/tree/master/year01-02/Task4
* @version 1.0 
* @since   19-06-2020 
*/

public class Cosine extends RealFunction implements Differentiable {
	
	private final double a, f; // the constructor varibales
	
	public Cosine(double a, double f) {
		this.a = a; // assign them
		this.f = f;
	}

	@Override
	double evaluateAt(double x) {
		return a * Math.cos(f*x); // basic cos func a * cos(f*x)
	}

	@Override
	boolean inDomain(double x) {
		return true; // is always in domain
	}
	
	@Override
	public String toString() {
		return String.format("%f*cos(%f*x)", a, f); // return in given format
	}

	@Override
	public RealFunction derive() {
		return new Sine(-a*f,f); // the derive of a cos is -sin
	}
}
