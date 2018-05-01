package edu.maryville.isys320;

public class Question9 {
	public static void main(String[] args) {
		double a = squaredDifferences(10, 5);
		System.out.println(a);
	}
	
    public static double squaredDifferences(double a, double b) {
        return ((a - b) * (a - b));
    }

}
