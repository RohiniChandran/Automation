package Day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\AutomationTraining\\src\\test\\resources\\chromedriver.exe" );
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		 WebElement table=driver.findElement(By.xpath("//table[contains(@id,'customers')]"));
		 List<WebElement> column=driver.findElements(By.xpath("//table[contains(@id,'customers')]/tbody/tr/th"));
		 List<WebElement> th=driver.findElements(By.xpath("//table[contains(@id,'customers')]/tbody/tr/th"));
		 List<WebElement> rowdatas=driver.findElements(By.xpath("//table[contains(@id,'customers')]/tbody/tr/td"));
		 System.out.println("*********Column Header************");
		 for(WebElement w:th)
		 {
			 System.out.println(w.getText());
		 }
		 System.out.println("************Row datas*************");
		 for(WebElement e:rowdatas)
		 {
			 System.out.println(e.getText());
			 
		 }
		 System.out.println("********************");
		 for(int i=1;i<=column.size();i++)
		 {
			 List<WebElement> columnvalues=driver.findElements(By.xpath("//table[contains(@id,'customers')]/tbody/tr/th["+i+"]"));
			 for(WebElement c:columnvalues)
			 {
				 List<WebElement> rowvalues=driver.findElements(By.xpath("//table[contains(@id,'customers')]/tbody/tr/td["+i+"]")); 
				 for(WebElement r:rowvalues)
				 {
					 System.out.println(c.getText());
					 System.out.println(r.getText());
					 System.out.println("*************************");
				 }
			 }
			 
		 }
		 
		 
		 
		 
		 
		 
		 
	}

}
