package week3.day1;

public class CountCharacter {
	public static void main(String[] args) {
		  // Input String
      String input = "TestLeaf";

      // Character to count
      char target = 'e';

      // Initialize count to 0
      int count = 0;

      // Convert String to character array
      char[] chars = input.toCharArray();

      // Loop through each character
      for (int i = 0; i < chars.length; i++) {
          // Compare with target character
          if (chars[i] == target) {
              count++; // Increment count if match found
          }
      }

      // Print the count
      System.out.println("The character '" + target + "' occurs " + count + " times.");

	}


}
