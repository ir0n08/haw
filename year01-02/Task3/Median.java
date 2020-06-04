package com.prosiebensat1tech.haw_praktikum_3;

import java.util.Arrays; // load utils for array sorting

/**
* <h1>Median</h1>
* Returns the middle value of an array
*
* @author  Eisenmann, Paul
* @see paul.eisenmann@prosiebensat1.com
* @see https://github.com/ir0n08/haw/tree/master/year01-02/Task3
* @version 1.0
* @since   05-06-2020 
*/
public class Median {

	static double computeMedian(int... argsInt) { // as none java user, the ... notation is really confusing
		
		if(argsInt == null || argsInt.length == 0) { // check if array null or empty
			throw new IllegalArgumentException("Throw an error if array is not as liked");
		}
	
		Arrays.sort(argsInt); // sort array with given function
		
		if(argsInt.length % 2 == 0) { // check if array length is even or not
			return (double)(argsInt[(int)((argsInt.length-1) / 2)] + argsInt[(int)(argsInt.length / 2)]) / 2; // if even then take the lower middle and upper middle, add them and divieded them by 2
		} else {
			return argsInt[(int)(argsInt.length / 2)]; // the cast to int is not really ideal, but hey its works
		}
	}
}
