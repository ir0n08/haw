package com.prosiebensat1tech.haw_praktikum_3;

/**
* <h1>MagicSquare</h1>
* Magic Magic Magic
*
* @author  Eisenmann, Paul
* @see paul.eisenmann@prosiebensat1.com
* @see https://github.com/ir0n08/haw/tree/master/year01-02/Task3
* @version 1.0
* @since   05-06-2020 
*/

public class MagicSquare {

	public static int[][] getExample() {
		int[][] example = {{8,1,6},{3,5,7},{4,9,2}}; // create example array of magic square
		return example; // return the example ###! QUESTION !### Is it possible to return a multi dim array in one line? Thank you!
	}
	
	public static boolean isMagic(int[][] magicArray) { // input is a 2 dim array
		
		if(magicArray == null) { // check if 'outer' is null
			throw new IllegalArgumentException("error: array can't be null");
		}
		
		if(magicArray.length == 0) { // attention! usually we don't like empty arrays, but in this case an empty array is magic!
			return true;
		}
		
		int lastSum = 0; // create the last sum and 2 be sure set it to zero
		for(int i = 0; i < magicArray.length; i++) {
			
			if(magicArray[i] == null || magicArray.length != magicArray[i].length) { // if the 'inner' array is null or doesn't have the length of the outer array throw an exception
				throw new IllegalArgumentException("error: your square is not a square");
			}
						
			int currentSum = 0; // create a var for the current sum in check
			for(int j = 0; j < magicArray[i].length; j++) {
				currentSum += magicArray[i][j]; // add every entry
			}
			
			if(i != 0 && currentSum != lastSum) { // if its not the 1st run trough, check if the last sum is identical with the current sum
				return false; // if thats not the case, return false
			}
			lastSum = currentSum; // after the check, you assign the current sum as the last sum for the next loop
		}
		return true; // if none of the above return false have fired, you get here and your square is there for magical :)
	}
}
