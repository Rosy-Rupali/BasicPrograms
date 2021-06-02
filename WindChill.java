package coreprograms;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the temperature t (in Fahrenheit): ");
		double t = scanner.nextDouble();
		System.out.println("Enter the wind speed v (in miles per hour): ");
		double v = scanner.nextDouble();
		
		if(Math.abs(t)>50) {
			System.out.println("value of t is larger than 50");
		}else if(v<3 || v>120) {
			System.out.println("value of v in not in range");
		}else {
			double w = 35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
			System.out.println("Wind Chill = "+w);
		}
	}

}
