package day06homework;
import java.util.Scanner;

public class Findminmax {

	public static void main(String[] args) {
		

		
		    
		        Scanner scanner = new Scanner(System.in);

		        int[] arr = new int[10];

		        System.out.println("Enter 10 array elements:");
		        for (int i = 0; i < 10; i++) {
		            arr[i] = scanner.nextInt();
		        }

		        int min = arr[0];
		        int max = arr[0];

		        for (int i = 1; i < 10; i++) {
		            if (arr[i] < min) {
		                min = arr[i];
		            }
		            if (arr[i] > max) {
		                max = arr[i];
		            }
		        }

		        System.out.println("Minimum number: " + min);
		        System.out.println("Maximum number: " + max);

		        scanner.close();
		    }
		

	}


