package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class CreateAccount {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("DeepikaGTestLeaf");
		driver.findElement(By.name("description")).sendKeys("SeleniumAutomationTester");
		WebElement element = driver.findElement(By.name("industryEnumId"));
		Select dropdown=new Select(element );
	dropdown.selectByIndex(3);
	 WebElement element2 = driver.findElement(By.name("ownershipEnumId"));
	Select dropdown1=new Select( element2);
	dropdown1.selectByVisibleText("S-Corporation");
	WebElement element3 = driver.findElement(By.id("dataSourceId"));
	Select dropdown3=new Select(element3 );
		dropdown3.selectByValue("LEAD_EMPLOYEE");
		WebElement element4 = driver.findElement(By.id("marketingCampaignId"));
		Select dropdown4=new Select( element4);
		dropdown4.selectByIndex(6);
		WebElement element5 = driver.findElement(By.name("generalStateProvinceGeoId"));
	Select dropdown5=new Select(element5  );
	dropdown5.selectByValue("TX");
	driver.findElement(By.className("smallSubmit")).click();
		

	}

}
