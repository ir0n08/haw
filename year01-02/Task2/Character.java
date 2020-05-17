package com.prosiebensat1tech.haw_praktikum_2; // my own namespace 

/**
* <h1>Game of Thornes characters</h1>
* This Java Programm creates Game of Thrones characters<br>
* and lets them fight with each other
*
* @author  Eisenmann, Paul
* @see paul.eisenmann@prosiebensat1.com
* @see https://github.com/ir0n08/haw/tree/master/year01-02/Task2
* @version 1.0
* @since   17-05-2020 
*/

public class Character { // class Character for each GoT Character
	
	public final String name;
	private final int fightSkills;
	private final House house;
	private final Character mother;
	private final Character father;
	private boolean alive;
	
	/**
	 * Function for creating character from scratch 
	 * 
	 * input: <br>
	 * @param name(string) of new character<br>
	 * @param house(house object) or family of character<br>
	 * @param isAlive?(boolean)<br>
	 * @param fightSkills(int[0-100])
	 * 
	 * @throws IllegalArgumentException If name is not set
	 * @throws IllegalArgumentException If fightskill is not in range
	 * 
	 */
	public Character(String name, House house, boolean alive, int fightSkills) {
		
		if(name == "" || name == null) {
			throw new IllegalArgumentException("Name must have a value and can't be null");
		}
		
		if(fightSkills <= 0 && fightSkills >= 100 ) {
			throw new IllegalArgumentException("fightSkill is not in range[0-100]");
		}
		
		this.name = name;
		this.fightSkills = fightSkills;
		this.house = house;
		this.mother = null;
		this.father = null;
		this.alive = alive;
	}
	
	/**
	 * Function for creating with two other characters -> "code-coitus"
	 * <br><br>
	 * <h4>input:</h4> <br>
	 * @param name (string) of new character/baby<br>
	 * @param mother (Character)<br>
	 * @param father (Character)<br>
	 * 
	 * @return new Character
	 * <br><br>
	 * <h4>New Characters stats:</h4><br>
	 * -> fightSkill is determined by: mother's fightingSkill + fathers' fightingSkill devided by 2<br>
	 *    the value will be rounded upwards 41.5 -> 42<br>
	 * -> House will be mother's house and if this is null, then fahters house
	 * -> Child will always be alive on birth
	 * 
	 * @throws IllegalArgumentException If name is not set
	 * @throws IllegalArgumentException If mother is not set
	 * @throws IllegalArgumentException If mother or father is not alive==true
	 * @throws IllegalArgumentException If mother is equal to father
	 */
	public Character(String name, Character mother, Character father) {
		
		if(name == null || name == "") { 
			throw new IllegalArgumentException("a babys name must be set");
		}
		
		if(father == null || mother == null) {
			throw new IllegalArgumentException("father or mother is not defined");
		}
		
		if(!father.isAlive() || !mother.isAlive()) {
			throw new IllegalArgumentException("father or mother is not alive");
		}
		
		if(father.equals(mother)) {
			throw new IllegalArgumentException("nobody liked clone wars");
		}
		
		if(mother.getHouse() != null) {
			this.house = mother.getHouse();
		} else {
			this.house = father.getHouse();
		}
		
		this.name = name;
		this.fightSkills = (int)Math.round((mother.getFightSkills() + father.getFightSkills()) / 2.0);
		this.mother = mother;
		this.father = father;
		this.alive = true;
	}
	
	/**
	 * Function for cloning a character
	 * <br><br>
	 * <h4>input:</h4> <br>
	 * @param Character whome to be cloned<br>
	 * 
	 * @return cloned Character
	 * <br><br>
	 * 
	 * @throws IllegalArgumentException If input object is null
	 */
	public Character(Character other) {
		if(other == null) {
			throw new IllegalArgumentException("clone object is null");
		}
	
		this.name = other.name;
		this.house = other.getHouse();
		this.mother = other.getMother();
		this.father = other.getFather();
		this.fightSkills = other.getFightSkills();
		this.alive = other.isAlive();
	}
	
