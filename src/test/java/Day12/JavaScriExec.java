package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriExec {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\AutomationTraining\\src\\test\\resources\\chromedriver.exe" );
		 WebDriver driver=new ChromeDriver();
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 driver.manage().window().maximize();
		 driver.get("https://www.saucedemo.com/");
		 String current=driver.getWindowHandle();
		 WebElement un=driver.findElement(By.xpath("//input[contains(@id,'user-name')]"));
		 WebElement pd=driver.findElement(By.xpath("//input[contains(@name,'password')]"));
		 WebElement login=driver.findElement(By.xpath("//input[contains(@value,'Login')]"));
		 un.sendKeys("standard_user");
		 pd.sendKeys("secret_sauce");
		 login.click();
		 //js.executeScript("window.scrollTo(0,500)");
		 WebElement fl=driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']"));
		 js.executeScript("arguments[0].scrollIntoView(true)",fl);

	}

}
