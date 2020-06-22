package de.hawlandshut.calculus;

/**
* <h1>CubicPolynomial</h1>
* Functions in the form: ax3+bx2+cx+d
*
* @author  Eisenmann, Paul
* @see paul.eisenmann@prosiebensat1.com
* @see https://github.com/ir0n08/haw/tree/master/year01-02/Task4
* @version 1.0 
* @since   19-06-2020 
*/

public class CubicPolynomial extends RealFunction implements Differentiable {
	
	private final double a,b,c,d; // setup the 4 vars used
	
	public CubicPolynomial(double a, double b, double c, double d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d; // assign all four of them
	}
	
	@Override
	public double evaluateAt(double x) {
		return a * Math.pow(x, 3) + b* Math.pow(x, 2) + c*x + d; // return value with formula state above
	}

	@Override
	public boolean inDomain(double x) {
		return true; // allways true
	}
	
	@Override
	public String toString() {
		return String.format("%f*x^3+%f*x^2+%f*x+%f", a, b, c, d); // return as a nice string to read
	}

	@Override
	public RealFunction derive() {
		return new CubicPolynomial(0,a*3,b*2,c); // the derivation for CubicPolynomial is preatty easy: -> 0*x^3+3*a*x^2+2*b*x+c
	}
}
