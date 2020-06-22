package de.hawlandshut.calculus;

/**
* <h1>RealFunction</h1>
* Master class of project
*
* @author  Eisenmann, Paul
* @see paul.eisenmann@prosiebensat1.com
* @see https://github.com/ir0n08/haw/tree/master/year01-02/Task4
* @version 1.1
* @since   19-06-2020 
*/

public abstract class RealFunction { // abstract mother class of all
	public abstract double evaluateAt(double x);
	public abstract boolean inDomain(double x);

}
