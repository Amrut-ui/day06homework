package day06homework;
import java.util.Scanner;
public class FindingArray {

	public static void main(String[] args) {
		

		

		   
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the size of the array: ");
		        int size = scanner.nextInt();

		        int[] array = new int[size];

		        System.out.println("Enter the array elements:");
		        for (int i = 0; i < size; i++) {
		            array[i] = scanner.nextInt();
		        }

		        System.out.print("Enter the element to search: ");
		        int searchElement = scanner.nextInt();

		        int index = searchElement(array, searchElement);

		        if (index != -1) {
		            System.out.println("Element " + searchElement + " found at index " + index);
		        } else {
		            System.out.println("Element " + searchElement + " not found in the array.");
		        }

		        scanner.close();
		    }

		    public static int searchElement(int[] arr, int element) {
		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] == element) {
		                return i; // Return the index if element is found
		            }
		        }
		        return -1; // Return -1 if element is not found
		    }
		

	}


