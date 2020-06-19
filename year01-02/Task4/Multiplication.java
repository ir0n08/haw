package de.hawlandshut.calculus;

/**
* <h1>Multiplication</h1>
* multiply two RealFunctions with each other
*
* @author  Eisenmann, Paul
* @see paul.eisenmann@prosiebensat1.com
* @see https://github.com/ir0n08/haw/tree/master/year01-02/Task4
* @version 1.0 
* @since   19-06-2020 
*/

public class Multiplication extends BinaryOperation {
	
	public Multiplication(RealFunction left, RealFunction right) {
		super(left, right); // call the super duper function
	}

	@Override
	double evaluateAt(double x) {
		return getLeft().evaluateAt(x) * getRight().evaluateAt(x); // muliply both vaules at point x with each other
	}

	@Override
	boolean inDomain(double x) {
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
	RealFunction derive() throws DiffException { // derive the multiplication

		var l = getLeft();
		var r = getRight();
		
		if(! (l instanceof Cosine || l instanceof Sine || l instanceof Constant || l instanceof Exp || l instanceof Log)  ) {
			throw new DiffException("the left value is not correct input"); // if left vaule is not valied
		}
		
		if(! (r instanceof Cosine || r instanceof Sine || r instanceof Constant || r instanceof Exp || r instanceof Log)  ) {
			throw new DiffException("the right value is not correct input"); // if left vaule is not valied
		}
		
		RealFunction ls = l.derive(); // left strich
		RealFunction rs = r.derive(); // right strich
		
		return new Addition(new Multiplication(l,rs), new Multiplication(ls,r)); // return derived mulitpication
	}
}
