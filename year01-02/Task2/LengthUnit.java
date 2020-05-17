package com.prosiebensat1tech.haw_praktikum_2;

/**
* <h1>LengthUnit Things</h1>
* This Java Programm creates a enum for differnet Length Units<br>
*
* @author  Eisenmann, Paul
* @see paul.eisenmann@prosiebensat1.com
* @see https://github.com/ir0n08/haw/tree/master/year01-02/Task2
* @version 1.0
* @since   17-05-2020 
*/
public enum LengthUnit {
	  MILLIMETER("mm","Milimeter",0.001,"si"),
	  CENTIMETER("cm","Centimeter",0.01,"si"),
	  METER("m","Meter",1,"si"),
	  KILOMETER("km","Kilometer",1000.0,"si"),
	  ASTRONOMICAL_UNIT("au","Astronomical Unit",149000000000.0,"si"),
	  INCH("in","Inch",0.0254,"imperial"),
	  FOOT("ft","Foot",0.305,"imperial"),
	  YARD("yd","Yard",0.914,"imperial");
	
		private final String symbol;
		//private final String name; // not used
		private final double meter;
		private final String system;
		
		/**
		* Create the object with givenunit
		* @param symbol as String eg cm
		* @param name as String eg "Centimeter" -> not used
		* @param meter as double the value for calculation to meters meter * any value -> value in meters
		* @param system as String -> If si or imperial
		* 
		*/
		LengthUnit(String symbol,String name,double meter,String system) {
	        this.symbol = symbol;
	        //this.name = name; // not used
	        this.meter = meter;
	        this.system = system;
	    }
		
		/**
		* Getter function for meters
		* @retrun meters as double
		* 
		*/
		public double getMeters() {
			return this.meter;
		}
		
		/**
		* Getter function for symbol
		* @retrun symbol as String
		* 
		*/
		public String getSymbol() {
			return this.symbol;
		}
		
		/**
		* Checker function for SI system
		* @return boolean true if is SI, else false
		* 
		*/
		public boolean isSI() {
			return this.system.equals("si");
		}
}
