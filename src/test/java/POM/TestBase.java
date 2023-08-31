package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase 
{
	    //Global variable-Creating Variable Outside the Method can be used in any method
		//Local variable-Creating Variable Inside the Method only within the method
		public static WebDriver driver;
		public static void intialize()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\AutomationTraining\\src\\test\\resources\\chromedriver.exe" );
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		public static void geturl()
		{
			driver.get("https://www.saucedemo.com/");
		}

	
	
	
}
