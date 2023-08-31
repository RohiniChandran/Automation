package Day11;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsAssign {

	public static void main(String[] args) {
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
		 System.out.println(driver.getCurrentUrl());
		 System.out.println(driver.getTitle());
		 WebElement linkedin=driver.findElement(By.xpath("//a[text()='LinkedIn']"));
		 linkedin.click();
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.visibilityOf(linkedin));
		 Set<String> allwindows=driver.getWindowHandles();
		 List<String> setofwindows=new ArrayList<String>(allwindows);
		 String linkedintab=setofwindows.get(1);
		 driver.switchTo().window(linkedintab);
		 driver.close();
         
		 
		 
		 
		 

	}

}
