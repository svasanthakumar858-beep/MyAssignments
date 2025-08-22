package week2.day1;

public class Palindrome {
	 public static void main(String[] args)
	    {
	        int input = 121; 
	        int output = 0;
	        int originalInput = input;

	        
	        for (int i = input; i > 0; i = i / 10) {
	            int rem = i % 10; 
	            output = output * 10 + rem; 
	        }

	      
	        if (originalInput == output) {
	            System.out.println("It is a Palindrome");
	        } else {
	            System.out.println("It is not a Palindrome");
	        }
	    }
	


	// TODO Auto-generated method stub

}
