package week3.day2;

public class OverloadingInJava {
	public void addNumbers(int a, int b) {
		System.out.println(a + b);
	}
	public void addNumbers(float a, float b) {
		System.out.println(a + b);
	}
	public void addNumbers(int a, int b,int c) {
		System.out.println(a + b + c);
	}
	public static void main(String[] args) {
		OverloadingInJava over=new OverloadingInJava();
		over.addNumbers(4, 3);
		over.addNumbers(2, 3 ,4);
		over.addNumbers(2.5f, 3.5f);
	}
	
	



}
