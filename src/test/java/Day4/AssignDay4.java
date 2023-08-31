package Day4;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class AssignDay4 {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\AutomationTraining\\src\\test\\resources\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		WebElement dfilter=driver.findElement(By.cssSelector("select[id='day']"));
		Select s=new Select(dfilter);
		List<WebElement> d=s.getOptions();
		 for(WebElement wd:d)
		 {
			 System.out.println(wd.getText());
		 }
		 //s.selectByIndex(3);
		 //s.selectByVisibleText("3");
         //s.selectByValue("29");
		 WebElement mfilter=driver.findElement(By.cssSelector("select[title='Month']"));
		 Select s1=new Select(mfilter);
		 List<WebElement> m=s1.getOptions();
		 for(WebElement wm:m)
		 {
			 System.out.println(wm.getText());
		 }
		 //s1.selectByIndex(5);
		 //s1.selectByValue("12");
		 //s1.selectByVisibleText("Mar");
		 WebElement yrfilter=driver.findElement(By.cssSelector("select[title='Year']"));
		 Select s3=new Select(yrfilter);
		 //s3.selectByIndex(2);
		 //s3.selectByVisibleText("1996");
		 s3.selectByValue("2020");
		 
		 
		 
		 
		 
		 
		 
	}

}
