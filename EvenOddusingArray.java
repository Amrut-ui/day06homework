package day06homework;
import java.util.Scanner;

public class EvenOddusingArray {

	public static void main(String[] args) {
		

		

		   
		        Scanner scanner = new Scanner(System.in);

		        int[] arr = new int[10];
		        int[] evenArr = new int[10]; // Assuming maximum 10 even numbers
		        int[] oddArr = new int[10];  // Assuming maximum 10 odd numbers

		        int evenCount = 0;
		        int oddCount = 0;

		        System.out.println("Enter 10 array elements:");
		        for (int i = 0; i < 10; i++) {
		            arr[i] = scanner.nextInt();

		            if (arr[i] % 2 == 0) {
		                evenArr[evenCount] = arr[i];
		                evenCount++;
		            } else {
		                oddArr[oddCount] = arr[i];
		                oddCount++;
		            }
		        }

		        System.out.println("Even numbers:");
		        for (int i = 0; i < evenCount; i++) {
		            System.out.print(evenArr[i] + " ");
		        }
		        System.out.println();

		        System.out.println("Odd numbers:");
		        for (int i = 0; i < oddCount; i++) {
		            System.out.print(oddArr[i] + " ");
		        }

		        scanner.close();
		    }
		

	}


