package coreprograms;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number between the range 0 to 31: ");
		int userInput = scanner.nextInt();
		if((userInput > 0) && (userInput <=31)) {
			printTable(userInput);
		}else {
			System.out.println("Invalid input ");
		}

	}
	private static void printTable(int userInput) {
		for(int i=0; i<=userInput; i++) {
		int result = (int)Math.pow(2.0, i);
		System.out.print(result+" ");
		}
		
	}

}
