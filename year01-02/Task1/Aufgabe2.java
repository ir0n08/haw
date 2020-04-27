/*														
	* 			     Praktikum1 		 			*
	* 			by Eisenmann, Paul 		  			*
	* 		ProSiebenSat.1 Tech Solutions 			*
	*  		  https://github.com/ir0n08 			*
	* 			   Aufgabe2.java					*
*/


public class Aufgabe2 {

	public static void main(String[] args) {
		
		// Check Input
		if(!isInputOkey(args)) {
			return; // Abort early aka get out in Pasing
		}
		
		// Assign Input Vars
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[2]);
		
		// Calc and output result
		System.out.println(calcRes(x,y,args[1]));
		
	}
	
	public static boolean isInputOkey(String[] args_input) {
		if(args_input.length != 3) {
			System.out.println("Bitte überprüfe deine Eingabe \\d \\s[+|-|x|/] \\d");
			return false; // abort the mission
		} else {
			return true; // otherwise continue
		}
	}
	
	public static int calcRes(int x, int y, String op) {

		switch(op) { // other option is to check string with Strings.equals but it ain´t stupid if it works right? - properly no
			case("+"):
				return x + y;
			case("-"):
				return x - y;
			case("x"):
				return x * y;
			case("/"):
				return x / y;
			default:
				System.out.println("Deine Operator Eingabe wird nicht unterstützt!");
				return 0; // here is a potential to optimise and dont return anything if the operator is not supported
		}
	} 
}
