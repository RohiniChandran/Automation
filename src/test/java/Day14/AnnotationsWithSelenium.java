package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsWithSelenium {
	WebDriver driver;
	@BeforeTest
	public void initializebrowser()
	{
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\AutomationTraining\\src\\test\\resources\\chromedriver.exe" );
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	}
	@Test
	public void logintest()
	{
		 driver.get("https://www.saucedemo.com/");
		 String current=driver.getWindowHandle();
		 WebElement un=driver.findElement(By.xpath("//input[contains(@id,'user-name')]"));
		 WebElement pd=driver.findElement(By.xpath("//input[contains(@name,'password')]"));
		 WebElement login=driver.findElement(By.xpath("//input[contains(@value,'Login')]"));
		 un.sendKeys("standard_user");
		 pd.sendKeys("secret_sauce");
		 login.click();
		 try 
		 {
			Thread.sleep(5000);
		 } 
		 catch (InterruptedException e) 
		 {
		
			e.printStackTrace();
		 }
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
