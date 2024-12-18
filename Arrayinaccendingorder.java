package day06homework;
import java.util.Scanner;

public class Arrayinaccendingorder {

	public static void main(String[] args) {
		

		

		    
		        Scanner scanner = new Scanner(System.in);

		        int[] arr = new int[5];

		        System.out.println("Enter 5 array elements:");
		        for (int i = 0; i < 5; i++) {
		            arr[i] = scanner.nextInt();
		        }

		        // Sort the array in ascending order
		        for (int i = 0; i < 5; i++) {
		            for (int j = i + 1; j < 5; j++) {
		                if (arr[i] > arr[j]) {
		                    // Swap elements if they are in the wrong order
		                    int temp = arr[i];
		                    arr[i] = arr[j];
		                    arr[j] = temp;
		                }
		            }
		        }

		        System.out.println("Sorted array in ascending order:");
		        for (int i = 0; i < 5; i++) {
		            System.out.print(arr[i] + " ");
		        }

		        scanner.close();
		    }
		

	}


