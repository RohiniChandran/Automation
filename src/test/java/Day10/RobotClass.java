package Day10;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\AutomationTraining\\src\\test\\resources\\chromedriver.exe" );
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.saucedemo.com/");
		 WebElement un=driver.findElement(By.xpath("//input[contains(@id,'user-name')]"));
		 WebElement pd=driver.findElement(By.xpath("//input[contains(@name,'password')]"));
		 WebElement login=driver.findElement(By.xpath("//input[contains(@value,'Login')]"));
		 un.sendKeys("standard_user");
		 pd.sendKeys("secret_sauce");
		 login.click();
		 Thread.sleep(3000);
		 //Robot class is used to take screenshots
		 Robot r=new Robot();
		 //Dimensions for screensize
		 Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
		 //Rectangle is for giving structure to image
		 Rectangle structure=new Rectangle(screensize);
		 //Buffered Image to capture image
		 BufferedImage bi=r.createScreenCapture(structure);
		 //Destination is created to save the file
		 File destination=new File("C:\\Users\\dell\\eclipse-workspace\\AutomationTraining\\target\\ROBOT-01.png");
		 
		 try {
			ImageIO.write(bi, "png", destination);
		} 
		 catch (IOException e) 
		 {
			e.printStackTrace();
		}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		

	}

}
