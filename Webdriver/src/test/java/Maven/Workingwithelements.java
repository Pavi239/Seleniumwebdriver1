package Maven;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Workingwithelements {
	
	WebDriver driver;
	@BeforeTest
	  public void beforeTest() 
		
		
		{
		//Automatically downloads driver from the server and helps you to run the program//
		//whatever the version it automatically downloads the version and executes//
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com");
		driver.get("https://www.google.com");
		//driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
}
	@Test
	public void testcase() throws InterruptedException
	{
		WebElement link = driver.findElement(By.linkText("Gmail"));
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		//contextclick is rightclick//
		act.contextClick(link).build().perform();
		//act.sendKeys(Keys.ARROW_DOWN).build().perform();
		//Thread.sleep(3000);
		act.sendKeys(Keys.CONTROL,Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.CONTROL,Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
	}
	
	@AfterTest
	public void afterTest()
	{
		// driver.close();
	}
	
}
