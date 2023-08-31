package Day14;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGArchitech {
	@BeforeMethod
	//To clear all cookies it can be deleted
	//It will Execute before all out tags/Annotations[1st stage]
	public void deletecookies()
	{
		System.out.println("2nd step cookies deleted");
	}
	@BeforeTest
	//It will Execute Before@test[2nd stage]
	public void launchbrowser()
	{
		System.out.println("1st step browser launched");
	}
	@Test
	//It is in 3rd stage
	public void test1()
	{
		System.out.println("3rd step validation of login page ");
	}
	@AfterMethod
	//It will Execute after@Test[4th stage]
	public void generatereport()
	{
		System.out.println("4th step report generated");
	}
	@AfterTest
	//Last Part in our Execution[5th stage]
	public void closebrowser()
	{
		System.out.println("5th Browser closed");
	}

}
