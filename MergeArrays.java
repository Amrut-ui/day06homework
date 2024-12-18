package day06homework;

public class MergeArrays {

	public static void main(String[] args) {
		

		    
		        int[] arr1 = {1, 2, 3};
		        int[] arr2 = {4, 5, 6};

		        int[] mergedArray = mergeArrays(arr1, arr2);

		        System.out.print("Merged array: ");
		        for (int i = 0; i < mergedArray.length; i++) {
		            System.out.print(mergedArray[i] + " ");
		        }
		    }

		    public static int[] mergeArrays(int[] arr1, int[] arr2) {
		        int len1 = arr1.length;
		        int len2 = arr2.length;
		        int[] mergedArray = new int[len1 + len2];

		        // Copy elements from arr1
		        for (int i = 0; i < len1; i++) {
		            mergedArray[i] = arr1[i];
		        }

		        // Copy elements from arr2
		        for (int i = 0; i < len2; i++) {
		            mergedArray[len1 + i] = arr2[i];
		        }

		        return mergedArray;
		    }
		

	}


