package de.hawlandshut.calculus;

/**
* <h1>Log</h1>
* Creates an obj of a L0G
*
* @author  Eisenmann, Paul
* @see paul.eisenmann@prosiebensat1.com
* @see https://github.com/ir0n08/haw/tree/master/year01-02/Task4
* @version 1.0 
* @since   19-06-2020 
*/

public class Log extends RealFunction implements Differentiable {
	
	@Override
	public double evaluateAt(double x) {
		if(x <= 0) { // check if input is > 0
			throw new OutsideOfDomainException("A log requires an input value greater than zero, otherwise the universe will exploed!");
		} else {
			return Math.log(x); // return log value
		}
	}

	@Override
	public boolean inDomain(double x) {
		try {
			evaluateAt(x); // try if evaluation at x is okey
		} catch(Exception OutsideOfDomainException) {
			return false; // if not then return false
		}
		return true;
	}
	
	@Override
	public String toString() {
		return String.format("ln(x)"); // return boring string
	}

	@Override
	public RealFunction derive() {
		return new LogDerivative(); // return sub class for derivation
	}
	
	private static class LogDerivative extends Log { // sub class to derive a log 
		@Override
		public boolean inDomain(double x) {
			if(x > 0) { // check if greater zero
				return true;
			} else {
				return false;
			}
		}
		
		@Override
		public double evaluateAt(double x) {
			return 1/x; // if x would 0 or below we would get in some serious trouble here
		}
	}
}
