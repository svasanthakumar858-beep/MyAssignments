package week3.day1;

import java.util.Arrays;

public class FindDups {
	public static void main(String[] args) {
	    int[] num = {2, 5, 7, 7, 5, 9, 2, 3};

        // Sort the array first
        Arrays.sort(num);

        System.out.println("Duplicate values in the array:");
        // Iterate and find duplicates
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] == num[i + 1]) {
                // To avoid printing the same duplicate multiple times
                if (i == 0 || num[i] != num[i - 1]) {
                    System.out.println(num[i]);
                }
            }
        }

	}


}
