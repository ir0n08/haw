package com.prosiebensat1tech.haw_praktikum_2;

/**
* <h1>Length Things</h1>
* This Java Programm creates differnet Length Units<br>
*
* @author  Eisenmann, Paul
* @see paul.eisenmann@prosiebensat1.com
* @see https://github.com/ir0n08/haw/tree/master/year01-02/Task2
* @version 1.0
* @since   17-05-2020 
*/
public class Length {
	private final double value;
	private final LengthUnit unit;
	
	/**
	* Create the object with a value and a unit
	* @param value as doulbe
	* @param unit as defind LengthUnit eg cm, m, fd
	* 
	*/
	Length(double value, LengthUnit unit) {
		this.value = value;
		this.unit = unit;
	}
	
	/**
	* Getter function of value
	* @return value as double
	* 
	*/
	public double getValue() {
		return this.value;
	}
	
	/**
	* Getter function of unit
	* @return unit as double
	* 
	*/
	public LengthUnit getUnit() {
		return this.unit;
	}
	
	/**
	* Convert any length to given unit
	* @return new Length Object with new unit and value
	* 
	*/
	public Length as(LengthUnit unit) {
		return new Length(this.getValue() / unit.getMeters() , unit);
	}
	
	/**
	* Add any length to given length object
	* @return new Length Object with old unit and new value
	* 
	*/
	public Length add(Length other) {
		if(other == null) {
			throw new IllegalArgumentException("Added length can't be null");
		}
		var temp_length = other.getValue() * (other.getUnit().getMeters() / this.getUnit().getMeters());
		return new Length(temp_length + this.getValue() ,this.getUnit());
	}
	
	/**
	* Returns Length Object with value and unit as String
	* @return String with value and unit
	* 
	*/
	public String toString() {
		return this.value + "" + this.unit;
	}
}
