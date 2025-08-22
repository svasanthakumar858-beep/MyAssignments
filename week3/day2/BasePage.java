package week3.day2;

public class BasePage {
	 void findElement() {
		 System.out.println("Element found");
	 }
void clickElement() {
	System.out.println("Element clicked");
}
void enterText() {
	System.out.println("Text entered");
}
void performCommonTasks() {
	System.out.println("CommonTasks performed");
}
}
 class LoginPage extends BasePage{
	 void performCommonTasks() {
		 System.out.println("CommonTasks performed");
	 }

}
