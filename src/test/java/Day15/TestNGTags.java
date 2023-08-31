package Day15;

import org.testng.annotations.Test;

public class TestNGTags {
	
	@Test(priority=1)
	public void tc1()
	{
		System.out.println("First Test Case Executed");
	}
	@Test(priority=2)
	public void tc2()
	{
		System.out.println("Second Test Case Executed");
	}
	@Test(priority=3)
	public void tc3()
	{
		System.out.println("Third Test Case Executed");
	}
	@Test(priority=5)
	public void tc4()
	{
		System.out.println("Fourth Test Case Executed");
	}
	@Test(priority=4)
	public void tc5()
	{
		System.out.println("Fifth Test Case Executed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
