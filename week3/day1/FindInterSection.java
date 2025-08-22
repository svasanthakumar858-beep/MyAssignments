package week3.day1;

public class FindInterSection {
	public static void main(String[] args) {
		  // Declare first array
      int[] a = {3, 2, 1, 4, 6, 7};
      
      // Declare second array
      int[] b = {1, 2, 8, 4, 9, 7};
      
      System.out.println("Matching elements are:");

      // Outer loop: iterate over each element in array 'a'
      for (int i = 0; i < a.length; i++) {
          // Inner loop: iterate over each element in array 'b'
          for (int j = 0; j < b.length; j++) {
              // Compare elements
              if (a[i] == b[j]) {
                  // Print the matching element
                  System.out.println(a[i]);
                  break; // optional: avoid duplicate prints if 'b' has duplicates
              }
          }
      }

	}


}
