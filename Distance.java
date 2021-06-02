package coreprograms;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the x-axis value:");
		int x = scanner.nextInt();
		System.out.println("Enter the y-axis value:");
		int y = scanner.nextInt();
		
		int z = (int)(Math.pow(x, 2)+Math.pow(y, 2));
		double distance = Math.sqrt(z);
		
		System.out.println("Distance = "+distance);

	}
	

}
