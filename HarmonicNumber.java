package coreprograms;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the harmonic value:");
		int N = scanner.nextInt();
		if(N > 0) {
			calculateHarmonic(N);
		}else {
			System.out.println("Invalid input");
		}
	}
	
	private static void calculateHarmonic(int N) {
		double result=0.0;
		for(int i=1; i<=N; i++) {
			result+=1.0/i;
		 }
		System.out.println(result);
	}
	
}
