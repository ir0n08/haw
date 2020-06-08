package com.prosiebensat1tech.haw_praktikum_3;

/**
* <h1>MagicSquare</h1>
* Magic Magic Magic
*
* @author  Eisenmann, Paul
* @see paul.eisenmann@prosiebensat1.com
* @see https://github.com/ir0n08/haw/tree/master/year01-02/Task3
* @version 1.1 fixed version: added missing vertical/horizontal checksum
* @since   08-06-2020 
*/

public class MagicSquare {

	public static int[][] getExample() {
		return new int[][] {{8,1,6},{3,5,7},{4,9,2}}; // return the example # Thank you!
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
						
			int currentHorizontalSum = 0; // create a var for the current sum in check -> Horizontal Line
			for(int j = 0; j < magicArray[i].length; j++) {
				currentHorizontalSum += magicArray[i][j]; // add every entry
			}
			
			int currentVerticalSum = 0; // create a var for the current sum in check -> Vertical Line
			for(int k = 0; k < magicArray[i].length; k++) {
				currentVerticalSum += magicArray[k][i]; // add every entry
			}
			
			int currentDiagonalSum = 0; // create a var for the current sum in check -> Diagonal Line
			for(int l = 0; l < magicArray[i].length; l++) {
				currentDiagonalSum += magicArray[l][l]; // add every entry
			}
			
			if(i != 0 && (currentHorizontalSum != lastSum || currentVerticalSum != lastSum || currentDiagonalSum != lastSum)) { // if its not the 1st run trough, check if the last sum is identical with the current sum
				return false; // if thats not the case, return false
			}
			lastSum = currentHorizontalSum; // after the check, you assign the current sum as the last sum for the next loop
		}
		return true; // if none of the above return false have fired, you get here and your square is there for magical :)
	}
}
