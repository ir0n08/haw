package de.hawlandshut.calculus;

/**
* <h1>RealFunction</h1>
* Master class of project
*
* @author  Eisenmann, Paul
* @see paul.eisenmann@prosiebensat1.com
* @see https://github.com/ir0n08/haw/tree/master/year01-02/Task4
* @version 1.0 
* @since   19-06-2020 
*/

abstract class RealFunction { // abstract mother class of all
	abstract double evaluateAt(double x);
	abstract boolean inDomain(double x);
	abstract RealFunction derive() throws DiffException;
}
