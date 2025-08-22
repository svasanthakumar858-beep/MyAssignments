package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	 public static void main(String[] args) {
	        // Launch the browser
	        ChromeDriver driver = new ChromeDriver();

	        // Load the url
	        driver.get("https://www.irctc.co.in/nget/train-search");

	        // maximize the browser
	        driver.manage().window().maximize();

	        // Get the address
	        String parentAddress = driver.getWindowHandle();
	        System.out.println("The parent address is: " + parentAddress);

	        // Click on the Click button
	        driver.findElement(By.xpath("//span[text()='Open']")).click();

	        Set<String> allAddress = driver.getWindowHandles();
	        System.out.println("The all address is: " + allAddress);

	        // Declare an empty list
	        List<String> address = new ArrayList<String>(allAddress);

	        String title = driver.getTitle();
	        System.out.println(title);

	        driver.switchTo().window(address.get(1));

	        String childTitle = driver.getTitle();
	        System.out.println(childTitle);

	        // close the window
	        driver.close();
	        // driver.quit();

	        driver.switchTo().window(address.get(0));

	        String title2 = driver.getTitle();
	        System.out.println(title2);
	    }

}
