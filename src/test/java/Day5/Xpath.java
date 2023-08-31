package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		//Absolute xpath-static xpath
		//By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")
		//RelativeXpath
		//Contains-TagName[contains(@attributename,'value')]
        //Text-TagName[text()='Text from DOMSTRUCTURE']
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\AutomationTraining\\src\\test\\resources\\chromedriver.exe" );
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
		 WebElement un=driver.findElement(By.xpath("//input[contains(@id,'user-name')]"));
		 WebElement pd=driver.findElement(By.xpath("//input[contains(@name,'password')]"));
		 WebElement login=driver.findElement(By.xpath("//input[contains(@value,'Login')]"));
		 un.sendKeys("standard_user");
		 pd.sendKeys("secret_sauce");
		 login.click();
		 WebElement twit=driver.findElement(By.xpath("//a[text()='Twitter']"));
		 twit.click();
		
		
		
		
		
		
		
		
		
	}

}
