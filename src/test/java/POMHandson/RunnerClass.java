package POMHandson;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.LogIn;

public class RunnerClass extends BaseClass {
	
	LogInHandle l;
	@BeforeTest
	public void run()
	{
		intialize();
	    geturl();
	}
	@Test
	public void main()
	{
		l=new LogInHandle();
		l.initialize();
		l.handle();
	}
	@AfterTest
    public void close()
    {
    	l.tear();
    }

}
