package week3.day1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		if(text1.length()!=text2.length()) {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
			return;
		}
char[] Array1 = text1.toCharArray();	
char[] Array2 = text2.toCharArray();
Arrays.sort(Array1);
Arrays.sort(Array2);
if(Arrays.equals(Array1, Array2)) {
System.out.println("The given strings are Anagram");
}
else {
System.out.println("The given strings are not an Anagram");
}
}

}
