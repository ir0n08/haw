/*														
	* 		    Praktikum1/Aufgabe3 	 			*
	* 			by Eisenmann, Paul 		  			*
	* 		ProSiebenSat.1 Tech Solutions 			*
	*  		  https://github.com/ir0n08 			*
	* 			   Bisection.java					*
*/

public class Bisection {
		
	public static void main(String[] args){
		
		if(!checkInput(args)) {
			return; // Abort early aka get out in Pasing
		} 
		
		// left and right variables
		double c = 0;
		double l = Integer.parseInt(args[0]);
		double r = Integer.parseInt(args[1]);

		for(int i = 0; i < 10; i++) {
			c = (double) (l+r)/2;
			System.out.printf("Run %d: f(%.6f) = %.6f\n",(i+1),c,f(c)); // output with formated floors on six digits
			if(f(c) > 0) { // if f(c) is greater than 0 replace the left var with c -> (l+r)/2
				l = c;
			} else { // otherwise replace the right var with c
				r = c;
			}
		}
		System.out.printf("Ergebnis: f(%.6f) = %.6f", c, f(c)); // Output the final result
		
	}
	
	private static double f(double x){
		return Math.cos(x);
	}
	
	public static boolean checkInput(String[] input) { // this function will check if the input vars meet the set requirements
		
		if(input.length != 2) { // if there less or more than 2 inputs args, something is not right
			System.out.println("Bitte überprüfe Deine Eingabe erneut");
			return false;
		}
		
		int l = Integer.parseInt(input[0]); // set the left var
		int r = Integer.parseInt(input[1]); // set the right var
		// improvment: in complicated programmes the usage of one char var´s for not counters should be used
		
		if(l > r) {
			System.out.println("2. Geben Sie eine Fehlermeldung aus, wenn l > r ."); // Display A error message
			return false;
		}
		
		if(f(l) <= 0 || f(r) >= 0) { // Display another error message
			System.out.println("3. Prüfen Sie ob f (l) > 0 und f (r ) < 0 und geben Sie eine Fehlermeldung aus, wenn das nicht der Fall ist"); 
			return false; 
		}
		
		return true;
	}
}
