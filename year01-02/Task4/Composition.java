package de.hawlandshut.calculus;

/**
* <h1>Composition</h1>
* composit two RealFunctions with each other
*
* @author  Eisenmann, Paul
* @see paul.eisenmann@prosiebensat1.com
* @see https://github.com/ir0n08/haw/tree/master/year01-02/Task4
* @version 1.1 
* @since   19-06-2020 
*/

public class Composition extends BinaryOperation implements Differentiable {
	
	public Composition(RealFunction left, RealFunction right) {
		super(left, right); // call the super function
	}

	@Override
	public double evaluateAt(double x) {
		return getLeft().evaluateAt(getRight().evaluateAt(x)); // get the right value at x and then get the value at this new value
	}

	@Override
	public boolean inDomain(double x) {
		if(getRight().inDomain(x) && getLeft().inDomain(getRight().evaluateAt(x))) { // if both the right x and the new left value with the right x is in the domain, return true
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() { // return as a fancy string
		return String.format("(%s)o(%s)",getLeft().toString(), getRight().toString());
	}

	@Override
	public RealFunction derive() throws DiffException { // derive the composition
		
		var l = getLeft();
		var r = getRight();
		
		if(!(l instanceof Differentiable) ) {
			throw new DiffException("the left value is not correct input"); // check if left is valid
		}
		
		if (!(r instanceof Differentiable) ) {
			throw new DiffException("the right value is not correct input"); // check if left is valid
		}
		
		return new Multiplication(new Composition( ((Differentiable) l).derive() ,r), ((Differentiable) r).derive());
	}
}