	/**
	 * Lets to Characters fight with eachother
	 * <br><br>
	 * <h4>input:</h4> <br>
	 * @param op is Character to be fought with
	 * 
	 * character with higher fightingSkill will win, the other will set dead<br>
	 * if fighitngSkill is equal, nothing will happen
	 * 
	 * @return nothing, but loser will be set alive=false
	 * <br><br>
	 * 
	 * @throws IllegalArgumentException If one opponent is not set/null
	 * @throws IllegalArgumentException If both opponents are the same guy
	 * @throws IllegalArgumentException If one of the opponent is dead
	 */
	public void fight(Character op) {
		
		if(op == null || this == null) {
			throw new IllegalArgumentException("Your one of your oponents is not defined");
		}
		
		if(op.equals(this)) {
			throw new IllegalArgumentException("You can't fight your self");
		}

		if(!op.isAlive() || !this.isAlive()) {
			throw new IllegalArgumentException("Attack of the dead man is not real! https://www.youtube.com/watch?v=-AFdwoyNT24");
		}
		
		if(this.getFightSkills() == op.getFightSkills()) {
			return;
		} else if (this.getFightSkills() > op.getFightSkills()) {
			op.changeAlive(false);
		} else if (this.getFightSkills() < op.getFightSkills()) {
			this.changeAlive(false);
		} else {
			throw new IllegalArgumentException("unkown error 42");
		}
	}
	
	/**
	 * Getter Function of Characters name
	 * @return name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Getter Function of Characters house
	 * @return house, can be null
	 */
	public House getHouse() {
		return this.house;
	}
	
	/**
	 * Getter Function of Characters mother
	 * @return Character mother, can be null
	 */
	public Character getMother() {
		return (this.mother != null ? this.mother : null ); 
	}
	
	/**
	 * Getter Function of Characters mothers name
	 * @return mothers name as string or null as string
	 */
	public String getMotherName() {
		return (this.mother != null ? this.mother.name : "null" ); 
	}
	
	/**
	 * Getter Function of Characters father
	 * @return fahter, can be null
	 */
	public Character getFather() {
		return (this.father != null ? this.father : null ); 
	}
	
	/**
	 * Getter Function of Characters fathers name
	 * @return fahters name as string, can be null as string
	 */
	public String getFatherName() {
		return (this.mother != null ? this.father.name : "null" ); 
	}
	
	/**
	* Getter Function if character is alive
	* @return isAlive as boolean
	*/
	public boolean isAlive() {
		return this.alive;
	}
	
	/**
	* Getter Function of Characters house
	* @return house, can be null
	*/
	public int getFightSkills() {
		return this.fightSkills;
	}
	
	/**
	 * Setter Function for alive status of character
	 * @return nothing
	 */
	public void changeAlive(boolean isAlive) {
		this.alive = isAlive; // this function is season 6 prove, so characters can be set alive again
	}
	
	/**
	 * Object to string function
	 * @return JSON String
	 */
	public String toString() {
		return "{ name = '"+this.name+"', alive = '"+this.alive+"', father = '"+this.getFatherName()+"', mother = '"+this.getMotherName()+"', house = '"+this.house.name+" ("+this.house.seat+")', fightSkills = '"+this.fightSkills +"'}";
	}
	
	/**
	 * hashCode Function autogenerated with Eclipse
	 * @return int hash code
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (alive ? 1231 : 1237);
		result = prime * result + ((father == null) ? 0 : father.hashCode());
		result = prime * result + fightSkills;
		result = prime * result + ((house == null) ? 0 : house.hashCode());
		result = prime * result + ((mother == null) ? 0 : mother.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	/**
	* Setter Function for alive status of character
	* 
	* @param obj input object
	* @return boolean if objects are equal
	*/
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		} else if(obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		Character other = (Character)obj;
		
		if(!this.getName().equals(other.getName())) {
			return false;
		} else if(!this.getHouse().equals(other.getHouse())) {
			return false;
		} else if(this.isAlive() != other.isAlive()) {
			return false;
		} else if(this.getFightSkills() != other.getFightSkills()) {
			return false;
		} else if(this.getFather() != other.getFather()) {
			return false;
		} else if(this.getMother() != other.getMother()) {
			return false;
		} else {
			return true;
		}
	}
}
