package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstScenario8 
{

	@Test(groups="Sanity")
	public void first_testcase()
	{
		System.out.println("This is first test case");
	}
	
	@Test
	public void second_testcase()
	{
		System.out.println("This is second test case");
	}
	@Test
	public void third_testcase()
	{
		System.out.println("This is third test case");
	}
	
	@Test(groups="Regression")
	public void forth_testcase()
	{
		System.out.println("This is forth test case");
	}
	
	@Test
	public void fifth_testcase()
	{
		System.out.println("This is fifth test case");
		Assert.assertEquals("Hello", "Hello1");
	}
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("This is sixth test case");
	}
	
}
