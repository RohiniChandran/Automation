package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectors {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\AutomationTraining\\src\\test\\resources\\chromedriver.exe" );
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
		 //TagName[attribute name='Attribute Value'];
		 WebElement un=driver.findElement(By.cssSelector("input[id='user-name']"));
		 WebElement pd=driver.findElement(By.cssSelector("input[type='password']"));
		 WebElement login=driver.findElement(By.cssSelector("input[data-test='login-button']"));
		 un.sendKeys("standard_user");
		 pd.sendKeys("secret_sauce");
		 login.click();
		 
		 
			

	}

}
