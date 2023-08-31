package Day6;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionslass {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\AutomationTraining\\src\\test\\resources\\chromedriver.exe" );
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		 //create objects for action class
		 Actions a=new Actions(driver);
		 WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
		 a.contextClick(rightclick).build().perform();
		 List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'context-menu-list context-menu-root')]/li"));
		 for(WebElement e:options)
		 {
			 System.out.println(e.getText());
		
			 
		 if(e.getText().equals("Edit"))
		 {
			 e.click();
		 }
	 }
		 driver.switchTo().alert().accept();
		 

	}

}