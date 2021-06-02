package coreprograms;

import java.util.Scanner;

public class QuotientNRemainder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Dividend: ");
		int number1 = scanner.nextInt();
		System.out.println("Enter the Divisor: ");
		int number2 = scanner.nextInt();
		
		int quotient = number1/number2;
		int remainder = number1%number2;
		
		System.out.println("Quotient is: "+quotient);
		System.out.println("Remainder is: "+remainder);
		
	}

}
