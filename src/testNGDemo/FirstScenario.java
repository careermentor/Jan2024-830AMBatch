package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstScenario 
{

	@Test(priority=1)
	public void first_testcase()
	{
		System.out.println("This is first test case");
	}
	
	@Test(priority=2)
	public void second_testcase()
	{
		System.out.println("This is second test case");
	}
	@Test(priority=-2)
	public void third_testcase()
	{
		System.out.println("This is third test case");
		Assert.assertEquals("Hello", "Hello");
	}
	
	@Test
	public void forth_testcase()
	{
		System.out.println("This is forth test case");
	}
	
	@Test(priority=-1)
	public void fifth_testcase()
	{
		System.out.println("This is fifth test case");
	}
	
	@Test(priority=6)
	public void sixth_testcase()
	{
		System.out.println("This is sixth test case");
	}
	
}
