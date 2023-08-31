package Day16;

import org.testng.annotations.Test;

public class TestNGTagsDependency {
	@Test
	public void LoginTc()
	{
		System.out.println("LogIn Tc executed");
	    throw new RuntimeException();
	}
	@Test(dependsOnMethods="LoginTc")
	public void HomepageTc()
	{
		System.out.println("Homepage Tc executed");
	}
	@Test(dependsOnMethods="LoginTc")
	public void CheckoutTc()
	{
		System.out.println("CheckOut Tc executed");
	}
	@Test
	public void LogOutTc()
	{
		System.out.println("LogOut Tc executed");
	}


	
	
	
	
	

}
