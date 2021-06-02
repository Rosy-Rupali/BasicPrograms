package coreprograms;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int number1 = scanner.nextInt();
		System.out.println("Enter the second number: ");
		int number2 = scanner.nextInt();
		System.out.println("Enter the third number: ");
		int number3 = scanner.nextInt();
		
		System.out.println("Numbers are: "+number1+" "+number2+" "+number3);
		
		if(number1 > number2 && number1 > number3) {
			System.out.println(number1+" is the greatest number among three numbers");
		}else if(number2 >number1 && number2 > number3) {
			System.out.println(number2+" is the greatest number among three numbers");
		}else {
			System.out.println(number3+" is the greatest number among three numbers");
		}
		

	}

}
