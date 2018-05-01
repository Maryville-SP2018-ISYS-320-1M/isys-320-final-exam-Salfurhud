package edu.maryville.isys320;

public class Question10 {

	public static void main(String[] args) {

		double distance = computerDistance(12, 13, 14.5, 19.2);
		System.out.println(distance);
	}
	

	public static double computerDistance(double x1, double y1, double x2, double y2) {

		double d1 = Math.pow((x1 - x2), 2);
		double d2 = Math.pow((y1 - y2), 2);

		return Math.sqrt(d1 + d2);
	}
	
}
