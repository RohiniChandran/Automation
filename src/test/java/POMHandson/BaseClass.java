package POMHandson;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
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
