package edu.maryville.isys320;

import java.util.Scanner;

public class Question12 {
	
	public static void main(String[] args) {

		triangleWord();

	}
	
	
    public static void triangleWord() {

		Scanner console = new Scanner(System.in);
		System.out.print("What is your world:");
		
		String word = console.next();

		for (int x = 1; x <= word.length(); x++) {
			for (int i = 1; i <= word.length() - x; i++) {
				System.out.print(" ");
			}

			for (int i = 1; i <= x; i++) {
				System.out.print(word.charAt(i - 1));
			}
			
			System.out.println("");
		}
		
		for (int x = word.length(); x >= 1; x--) {
			for (int i = 1; i <= word.length() - x; i++) {
				System.out.print(" ");
			}

			for (int i = 1; i <= x; i++) {
				System.out.print(word.charAt(i - 1));
			}
			
			System.out.println("");
		}


	}
}
