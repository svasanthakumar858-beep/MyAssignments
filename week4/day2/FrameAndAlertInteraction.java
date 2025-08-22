package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FrameAndAlertInteraction {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.tagName("button")).click();
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Vasanth");
		promptAlert.accept();
	    String action = driver.findElement(By.id("demo")).getText();
		if (action.contains("cancelled")) {
			System.out.println("Cancel button clicked");
		} else
			System.out.println("Ok button clicked");
	}


}
