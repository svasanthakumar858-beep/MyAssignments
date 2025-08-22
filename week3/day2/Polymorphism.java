package week3.day2;

public class Polymorphism {
	public void reportStep(String msg, String status) {
		System.out.println("message: " + msg);
		System.out.println("status: " + status);


	}
	
	public void repotStep(String msg, String status,String snap) {
		System.out.println("message: " +msg);
		System.out.println("status: " +status);
		System.out.println("snap:"+ snap);
		

	}
	
	public static void main(String[] args) {
		Polymorphism poly = new Polymorphism();
		poly.reportStep("Login successfully","pass");
		poly.repotStep("page not load", "Fail", "Snap not taken");
	}



	


}
