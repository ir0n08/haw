package com.prosiebensat1tech.haw_praktikum_3;
/**
* <h1>Password Checker</h1>
* Checks a password for given requirements
*
* @author  Eisenmann, Paul
* @see paul.eisenmann@prosiebensat1.com
* @see https://github.com/ir0n08/haw/tree/master/year01-02/Task3
* @version 1.0
* @since   04-06-2020 
*/
public class PasswordChecker {
	public static boolean check(String password) {

		if(password.length() < 8) { // check if string length is at least 8
			//throw new IllegalArgumentException("Password needs at least 8 characters!"); // possible solutions if specific errors should be shown
			return false;
		}
		
		if(!password.matches("^[a-zA-Z0-9,!,?,.,#]+$")) { // check if only this chars are in the input
			return false;
		}
		
		if(!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[#,!,?,.]).+$")) { // check if each of this char ranges is included -> regex101.com <3
			return false;
		}
		return true;
	}
}