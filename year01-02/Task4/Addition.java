package de.hawlandshut.calculus;

/**
* <h1>Addition</h1>
* Add two RealFunctions with each other
*
* @author  Eisenmann, Paul
* @see paul.eisenmann@prosiebensat1.com
* @see https://github.com/ir0n08/haw/tree/master/year01-02/Task4
* @version 1.0 
* @since   19-06-2020 
*/

public class Addition extends BinaryOperation implements Differentiable {
	
	public Addition(RealFunction left, RealFunction right) {
		super(left, right); // call it´s super function
	}

	@Override
	double evaluateAt(double x) {
		return getLeft().evaluateAt(x) + getRight().evaluateAt(x); // return the values at x from the left and right side
	}

	@Override
	boolean inDomain(double x) { // if both values at x are in the domain, return true
		if(getRight().inDomain(x) && getLeft().inDomain(x)) { 
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() { // return both left and right as string
		return String.format("(%s)+(%s)",getLeft().toString(), getRight().toString());
	}

	@Override
	public RealFunction derive() throws DiffException { // derive the functions and add them
		
		var l = getLeft();
		var r = getRight();
		
		if(! (l instanceof Cosine || l instanceof Sine || l instanceof Constant || l instanceof Exp || l instanceof Log)  ) {
			throw new DiffException("the left value is not correct input"); // check if left is valid
		}
		
		if(! (r instanceof Cosine || r instanceof Sine || r instanceof Constant || r instanceof Exp || r instanceof Log)  ) {
			throw new DiffException("the right value is not correct input"); // check if left is valid
		}
		
		return new Addition(l.derive(),r.derive()); // return new obj
	}
}
