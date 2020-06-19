package de.hawlandshut.calculus;

/**
* <h1>Composition</h1>
* composit two RealFunctions with each other
*
* @author  Eisenmann, Paul
* @see paul.eisenmann@prosiebensat1.com
* @see https://github.com/ir0n08/haw/tree/master/year01-02/Task4
* @version 1.0 
* @since   19-06-2020 
*/

public class Composition extends BinaryOperation {
	
	public Composition(RealFunction left, RealFunction right) {
		super(left, right); // call the super function
	}

	@Override
	double evaluateAt(double x) {
		return getLeft().evaluateAt(getRight().evaluateAt(x)); // get the right value at x and then get the value at this new value
	}

	@Override
	boolean inDomain(double x) {
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
	RealFunction derive() throws DiffException { // derive the composition
		
		var l = getLeft();
		var r = getRight();
		
		if(! (l instanceof Cosine || l instanceof Sine || l instanceof Constant || l instanceof Exp || l instanceof Log)  ) {
			throw new DiffException("unvalid input on left side"); // left side is not vaild -> throw custom Diff Exception
		}
		
		if(! (r instanceof Cosine || r instanceof Sine || r instanceof Constant || r instanceof Exp || r instanceof Log)  ) {
			throw new DiffException("unvalid input on right side"); // right side is not vaild -> throw custom Diff Exception
		}
		
		RealFunction ls = l.derive(); // left strich
		RealFunction rs = r.derive(); // right strich
		
		return new Multiplication(new Composition(ls,r), rs);
	}
}
