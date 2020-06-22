package de.hawlandshut.calculus;

/**
* <h1>Multiplication</h1>
* multiply two RealFunctions with each other
*
* @author  Eisenmann, Paul
* @see paul.eisenmann@prosiebensat1.com
* @see https://github.com/ir0n08/haw/tree/master/year01-02/Task4
* @version 1.1 
* @since   19-06-2020 
*/

public class Multiplication extends BinaryOperation implements Differentiable {
	
	public Multiplication(RealFunction left, RealFunction right) {
		super(left, right); // call the super duper function
	}

	@Override
	public double evaluateAt(double x) {
		return getLeft().evaluateAt(x) * getRight().evaluateAt(x); // muliply both vaules at point x with each other
	}

	@Override
	public boolean inDomain(double x) {
		if(getRight().inDomain(x) && getLeft().inDomain(x)) { // check if both vaules at x are in domain
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return String.format("(%s)*(%s)",getLeft().toString(), getRight().toString()); // output multiplcation as string
	}

	@Override
	public Addition derive() throws DiffException { // derive the multiplication

		var l = getLeft();
		var r = getRight();
		
		if(!(l instanceof Differentiable) ) {
			throw new DiffException("the left value is not correct input"); // check if left is valid
		}
		
		if (!(r instanceof Differentiable) ) {
			throw new DiffException("the right value is not correct input"); // check if left is valid
		}
		
		return new Addition(new Multiplication(l, ((Differentiable) r).derive() ), new Multiplication(((Differentiable) l).derive(),r)); // return derived mulitpication
	}
}
