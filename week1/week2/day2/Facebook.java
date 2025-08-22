package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Deepika");
		driver.findElement(By.name("lastname")).sendKeys("Sekar");
		driver.findElement(By.name("reg_email__")).sendKeys("shahani1108");
		driver.findElement(By.id("password_step_input")).sendKeys("Deepika@123");
WebElement element = driver.findElement(By.id("day"));
		Select dropdown=new Select(element );
		dropdown.selectByIndex(10);
		WebElement element2 = driver.findElement(By.id("month"));
Select dropdown2=new Select(element2);
dropdown2.selectByValue("8");
WebElement element3 = driver.findElement(By.id("year"));
		Select dropdown3=new Select( element3);
		dropdown3.selectByVisibleText("1997");
		driver.findElement(By.id("sex")).click();
	}

}
