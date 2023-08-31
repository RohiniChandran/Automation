package POM;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Runnerclass extends TestBase{
    LogIn l;
	
	@BeforeTest
	public void run()
	
	{
		intialize();
		geturl();
	}
	@Test
	public void main()
	{
		l=new LogIn();
		l.initialize();
	}
    @AfterTest
    public void close()
    {
    	l.teardown();
    }
}
