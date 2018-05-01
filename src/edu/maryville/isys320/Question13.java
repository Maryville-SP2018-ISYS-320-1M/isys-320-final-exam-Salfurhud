package edu.maryville.isys320;

import java.util.Scanner;

public class Question13 {
	
	public static void main(String[] args) {

		golfTracker();

	}
	
	public static void golfTracker() {
		Scanner console = new Scanner(System.in);
		
		System.out.println("What is par for the courser?");
		int par = console.nextInt();
		
		int x = 0;
		int accScore = 0;
		
		while(x != -1 ) {
			
			System.out.println("Enter your next round score: ");
			x = console.nextInt() ;
			if(x != -1) {
				accScore += (x - par);
			}
		}
		
		System.out.println("On this course your total score is " + accScore);
		
		if(accScore < 0) {
			System.out.println("Under par, nice!");
		} else {
			System.out.println("Over par, work on your short game");
		}

	}
}
