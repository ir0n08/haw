/*														
	* 			     Praktikum1 		 			*
	* 			by Eisenmann, Paul 		  			*
	* 		ProSiebenSat.1 Tech Solutions 			*
	*  		  https://github.com/ir0n08 			*
	* 			   Aufgabe1.java					*
*/

public class Aufgabe1 {

	public static void main(String[] args) {

		int fb_length; // length of the for loop
		
		if(args.length > 0) { // is any data submitted with the shell ?
			fb_length = Integer.valueOf(args[0]); //  // if yes, set this as number -> better way: check if args[0] is a integer and display warning if not
		} else {
			fb_length = 100; // this is the default length
		}
		
		for(int i = 1; i <= fb_length; i++) {
			
			boolean skipper = false; // the skipper var will used if none of the buzz/fizz words is used
			
			if ( (i % 3 ) == 0) { // is the current number modulo 3 -> 0 ?
				System.out.print("Fizz");
				skipper = true; // if fizz oder buzz is fired, than the skipper is true
			}
			
			if ( (i % 5 ) == 0) { // is the current number modulo 5 -> 0 ?
				System.out.print("Buzz");
				skipper = true;
			}	
			
			if (!skipper) {
				System.out.print(i); // if the skipper var is not fired for current loop, then display the normal number
			}
			System.out.println();  // add a break for every run
		}
	}
}
