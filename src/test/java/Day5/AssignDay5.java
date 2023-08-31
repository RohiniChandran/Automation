package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignDay5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\AutomationTraining\\src\\test\\resources\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		String emailid="raviravichandrank2@gmail.com";
		String password="3355RAVI";
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); 
		WebElement email=driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		WebElement pd=driver.findElement(By.xpath("//input[contains(@name,'pass')]"));
		WebElement login=driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		email.sendKeys(emailid);
		pd.sendKeys(password);
		login.click();
		//WebElement forgotaccount=driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
		//forgotaccount.click();

	}

}
