package POMHandson;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInHandle extends BaseClass{
	@FindBy(xpath="//input[contains(@id,'user-name')]")
	WebElement username;
	@FindBy(xpath="//input[contains(@name,'password')]")
	WebElement password;
	@FindBy(xpath=" //input[contains(@value,'Login')]")
	WebElement login;
	@FindBy(xpath="//a[text()='LinkedIn']")
	WebElement linkedin;
	String current;
	
	public LogInHandle()
	{
		PageFactory.initElements(driver, this);
	}
	public void initialize()
	{
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		linkedin.click();
	}
	public static void handle()
	{
		String current=driver.getWindowHandle();
		Set<String> allwindows=driver.getWindowHandles();

		List<String> setofwindows=new ArrayList<String>(allwindows);
		 String linkedintab=setofwindows.get(1);
		 driver.switchTo().window(linkedintab);
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   	}
	public void tear()
	{
		 driver.close();
		 driver.switchTo().window(current);
	}
	
	
	
	

}
