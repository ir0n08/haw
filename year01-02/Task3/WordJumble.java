package com.prosiebensat1tech.haw_praktikum_3;

import java.util.Scanner;

public class WordJumble {
	public static void jumbleWord(String word, StringBuilder builder) {

		StringBuilder wordBuilder = new StringBuilder(word); // create temp word builder for swapping chars
		
		if(word.length() > 3) { // only do something if char is longer than 3 -> goes not for dating!
			char t; // init the temp var -> single char varibale names should be forbidden, at least that what I say my coding trainees
			for(int i = 1; i < word.length() ; i=i+2) { // index starts at 1 because we dont want the first (0) char
				if(word.length() - i > 2 ) { // if the word length minus the current index is lower 2 than it would be last char that would be swapped -> which we obviously don't want
					
					t = wordBuilder.charAt(i); // set a temp var so no data is lost while swapping
					
					wordBuilder.setCharAt(i,  wordBuilder.charAt(i+1)); // set current index char to the next char
					wordBuilder.setCharAt(i+1,  t); // now load our temp char and assign it to the next char
				}
			}
		}
		builder.append(wordBuilder.toString()); // attach word to big builder
	}
	
	// I won't comment other peoples code, sorry
	public static String jumbleText(Scanner scanner) {

		StringBuilder builder = new StringBuilder();

		while (scanner.hasNext()){
			String word = scanner.next();

			jumbleWord(word, builder);
			builder.append(" ");
		}
		return builder.toString();
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		String result = jumbleText(scanner);

		System.out.print(result);
		scanner.close();
  	}
}
