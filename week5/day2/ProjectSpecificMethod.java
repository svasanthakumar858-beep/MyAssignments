package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class ProjectSpecificMethod {
	public ChromeDriver driver;
    @Parameters({"param1", "param2", "param3"})
    @BeforeMethod
    public void precondition(String p1,String p2,String p3) {
    	// 1.Launching the Browser in guest mode
    			ChromeOptions options = new ChromeOptions();
    			options.addArguments("guest");

    			// Launch the browser
    			driver = new ChromeDriver(options);
				// Maximizing browser window
    			driver.manage().window().maximize();
    			// Loading the url which is passed as the parameter p1
    			driver.get(p1);
				// adding implicit wait to ensure all the web page contents are loaded
    			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    			// Entering username and password which were passed as parameters p2 and p3 respectively
    			driver.findElement(By.id("username")).sendKeys(p2);
    			driver.findElement(By.id("password")).sendKeys(p3);
				// clicking the Login button
    			driver.findElement(By.xpath("//div[@id='theloginform']//input[@id='Login']")).click();

	}
    @AfterMethod
    public void postcondition() {
		driver.close();

	}


}
