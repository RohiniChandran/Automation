package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn extends TestBase  {

	@FindBy(xpath="//input[contains(@id,'user-name')]")
	WebElement username;
	
	@FindBy(xpath="//input[contains(@name,'password')] ")
	WebElement password;
	
	@FindBy(xpath=" //input[contains(@value,'Login')]")
	WebElement login;
	 
	
	public LogIn()
	{
		PageFactory.initElements(driver, this);
	}
	public void initialize()
	{
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
	}
	public void teardown()
	{
		driver.close();
	}
	
	
}
