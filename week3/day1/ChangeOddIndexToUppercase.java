package week3.day1;

public class ChangeOddIndexToUppercase {
	public static void main(String[] args) {
		  // Input String
      String input = "changeme";

      // Convert String to character array
      char[] chars = input.toCharArray();

      // Loop through each character
      for (int i = 0; i < chars.length; i++) {
          // Check if index is odd
          if (i % 2 != 0) {
              // Convert to uppercase
              chars[i] = Character.toUpperCase(chars[i]);
          }
      }

      // Convert back to String and print
      String result = new String(chars);
      System.out.println(result);

	}

}
