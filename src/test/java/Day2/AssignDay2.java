package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignDay2 {

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\AutomationTraining\\src\\test\\resources\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		//WebElement shortcuts=driver.findElement(By.linkText("Forgotten account?"));
		//shortcuts.click();
		//WebElement sign=driver.findElement(By.partialLinkText("Sign up"));
		//sign.click();
		String emailid="rohini14@gmail.com";
		String password="***************";
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("The title is "+title);
		System.out.println("The url is "+driver.getCurrentUrl());
		WebElement em=driver.findElement(By.id("email"));
		WebElement pd=driver.findElement(By.name("pass"));
		WebElement login=driver.findElement(By.name("login"));
		em.sendKeys(emailid);
		pd.sendKeys(password);
		login.click();
		driver.close();
		
		
		
		
		

	}

}
