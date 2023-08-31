package Day10;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreensh {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\AutomationTraining\\src\\test\\resources\\chromedriver.exe" );
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.saucedemo.com/");
		 WebElement un=driver.findElement(By.xpath("//input[contains(@id,'user-name')]"));
		 WebElement pd=driver.findElement(By.xpath("//input[contains(@name,'password')]"));
		 WebElement login=driver.findElement(By.xpath("//input[contains(@value,'Login')]"));
		 un.sendKeys("standard_user");
		 pd.sendKeys("secret_sauce");
		 login.click();
		 Thread.sleep(3000);
		 //Take screenshot interface
		 TakesScreenshot s=(TakesScreenshot)driver;
		 File source=s.getScreenshotAs(OutputType.FILE);
		 File destination=new File("C:\\Users\\dell\\eclipse-workspace\\AutomationTraining\\target\\TAKESCREENSHOTINTERFACE-01.png");
		 try
		 {
			FileHandler.copy(source, destination);
		 } 
		 catch (IOException e) 
		 {
	
			e.printStackTrace();
		 }
		 
		 
		 

	}

}
