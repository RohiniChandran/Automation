package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basetest {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\AutomationTraining\\src\\test\\resources\\chromedriver.exe" );
		 //webdriver is an interface
		 WebDriver driver=new ChromeDriver();
		 //To launch website
		 driver.get("https://www.saucedemo.com/");
		//To minimize the screen
		 driver.manage().window().minimize();
		 //To maximize the screen
		 driver.manage().window().maximize();
		 //To get title
		 String title=driver.getTitle();
		 System.out.println(title);
		 //To get url
		 System.out.println(driver.getCurrentUrl());
		 //To close
		 driver.close();
		 
		 
		 
	}

}
