package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {
    public static void main(String[] args) {
        // Set up ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");

        // Launch Chrome
        WebDriver driver = new ChromeDriver();
        driver.get("https://leafground.com/table");

        // Example: locate element using XPath from DevTools
        WebElement nameColumn = driver.findElement(By.xpath("//th[@aria-label='Name: activate to sort column ascending']"));
        System.out.println("Column text: " + nameColumn.getText());

        // Close browser
        driver.quit();
    }
}
