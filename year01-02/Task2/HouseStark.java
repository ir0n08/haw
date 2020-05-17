package com.prosiebensat1tech.haw_praktikum_2;
/**
* <h1>Game of Thrones characters in practise</h1>
* Experience the legacy of the house of Stark
*
* @author  Eisenmann, Paul
* @see paul.eisenmann@prosiebensat1.com
* @see https://github.com/ir0n08/haw/tree/master/year01-02/Task2
* @version 1.0
* @since   17-05-2020 
*/
public class HouseStark {
	public static void main(String[] args) {
		
		// Create houses
		var Stark = new House("Stark","Winterfell");
		var Frey = new House("Frey","The Twins");

		// Create init characters
	    var eddard = new Character("Eddard Stark", Stark, true, 88);
	    var catelyn = new Character("Catelyn Stark", Stark, true, 42);
	    var raymund = new Character("Raymund Frey", Frey, true, 68);
	    
	    // "Make" children
	    Character robb = new Character("Robb Stark", catelyn, eddard);
	    Character sansa = new Character("Sansa Strak", catelyn, eddard);
	    Character arya = new Character("Arya Stark", catelyn, eddard);
	    Character bryan = new Character("Aryan Stark", catelyn, eddard);
	    
	    // Season 1 ending, no I didn't cried
	    eddard.changeAlive(false);
	    
	    // The red wedding, I definitely cried
	    catelyn.fight(raymund);
	    
	    // Output Strings
	    System.out.println(eddard.toString());
	    System.out.println(catelyn.toString());
	    System.out.println(raymund.toString());
	    System.out.println(robb.toString());
	    System.out.println(sansa.toString());
	    System.out.println(arya.toString());
	    System.out.println(bryan.toString());
	}
}
