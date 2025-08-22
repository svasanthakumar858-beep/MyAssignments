package week3.day1;

import java.util.Arrays;

public class FindMissingElement {
	public static void main(String[] args) {
		  // Declare the array
      int[] arr = {1, 4, 3, 2, 6, 7};

      // Sort the array
      Arrays.sort(arr);

      // Loop through the array to find the missing number
      for (int i = 0; i < arr.length; i++) {
          // Check if the expected value is not equal to the array value
          if (arr[i] != i + 1) {
              // Print the missing number
              System.out.println("Missing Number is: " + (i + 1));
              break; // Exit after finding the first missing number
          }
      }

	}


}
