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

public class Newtest {
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
		//getTitle is to fetch the title of the webpage store it in string variable called Title//
		//String Title = driver.getTitle();
		//String Url = driver.getCurrentUrl();
		//System.out.println(Title + "  "+Url);
		//Title is expected result orangehrm is actual result if not same test will fail//
		//Assert.assertEquals(Title, "OrangeHRM");
		//Assert.assertEquals(Url,"https://opensource-demo.orangehrmlive.com/");
		
		
		
		
	  }
  
	@Test
  public void f() throws InterruptedException {
		
		//Finding element by name ands sending values to application//
				driver.findElement(By.name("txtUsername")).sendKeys("Admin");
				 //if i want to fetch the data(what is stored) from the application //value is an attribute//values value is admin//
				String username = driver.findElement(By.name("txtUsername")).getAttribute("value");
				 System.out.println(username);
				 Assert.assertEquals(username,"Admin");
			       String password = driver.findElement(By.id("txtPassword")).getAttribute("value");
			       System.out.println(password);
			       Assert.assertEquals(password,"admin123");
			        //Assert.assertEquals("admin123","admin123");
			       
			       //here in the below line we are fetching name of the button that is login//
			       String login =  driver.findElement(By.id("btnLogin")).getAttribute("value");
			       System.out.println(login);
			      // Assert.assertEquals(login,"LOGIN");
			        Thread.sleep(3000);
			        driver.findElement(By.id("welcome")).click();
			        Thread.sleep(3000);
				String Title=driver.getTitle();
				if (Title.equalsIgnoreCase(Title))
				{
					driver.findElement(By.id("welcome")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
				}
				else
				{
					System.out.println("It is not same ");
				}
			}
			
			@Test(enabled=false)
			public void testcase()
		{
				String Name="pavi";
				//if i want to store a element in a variable//
				
				//when i want to store a element in variable use datatype called webelement//
			WebElement Un=driver.findElement(By.xpath("//*[@name='userName']"));
		if(Un.isEnabled())
		{
//				//here i am empty the username box//
			Un.clear();
//				//send the value//un is a variable it stores the entire element username//
//				//so instead of using this whole we just stored and use that variable Un and send keys give username as pavi//
			
			Un.sendKeys("pavi");
			}
			
			//if the data what is sent is visible//displayed if yes then get the value print the value//
			if(Un.isDisplayed())
			{
				//here i am getting that value pavi//
				System.out.println(Un.getAttribute("Value"));
			}
				
			}
			
			@Test(enabled=false)
			public void testcase1() throws InterruptedException
			{
				
				driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("sunil");
				driver.findElement(By.xpath("//*[@name='password']")).sendKeys("sunil");
				driver.findElement(By.xpath("//*[@name='submit']")).click();
				//once the login is done assert on login successfull//
				
						String hd=driver.findElement(By.xpath("//tbody/tr/td/h3")).getText();
						Assert.assertEquals("Login Successfully", hd);
						
						//linktext is the locator//
						driver.findElement(By.linkText("Flights")).click();
						Thread.sleep(3000);
						//partiallink text locator//
					//	driver.findElement(By.partialLinkText("Car")).click();
						driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
						WebElement dd = driver.findElement(By.name("passCount"));
						Select sell = new Select(dd);
						Thread.sleep(3000);
						//This is basically select the first value in an element by using visible text//
						sell.selectByVisibleText("1");
						Thread.sleep(3000);
						//This is based on index//it will select 4//
						sell.selectByIndex(3);
						Thread.sleep(3000);
						sell.selectByValue("2");
						WebElement dd1 = driver.findElement(By.name("fromPort"));
						Select sel2 = new Select(dd1);
						//Get all the values from the drop down//
						//If the value is more then we use list of webelement//if i am storing only one value then it is webelement// 
						List<WebElement>values= sel2.getOptions();
						//i have to get the size of value//
						System.out.println(values.size());
						//if i to print the values//i have to use for loop//
						for(int i=0;i<values.size();i++)
						{
							System.out.println(values.get(i).getText());
						}
						//it will select the value from dropdown//select by index is by number it select//
						sel2.selectByIndex(2);
						//selectByvalue i by value what we have give//
						//sel2.selectByValue("London");
						//Whatever i selected i have to get that value//and store it in variable//
						//THis below lines are fetch the value from dropdown//
						WebElement first = sel2.getFirstSelectedOption();
						System.out.println(first.getAttribute("value"));
						
			}
		 
			@Test(enabled=false)
			public void testcase4() throws InterruptedException
			{
				driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				driver.findElement(By.id("btnLogin")).click();
				Thread.sleep(3000);
				//There is a test case how many visible links are present after login fetch there names and print it//
				//meaning of tag name a this means link//
				//findelement will find one element//
				//findelements this will automatically find all the element//its a list of web elements//
				//when u have two or more elements(multiple elements) with same attributes we use "find elements"//
				//href is a attribute and a is a tagname//
				List<WebElement> link = driver.findElements(By.tagName("a"));
				//Total no of links//below line will print the no of links//
				System.out.println("Total number of links are "+link.size());
				//if i to print the values//i have to use for loop//
				//THis will go to all visible links and print the name of the visible links//
				//In o/p we will getting blank spaces those are all hidden links//
//				for(int i=0;i<link.size();i++)
//				{
//					System.out.println(link.get(i).getText());
//				}
				//for Enhanced loop//we will use for/for enhanced loop//
				//variable link will assigned to e element//
				for(WebElement e:link)
				{
					//its getting each text of the link and store it in string variable called eachlink and print this links////its printing each link//
					String eachlink = e.getText();
					System.out.println(eachlink);
				}
				//Bigger link use partiallink text//if its a smaller link use linktext//
//				driver.findElement(By.partialLinkText("Welcome")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.linkText("Logout")).click();
				driver.findElement(By.linkText("PIM")).click();
				//i want to go back to the previous page//it will go default dashboard//
//				driver.navigate().back();
//				//i want to go forward//it was get back to PIM page//
//				driver.navigate().forward();
//				//if i want to refresh my page//
//				driver.navigate().refresh();
//				//i want to navigate to a different URL//
//				driver.navigate().to("http://www.google.com");
//				//driver.get/to get URL//
//				//driver.navigate.to//to get URL//
				//Actions//It is a class which contains some methods mouseover//move to elements//
				//Move to particular element//
				Actions act = new Actions(driver);
				//Whatever the element we want to move we store it in the webelement variable//
				WebElement clink = driver.findElement(By.linkText("Configuration"));
				//.build is to compile and perform//
				act.moveToElement(clink).build().perform();
				//Go to down the link//
				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				//I want to enter from keyboard//
				act.sendKeys(Keys.ENTER).build().perform();
				act.sendKeys(Keys.RETURN).build().perform();
			}
			
			@Test(enabled=false)
			public void testcase5() throws InterruptedException
			{
				driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				driver.findElement(By.id("btnLogin")).click();
				Thread.sleep(3000);
				Actions act = new Actions(driver);
				//here we want to go to market place by using tab key//
//				act.sendKeys(Keys.TAB).build().perform();
//				act.sendKeys(Keys.TAB).build().perform();
//				act.sendKeys(Keys.TAB).build().perform();
//				act.sendKeys(Keys.TAB).build().perform();
//				act.sendKeys(Keys.ENTER).build().perform();
				//other way of doing//
				act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.RETURN).perform();
			}
			
			@Test
			public void testcase6() throws InterruptedException
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

  
  

  



