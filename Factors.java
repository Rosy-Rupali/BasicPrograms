package coreprograms;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to find the prime factor: ");
		int number = scanner.nextInt();
		calculatePrimeFactors(number);
	}
	private static void calculatePrimeFactors(int N) {
		for(int i=2; i<=N; i++) {
			if((N%i) == 0) {
			System.out.print(i+" ");
				N = N/i;
			}else {
				System.out.print("1 "+N);
				break;
			}
		}			
	}

}
