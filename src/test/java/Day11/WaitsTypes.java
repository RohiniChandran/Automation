package Day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsTypes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\AutomationTraining\\src\\test\\resources\\chromedriver.exe" );
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.saucedemo.com/");
		 //Implicit Wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement un=driver.findElement(By.xpath("//input[contains(@id,'user-name')]"));
		 WebElement pd=driver.findElement(By.xpath("//input[contains(@name,'password')]"));
		 WebElement login=driver.findElement(By.xpath("//input[contains(@value,'Login')]"));
		 un.sendKeys("standard_user");
		 pd.sendKeys("secret_sauce");
		 login.click();
		 //Explicit Wait
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOf(login));

	}

}
