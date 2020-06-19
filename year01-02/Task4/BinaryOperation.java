package de.hawlandshut.calculus;

/**
* <h1>Binary Operation</h1>
* Create the Abstract class of binary operations
*
* @author  Eisenmann, Paul
* @see paul.eisenmann@prosiebensat1.com
* @see https://github.com/ir0n08/haw/tree/master/year01-02/Task4
* @version 1.0 
* @since   19-06-2020 
*/

public abstract class BinaryOperation extends RealFunction {
	private final RealFunction left;
	private final RealFunction right; // set up the left and right functions
	
	public BinaryOperation(RealFunction left, RealFunction right) {
		
		if(left != null) { // check for invalid input
			this.left = left;
		} else {
			throw new IllegalArgumentException();
		}
		
		if(right != null) { // check for invalid input
			this.right = right;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public RealFunction getLeft() { // getter for left
		return left;
	}
	
	public RealFunction getRight() { // getter for right
		return right;
	}
}
