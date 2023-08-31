package Day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\AutomationTraining\\src\\test\\resources\\chromedriver.exe" );
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
		 WebElement un=driver.findElement(By.xpath("//input[contains(@id,'user-name')]"));
		 WebElement pd=driver.findElement(By.xpath("//input[contains(@name,'password')]"));
		 WebElement login=driver.findElement(By.xpath("//input[contains(@value,'Login')]"));
		 un.sendKeys("standard_user");
		 pd.sendKeys("secret_sauce");
		 login.click();
		 System.out.println(driver.getCurrentUrl());
		 System.out.println(driver.getTitle());
		 String current=driver.getWindowHandle();
		 WebElement linkedin=driver.findElement(By.xpath("//a[text()='LinkedIn']"));
		 linkedin.click();
		 Set<String> allwindows=driver.getWindowHandles();
		 //List is used to get windows index as we don't have get method in set
		 List<String> setofwindows=new ArrayList<String>(allwindows);
		 String linkedintab=setofwindows.get(1);
		 driver.switchTo().window(linkedintab);
		 Thread.sleep(5000);
		 driver.close();
		 driver.switchTo().window(current);
		 
		 WebElement twitter =driver.findElement(By.xpath("//a[text()='Twitter']"));
		 twitter.click();
		 Set<String> allwindows1=driver.getWindowHandles();
		 List<String> setofwindows1=new ArrayList<String>(allwindows1);
		 String twittab=setofwindows1.get(1);
		 driver.switchTo().window(twittab);
		 Thread.sleep(5000);
		 driver.close();
		 driver.switchTo().window(current);
		 
		 
		 
		 
		 
		
		 
	}

}
