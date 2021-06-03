package coreprograms;

import java.io.PrintWriter;
import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the rows: ");
		int m = scanner.nextInt();
		System.out.println("Enter the coulumn: ");
		int n = scanner.nextInt();
		
		System.out.println("Enter option 1: Integer option 2: Double option");
		int option = scanner.nextInt();
		switch(option) {
		
			case 1:
					System.out.println("Enter the elements");
					int arr[][] = new int[m][n];
					for(int i=0; i<m; i++) {
						for(int j=0; j<n; j++) {
							arr[i][j] = scanner.nextInt();
						}
					}
					for(int i=0; i<m; i++) {
						for(int j=0; j<n; j++) {
							System.out.print(arr[i][j]+" ");
						}
						System.out.println();
					}
					break;
			case 2:
					System.out.println("Enter the elements");
					double arrd[][] = new double[m][n];
					for(int i=0; i<m; i++) {
							for(int j=0; j<n; j++) {
								arrd[i][j] = scanner.nextInt();
							}
						}
					for(int i=0; i<m; i++) {
							for(int j=0; j<n; j++) {
								System.out.print(arrd[i][j]+" ");
							}
							System.out.println();
						}
					break;

			default:
					System.out.println("Invalid input");
		}
		scanner.close();
		
	}

}
