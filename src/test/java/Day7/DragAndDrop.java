package Day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\AutomationTraining\\src\\test\\resources\\chromedriver.exe" );
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		 Actions a=new Actions(driver);
		 List<WebElement> drag=driver.findElements(By.xpath("//div[contains(@id,'dropContent')]/div"));
		 List<WebElement> drop=driver.findElements(By.xpath("//div[contains(@id,'countries')]/div"));
		 for(WebElement e:drag)
		 {
			if(e.getText().endsWith("Washington"))
			{
				for(WebElement d:drop)
				{
					if(d.getText().equals("United States"))
					{
						a.dragAndDrop(e, d).build().perform();
						break;
					}
				}
			}
		 }
		 for(WebElement e:drag)
		 {
			if(e.getText().endsWith("Oslo"))
			{
				for(WebElement d:drop)
				{
					if(d.getText().equals("Italy"))
					{
						a.dragAndDrop(e, d).build().perform();
						break;
					}
				}
			}
		 }
		 for(WebElement e:drag)
		 {
			if(e.getText().endsWith("Stockholm"))
			{
				for(WebElement d:drop)
				{
					if(d.getText().equals("Spain"))
					{
						a.dragAndDrop(e, d).build().perform();
						break;
					}
				}
			}
		 }
		 for(WebElement e:drag)
		 {
			if(e.getText().endsWith("Seoul"))
			{
				for(WebElement d:drop)
				{
					if(d.getText().equals("Sweden"))
					{
						a.dragAndDrop(e, d).build().perform();
						break;
					}
				}
			}
		 }
		 for(WebElement e:drag)
		 {
			if(e.getText().endsWith("Rome"))
			{
				for(WebElement d:drop)
				{
					if(d.getText().equals("Denmark"))
					{
						a.dragAndDrop(e, d).build().perform();
						break;
					}
				}
			}
		 }
		 for(WebElement e:drag)
		 {
			if(e.getText().endsWith("Madrid"))
			{
				for(WebElement d:drop)
				{
					if(d.getText().equals("South Korea"))
					{
						a.dragAndDrop(e, d).build().perform();
						break;
					}
				}
			}
		 }
		 for(WebElement e:drag)
		 {
			if(e.getText().endsWith("Copenhagen"))
			{
				for(WebElement d:drop)
				{
					if(d.getText().equals("Norway"))
					{
						a.dragAndDrop(e, d).build().perform();
						break;
					}
				}
			}
		 }
	}

}
