package com.prosiebensat1tech.haw_praktikum_2;

/**
* <h1>Game of Thornes houses</h1>
* This Java Programm creates Game of Thrones houses<br>
* It will be used with "Game of Thrones Characters"
*
* @author  Eisenmann, Paul
* @see paul.eisenmann@prosiebensat1.com
* @see https://github.com/ir0n08/haw/tree/master/year01-02/Task2
* @version 1.0
* @since   17-05-2020 
*/
public class House {
	
	final String name;
	final String seat;
	
	/**
	 * Function for creating a house from scratch 
	 * 
	 * input: <br>
	 * @param name(string) of new house<br>
	 * @param seat(string) of the new house eg "Winterfell"
	 * 
	 * @throws IllegalArgumentException If name is not set/null
	 * @throws IllegalArgumentException If seat is not set/null
	 * 
	 */
	public House(String name, String seat) {
		
		if(name == "" || name == null) {
			throw new IllegalArgumentException("Name must have a value and can't be null");
		}
		
		if(seat == "" || seat == null) {
			throw new IllegalArgumentException("Seat must have a value and can't be null");
		}
		
		this.name = name;
		this.seat = seat;
	}
	
	/**
	 * Function for cloning a house from scratch 
	 * 
	 * input: <br>
	 * @param oldHouse Object to be cloned
	 * 
	 */
	public House(House oldHouse) {
		this(oldHouse.getName(),oldHouse.getSeat());
	}
	
	/**
	* Getter function of House name 
	* @return house name
	*/
	public String getName() {
		return this.name;
	}
	
	/**
	* Getter function of House seat 
	* @return seat name
	*/
	public String getSeat() {
		return this.seat;
	}
	
	/**
	* House Object to String function
	* @return house name
	*/
	public String toString() {
		return "{ name = '"+this.name+"', seat = '"+this.seat+"'}";
	}

	/**
	* Equals function
	* @return boolean if Objects to be checked are equal
	*/
	public boolean equals(House bHouse) {
		 if (bHouse == null) { // input object is empty/null -> equals: false
				return false;
		} else if(this == bHouse) { // objects are identical -> equals: true
			return true;
		} else if(this.name.equals(bHouse.name) && this.seat.equals(bHouse.seat)) {	
			return true; // if names and seats of both objects are identical -> equals: true
		}  
		return false; // if none of the if-else statements fired, the objects can't be idendical -> equals: false
	}

	/**
	* hashCode Function generated with Eclipse
	* @return int hashCode
	*/
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((seat == null) ? 0 : seat.hashCode());
		return result;
	}
}
