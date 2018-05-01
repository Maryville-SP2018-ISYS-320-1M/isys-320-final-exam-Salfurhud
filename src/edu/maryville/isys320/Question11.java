package edu.maryville.isys320;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		System.out.println("Enter x, y for first point:");
		double x1 = console.nextDouble();
		double y1 = console.nextDouble();

		System.out.println("Enter x, y for second point:");
		double x2 = console.nextDouble();
		double y2 = console.nextDouble();

		double d1 = (x1 - x2) * (x1 - x2);
		double d2 = (y1 - y2) * (y1 - y2);

		console.close();

		double ans = Math.sqrt(d1 + d2);
		System.out.println("The distance is: " + ans);

	}
	
	
}
