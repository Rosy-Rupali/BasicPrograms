package coreprograms;

import java.util.Scanner;

public class Triplet {

	public static void main(String[] args) {

		int arr[] = {0, -1, 2, -3, 1};
		int n = arr.length;
		findTriplet(arr, n);
	}	
		private static void findTriplet(int arr[], int n) {
			boolean b =false;
			for(int i=0; i<n-2; i++) {
				for(int j=i+1; j<n-1; j++) {
					for(int k=j+1; k<n; k++) {
						if(arr[i]+arr[j]+arr[k] == 0) {
							System.out.print(arr[i]+" "+arr[j]+" "+arr[k]+"\n");
							b = true;
						}
					}
				}
			}
			if(b == false) {
				System.out.println("Triplet does not exist");
			}
		}
	}

