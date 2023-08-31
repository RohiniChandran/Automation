package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\AutomationTraining\\src\\test\\resources\\chromedriver.exe" );
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--headless=new");
        WebDriver driver=new ChromeDriver(co);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement un=driver.findElement(By.cssSelector("input[id='user-name']"));
		WebElement pd=driver.findElement(By.cssSelector("input[type='password']"));
		WebElement login=driver.findElement(By.cssSelector("input[data-test='login-button']"));
		un.sendKeys("standard_user");
		pd.sendKeys("secret_sauce");
		login.click();
		String url="https://www.saucedemo.com/inventory.html";
		String cuurl=driver.getCurrentUrl();
		if(url.equals(cuurl))
		{
			System.out.println("LogIn Successfull");
		}
		else
		{
			System.out.println("LogIn Failed");
		}
		
		
		
		
		
		
		
		
	}

}
