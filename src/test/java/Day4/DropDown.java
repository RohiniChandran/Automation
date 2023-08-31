package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

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
		 
		 WebElement filter=driver.findElement(By.cssSelector("select[data-test='product_sort_container']"));
		 Select s=new Select(filter);
		 List<WebElement> p=s.getOptions();
		 for(WebElement w:p)
		 {
			 System.out.println(w.getText());
		 }
		 //select using index value
		 //s.selectByIndex(1);
		 //select by visible text
		 //s.selectByVisibleText("Price(low to high)");
		 s.selectByValue("hilo");
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
