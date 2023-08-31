package Day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationAssign 
{

	@Test(invocationCount=3,invocationTimeOut=1000)
	public void logintest()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\AutomationTraining\\src\\test\\resources\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
		String current=driver.getWindowHandle();
		WebElement un=driver.findElement(By.xpath("//input[contains(@id,'user-name')]"));
	    WebElement pd=driver.findElement(By.xpath("//input[contains(@name,'password')]"));
	    WebElement login=driver.findElement(By.xpath("//input[contains(@value,'Login')]"));
	    un.sendKeys("standard_user");
		pd.sendKeys("secret_sauce");
		login.click();
		driver.close();
	
	
}
	
	
}
