package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\AutomationTraining\\src\\test\\resources\\chromedriver.exe" );
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
		 String username="standard_user";
		 String password="secret_sauce";
		 driver.manage().window().maximize();
		 //Locators
		 //ID-user-name
		 //Name-Password
		 //Class
		 //Link Text-LinkedIn
		 //Partial Link Text-Twit
		 //CSS selectors
		 //X path
		 WebElement un=driver.findElement(By.id("user-name"));
		 WebElement pd=driver.findElement(By.name("password"));
		 WebElement login=driver.findElement(By.name("login-button"));
		 un.sendKeys(username);
		 pd.sendKeys(password);
		 login.click();
		 
		 //WebElement linkedin=driver.findElement(By.linkText("LinkedIn"));
		 //linkedin.click();
		 WebElement lab=driver.findElement(By.partialLinkText("Sauce "));
		 lab.click();
		 driver.quit();
		 
		 
		 
		 
		 
		 
		 
		 
         
	}

}
