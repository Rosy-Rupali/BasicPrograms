package coreprograms;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the values for a, b and c:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		double delta = ((b*b)-(4*a*c));
		
		double x1 = (-b+Math.sqrt(delta))/(2*a);
		double x2 = (-b-Math.sqrt(delta))/(2*a);
		
		System.out.println("Root 1 of x = "+x1);
		System.out.println("Root 2 of x = "+x2);

	}

}
